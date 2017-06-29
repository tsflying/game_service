package com.rxqp.service.impl;

import com.rxqp.dao.IUserDao;
import com.rxqp.model.User;
import com.rxqp.service.IUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserService implements IUserService {

	@Resource
	IUserDao userDao;

	@Override
	public User getUser(Integer id) {
		User user = new User();
		user.setId(id);
		return userDao.query(user);
	}

	@Override
	public Integer addUser(User user) {
		int re = userDao.save(user);
//		boolean isSuccess = false;
//		if(re > 0){
//			isSuccess = true;
//		}else{
//			isSuccess = false;
//		}
		return re;
	}

	@Override
	public User getUserByOpenid(String openid){
		User user = new User();
		user.setOpenid(openid);
		List<User> users = userDao.queryByOpenid(user);
		if (CollectionUtils.isNotEmpty(users))
			return users.get(0);
		else
			return null;
	}

	@Override
	public boolean deductionRoomCards(Integer id, Integer cards) {
		User user = new User();
		user.setId(id);
		user.setDeductionCards(cards);
		user.setUpdateTime(new Date());
		int re = userDao.deductionCards(user);
		if (re > 0){
			return true;
		}
		return false;
	}

	@Override
	public boolean addRoomCards(Integer id, Integer cards) {
		User user = new User();
		user.setId(id);
		user.setAddCards(cards);
		user.setUpdateTime(new Date());
		int re = userDao.addCards(user);
		if (re > 0){
			return true;
		}
		return false;
	}
}

package com.rxqp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rxqp.dao.IUserDao;
import com.rxqp.model.User;
import com.rxqp.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Resource
	IUserDao userDao;

	@Override
	public User getUser(Long id) {
		User user = new User();
		user.setId(id);
		return userDao.query(user);
	}

}

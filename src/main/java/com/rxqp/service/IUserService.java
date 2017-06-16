package com.rxqp.service;

import com.rxqp.model.User;

public interface IUserService {

	public User getUser(Integer id);

	public Integer addUser(User user);

	public User getUserByOpenid(String openid);

	public boolean deductionRoomCards(Integer id,Integer cards);
}

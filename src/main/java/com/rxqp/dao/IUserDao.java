package com.rxqp.dao;

import com.rxqp.model.User;

import java.util.List;

public interface IUserDao {

	User query(User user);

	List<User> queryByOpenid(User user);

	int save(User user);

	boolean update(User user);

	boolean delete(int id);

	List<User> queryAll();

	int deductionCards(User user);

	int addCards(User user);
}

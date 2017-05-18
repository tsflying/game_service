package com.rxqp.dao;

import java.util.List;

import com.rxqp.model.User;

public interface IUserDao {

	User query(User user);

	int save(User user);

	boolean update(User user);

	boolean delete(int id);

	List<User> queryAll();
}

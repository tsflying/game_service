package com.rxqp.service;

import com.rxqp.model.User;

public interface IUserService {

	public User getUser(Integer id);

	public Integer addUser(User user);

	public User getUserByOpenid(String openid);

	public boolean deductionRoomCards(Integer id,Integer cards);

	public boolean addRoomCards(Integer id,Integer cards);

    boolean addRoomCardsByopenid(String openid, Integer cards);

    public boolean deductionRoomCardsByUnionid(String unionid,Integer cards);

    public  boolean addRoomCardsByUnionid(String unionid,Integer cards);
}

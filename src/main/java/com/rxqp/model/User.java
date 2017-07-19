package com.rxqp.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("User")
public class User {

	private Integer id;
	private String name;
	private String openid;
	private String imgUrl;
	private Integer cardNum;
	private Integer deductionCards;//要扣减的房卡数
	private Integer addCards;//要添加的房卡数
	private Date updateTime;
	private Date lastLoginTime;
	private String unionid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getCardNum() {
		return cardNum;
	}

	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getDeductionCards() {
		return deductionCards;
	}

	public void setDeductionCards(Integer deductionCards) {
		this.deductionCards = deductionCards;
	}

	public Integer getAddCards() {
		return addCards;
	}

	public void setAddCards(Integer addCards) {
		this.addCards = addCards;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
}

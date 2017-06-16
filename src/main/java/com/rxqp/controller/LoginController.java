package com.rxqp.controller;

import com.rxqp.model.User;
import com.rxqp.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@Resource
	IUserService userService;

	@ResponseBody
	@RequestMapping(value = "/index")
	public String Index(HttpServletRequest request, @RequestParam("id") Integer id) {
		User user = userService.getUser(id);
		return user.getName();
	}

	@ResponseBody
	@RequestMapping(value = "/addUser")
	public User addUser(HttpServletRequest request, @RequestParam("openid") String openid,
						@RequestParam("name") String name,
						@RequestParam("imgUrl") String imgUrl) {
		User user = new User();
		user.setOpenid(openid);
		user.setName(name);
		user.setImgUrl(imgUrl);
		int userId = userService.addUser(user);
		return user;
	}

	@ResponseBody
	@RequestMapping(value = "/getPlayerByPlayerid")
	public User getPlayerByPlayerid(HttpServletRequest request, @RequestParam("playerid") Integer playerid) {
		User user = userService.getUser(playerid);
		return user;
	}

	@ResponseBody
	@RequestMapping(value = "/getPlayerByOpenid")
	public User getPlayerByOpenid(HttpServletRequest request, @RequestParam("openid") String openid) {
		User user = new User();
		user = userService.getUserByOpenid(openid);
		return user;
	}
}

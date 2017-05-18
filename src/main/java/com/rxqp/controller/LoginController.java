package com.rxqp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rxqp.model.User;
import com.rxqp.service.IUserService;

@Controller
public class LoginController {

	@Resource
	IUserService userService;

	@ResponseBody
	@RequestMapping(value = "/index")
	public String Index(HttpServletRequest request, @RequestParam("id") Long id) {
		User user = userService.getUser(id);
		return user.getName();
	}
}

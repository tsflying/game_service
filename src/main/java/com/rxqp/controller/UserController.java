package com.rxqp.controller;

import com.rxqp.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by mengfanfei on 2017/6/16.
 */
@Controller
public class UserController {
    @Resource
    IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/deductionRoomCards")
    public boolean deductionRoomCards(@RequestParam("userId") Integer id,
                                     @RequestParam("cards") Integer cards) {
        boolean isSccess = userService.deductionRoomCards(id,cards);
        return isSccess;
    }
}

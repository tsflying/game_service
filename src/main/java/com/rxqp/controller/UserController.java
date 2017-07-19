package com.rxqp.controller;

import com.rxqp.model.Result;
import com.rxqp.model.User;
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
    public Result deductionRoomCards(@RequestParam("userId") Integer id,
                                     @RequestParam("cards") Integer cards) {
        boolean isSccess = userService.deductionRoomCards(id,cards);
        Result result = new Result();
        result.setSuccess(isSccess);
        return result;
    }
//
//    @ResponseBody
//    @RequestMapping(value = "/addRoomCardsByOpenid")
//    public Result addRoomCardsByOpenid(@RequestParam("openid") String openid,
//                                     @RequestParam("cards") Integer cards) {
//        boolean isSccess = userService.addRoomCardsByopenid(openid,cards);
//        Result result = new Result();
//        result.setSuccess(isSccess);
//        return result;
//    }

    @ResponseBody
    @RequestMapping(value = "/deductionRoomCardsByUnionid")
    public Result deductionRoomCardsByUnionid(@RequestParam("unionid") String unionid,
                                     @RequestParam("cards") Integer cards) {
        boolean isSccess = userService.deductionRoomCardsByUnionid(unionid,cards);
        Result result = new Result();
        result.setSuccess(isSccess);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/addRoomCardsByUnionid")
    public Result addRoomCardsByOpenid(@RequestParam("unionid") String unionid,
                                       @RequestParam("cards") Integer cards) {
        boolean isSccess = userService.addRoomCardsByUnionid(unionid,cards);
        Result result = new Result();
        result.setSuccess(isSccess);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/addRoomCards")
    public Result addRoomCards(@RequestParam("userId") Integer id,
                               @RequestParam("cards") Integer cards) {
        boolean isSccess = userService.addRoomCards(id,cards);
        Result result = new Result();
        result.setSuccess(isSccess);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/getUserByOpenid")
    public Result getUserByOpenid(@RequestParam("openid") String openid) {
        User user = userService.getUserByOpenid(openid);
        Result result = new Result();
        if(user != null){
            result.setSuccess(true);
            result.setObj(user);
        }else{
            result.setSuccess(false);
        }
        return result;
    }
}

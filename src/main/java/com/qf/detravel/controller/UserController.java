package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(description ="用户管理API")
@ServletComponentScan
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;

    //登录
    @ApiOperation(value="用户登录", notes="根据uEmail和uPassWord来判断用户登录信息是否正确")
    @RequestMapping("/login.do")
    public JsonResult login(String uEmail, String uPassWord) {

        System.out.println(uEmail + "---" + uPassWord);
        try {
            User user = userService.findByEmail(uEmail, uPassWord);
            return new JsonResult(1, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());
        }
    }


    //验证
    @ApiOperation(value="注册时验证昵称和邮箱（不重复）", notes="根据uNickName和uEmail来判断用户信息是否重复")
    @RequestMapping(path = "/check.do")
    public JsonResult check(String uNickName, String uEmail) {
        System.out.println(uNickName+"---"+uEmail);

        try {
            //注册验证
            userService.signIn(uNickName, uEmail);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());
        }
        return new JsonResult(1, "可用");

    }


    //注册
    @ApiOperation(value="注册(添加用户)", notes="根据“user”来添加一个用户")
    @RequestMapping(path = "/singIn.do")
    public JsonResult singIn(User user) {
        System.out.println(user);

        try {
            //添加用户
            userService.add(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "注册失败");
        }


        return new JsonResult(1, "注册成功");
    }

}

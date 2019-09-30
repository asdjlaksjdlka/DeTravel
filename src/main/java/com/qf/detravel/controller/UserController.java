package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.dao.UserDao;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    public JsonResult login(String uEmail,String uPassWord){

        System.out.println(uEmail+"---"+uPassWord);
        try {
            User user = userService.findByEmail(uEmail, uPassWord);
            return new JsonResult(1,null);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(0,e.getMessage());
        }
    }
}

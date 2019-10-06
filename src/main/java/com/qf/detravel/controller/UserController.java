package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import com.qf.detravel.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


@Api(description ="用户管理API")
@ServletComponentScan
@Controller
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    UserService userService;


    //登录
    @ApiOperation(value="用户登录", notes="根据uEmail和uPassWord来判断用户登录信息是否正确，正确返回token")
    @PostMapping("/login.do")
    public JsonResult login(String uEmail, String uPassWord) {
        // haha 盐值

//        System.out.println(uEmail + "---" + uPassWord);
        try {
            User user = userService.findByEmail(uEmail, uPassWord);
            //生成token
            String token = MD5Utils.md5(user.getuId() + "haha");
            // 将token放到redis中
            stringRedisTemplate.opsForValue().set(token,user.getuId().toString());

            stringRedisTemplate.expire(token, 30, TimeUnit.MINUTES);
            // 将token发送给前端

            return new JsonResult(1, token);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());


        }
    }




    //注册
    @ApiOperation(value="注册(添加用户)", notes="根据“user”来添加一个用户")
    @PostMapping(path = "/singIn.do")
    public JsonResult singIn(User user) {
        System.out.println(user);

        try {
            //注册验证
            userService.signIn(user.getuNickName(),user.getuEmail());
            //添加用户
            userService.add(user);
            return new JsonResult(1, "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0,e.getMessage());
        }



    }

    //修改用户信息
    @ApiOperation(value="修改用户信息", notes="修改用户信息")
    @PostMapping(path = "/updateByUserId.do")
    public JsonResult updateByUserId(User user){
        try {
            userService.findUNickName(user);

        } catch (RuntimeException e) {
            new JsonResult<String>(0,"修改失败");
        }

        userService.updateByUserId(user);

        User user1 = userService.findByIdUser(user.getuId());


        return new JsonResult(1,"修改用户信息成功");
    }

    @ApiOperation(value = "查询用户信息",notes = "查询用户信息")
    @GetMapping("/findUser.do")
    public JsonResult findUser(Integer uid) {
        User user = userService.findByIdUser(uid);
        return new JsonResult(1, "");
    }
//    @ApiOperation(value = "上传用户头像",notes = "上传用户头像")
//    @GetMapping("/findPicture.do")
//    public JsonResult findPicture(Integer uId){
//        String picture = userService.findPicture(uId);
//        System.out.println("springmvc文件上传，，，，");
//
//
//    }

}

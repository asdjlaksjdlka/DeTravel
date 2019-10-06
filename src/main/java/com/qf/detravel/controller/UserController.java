package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import com.qf.detravel.utils.IsLogined;
import com.qf.detravel.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Api(description = "用户管理API")
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
    @Autowired
    private IsLogined isLogined;

    //登录
    @ApiOperation(value = "用户登录", notes = "根据uEmail和uPassWord来判断用户登录信息是否正确，正确返回token")
    @PostMapping("/login.do")
    public JsonResult login(String uEmail, String uPassWord) {
        // haha 盐值
        System.out.println(uEmail + "---" + uPassWord);
        try {
            User user = userService.findByEmail(uEmail, uPassWord);
            //生成token
            String token = MD5Utils.md5(user.getuId() + "haha");
            // 将token放到redis中
            stringRedisTemplate.opsForValue().set(token, user.getuId().toString());

            stringRedisTemplate.expire(token, 30, TimeUnit.MINUTES);
            // 将token发送给前端
            Map map = new HashMap();
            map.put("token", token);
            map.put("user", user);
            return new JsonResult(1, map);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());
        }
    }

    //注册
    @ApiOperation(value = "注册(添加用户)", notes = "根据“user”来添加一个用户")
    @PostMapping(path = "/singIn.do")
    public JsonResult singIn(User user) {
        System.out.println(user);

        try {
            //注册验证
            userService.signIn(user.getuNickName(), user.getuEmail());
            //添加用户
            userService.add(user);
            return new JsonResult(1, "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());
        }
    }

    //修改用户信息
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    @PostMapping(path = "/updateByUserId.do")
    public JsonResult updateByUserId(User user, MultipartFile upload) {

//        System.out.println("springmvc文件上传，，，，");
        //上传位置
        String path = "C:\\MyData";
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //说明上传文件项
        //获取上传文件的名称
        String filename = upload.getOriginalFilename();
        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 完成文件上传
        try {
            upload.transferTo(new File(path, filename));
            user.setuPicture(path + filename);
//            System.out.println(user);
            userService.updateByUserId(user);
            return new JsonResult(1, "修改用户信息成功");
        } catch (Exception e) {
            return new JsonResult<String>(0, "修改失败");
        }
    }


    @GetMapping("/showUserHomePage.do")
    public JsonResult<Map> showUserHomePage(Integer uId) {

        Map map = userService.showUserHomePage(uId);
        return new JsonResult<Map>(1, map);

    }

    //获取当前用户id主页
    @GetMapping("/showMyHomePage.do")
    public JsonResult<Map> showMyHomePage(HttpServletRequest request) {
        String token = request.getHeader("token");
        int uid = isLogined.getUserId(token);
        Map map = userService.showUserHomePage(uid);
        return new JsonResult<Map>(1, map);
    }

    @GetMapping("/insertAttention.do")
    public JsonResult insertAttention(Integer uId,HttpServletRequest request) {
        String token = request.getHeader("token");
        int uid = isLogined.getUserId(token);
        userService.insertAttention(uid, uId);
        return new JsonResult(1, "关注成功");
    }

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    @GetMapping("/findUser.do")
    public JsonResult findUser(HttpServletRequest request) {

        String token = request.getHeader("token");
        int uid = isLogined.getUserId(token);
        User user = userService.findByIdUser(uid);
        return new JsonResult(1, user);
    }

    @PostMapping("/resetPassword")
    public JsonResult resetPassword(String uName, String uNickName, String uEmail) {
        try {
            userService.resetPassword(uName, uNickName, uEmail);
            return new JsonResult(1, "发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, e.getMessage());
        }
    }

}

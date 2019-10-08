package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import com.qf.detravel.utils.IsLogined;
import com.qf.detravel.utils.MD5Utils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uEmail", value = "用户邮箱", required = true, dataType = "字符串"),
            @ApiImplicitParam(name = "uPassWord", value = "用户密码", required = true, dataType = "字符串")
    })
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
    @RequestMapping(path = "/singIn.do")
    public JsonResult singIn(
            @ApiParam(name = "用户对象",value = "把注册信息封装到用户对象",required = true)
            User user) {
//        System.out.println(user);
        System.out.println(user+"=====");
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
    public JsonResult updateByUserId(
            @ApiParam(name = "用户对象",value = "把修改信息封装到用户对象",required = true)
                    User user, MultipartFile upload) {

//        System.out.println("springmvc文件上传，，，，");
        //上传位置
        String path = "/usr/local/tomcat/webapps/images";
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
    @ApiOperation(value = "showUserHomePage", notes = "展示其他用户主页，返回值为map集合，map有7个" +
            "，user中为用户信息（包括name，姓名），dynamicList为动态信息，包含图片和国家，" +
            "dynamicCount为动态数量，photoList为图片集合，photoCount为图片数量，fansList为粉丝信息" +
            "fansCount为粉丝数量")
    @ApiImplicitParam(name = "uId", value = "点击某个用户的头像可进入该用户首页", required = true, dataType = "int类型")
    @GetMapping("/showUserHomePage.do")
    public JsonResult<Map> showUserHomePage(Integer uId) {

        Map map = userService.showUserHomePage(uId);
        return new JsonResult<Map>(1, map);

    }




    //获取当前用户id主页
    @ApiOperation(value = "showMyHomePage",notes = "用户个人的信息，返回map与用户主页类似，不需要传id，用户id放在请求头")
    @GetMapping("/showMyHomePage.do")
    public JsonResult<Map> showMyHomePage(HttpServletRequest request) {
        String token = request.getHeader("token");
        int uid = isLogined.getUserId(token);
        Map map = userService.showUserHomePage(uid);
        return new JsonResult<Map>(1, map);
    }
    @ApiImplicitParam(name = "uId", value = "被关注用户的id", required = true, dataType = "int类型")
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

    @ApiImplicitParams({
            @ApiImplicitParam(name = "uEmail", value = "用户邮箱", required = true, dataType = "字符串"),
            @ApiImplicitParam(name = "uNickName", value = "用户昵称", required = true, dataType = "字符串"),
            @ApiImplicitParam(name = "uName", value = "用户名称", required = true, dataType = "字符串")
    })
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

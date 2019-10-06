package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Notification;
import com.qf.detravel.entity.Reply;
import com.qf.detravel.service.CommentService;
import com.qf.detravel.utils.IsLogined;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
@Api(description ="状态、评论、回复API")
@Controller
@ResponseBody
public class CommentController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private CommentService commentService;

    @Autowired
    private IsLogined isLogined;

    @ApiOperation(value="一级评论", notes="在用户发表的状态（朋友圈）下面添加评论，需要获取当前用户id和发表评论的用户id")
    @PostMapping(value="/add/first")
    public JsonResult addCommment(
            @ApiParam(name = "评论对象",value = "传入String格式",required = true)
                                              Comment comment) {
        comment.setCommentTime(new Date());
        commentService.insertComment(comment);

        return new JsonResult(1,comment);
    }
    @ApiOperation(value="回复评论", notes="在用户发表的状态（朋友圈）下面添加的评论回复")
    @RequestMapping(value="/add/second", method= RequestMethod.POST)
    public JsonResult addReply(@ApiParam(name = "回复对象",value = "传入String类型")
                                           Reply reply) {
        reply.setReplyTime(new Date());
        commentService.insertReply(reply);
        return new JsonResult(1,reply);
    }

    @ApiOperation(value="查询状态（朋友圈）以及评论和回复", notes="遍历获取每个（朋友圈）的内容、评论和回复， List<Dynamic> ")
    @GetMapping(value="/list")
    public JsonResult showList( HttpServletRequest request) {

        String token = request.getHeader("token");

        int uid = isLogined.getUserId(token);

        List<Dynamic> list = commentService.selectListByUId(uid);
        return new JsonResult(1,list);
    }

    //遍历显示通知信息
    @ApiOperation(value="通知页面数据显示",
            notes="返回list集合，包括关注、评论等,toUser：评论某个用户的id；nContent：通知的评论内容；fromUser：评论来自哪个用户的id；nType：1、点赞；2、关注；3、评论；nTime：通知的时间;User:User对象的所有属性，均可通过user(对象).属性获得，比如user.uName")
    @GetMapping("/showNotification")
    public JsonResult showNotification(HttpServletRequest request){
        String token = request.getHeader("token");

        int uid = isLogined.getUserId(token);
        List<Notification> list = commentService.showNotificationByUid(uid);
        return new JsonResult(1,list);
    }
}
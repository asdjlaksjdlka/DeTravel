package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Reply;
import com.qf.detravel.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
@Api(description ="状态、评论、回复API")
@Controller
@ResponseBody
public class CommentController {

    @Autowired
    private CommentService commentService;
    @ApiOperation(value="一级评论", notes="在用户发表的状态（朋友圈）下面添加评论，需要获取当前用户id和发表评论的用户id")
    @RequestMapping(value="/add/first", method= RequestMethod.POST)
    public JsonResult addCommment(Comment comment) {
        comment.setCommentTime(new Date());
        commentService.insertComment(comment);

        return new JsonResult(1,comment);
    }
    @ApiOperation(value="回复评论", notes="在用户发表的状态（朋友圈）下面添加的评论回复")
    @RequestMapping(value="/add/second", method= RequestMethod.POST)
    public JsonResult addReply(Reply reply) {
        reply.setReplyTime(new Date());

        commentService.insertReply(reply);

        return new JsonResult(1,reply);
    }
    @ApiOperation(value="查询状态（朋友圈）以及评论和回复", notes="遍历获取每个（朋友圈）的内容、评论和回复， List<Dynamic> ")
    @GetMapping(value="/list")
    public JsonResult showList(Integer uid) {

        List<Dynamic> list = commentService.selectListByUId(uid);
        return new JsonResult(1,list);
    }

}
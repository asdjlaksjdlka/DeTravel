package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Reply;
import com.qf.detravel.service.CommentService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@Api(description ="状态、评论、回复API")
@Controller
@ResponseBody
public class CommentController {

    @Autowired
    private CommentService commentService;

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
    @ApiImplicitParam(name = "uid",value = "当前在线用户的id，根据该id可以查出：用户所发“朋友圈”、评论、回复")
    @GetMapping(value="/list")
    public JsonResult showList(Integer uid) {
        List<Dynamic> list = commentService.selectListByUId(uid);
        return new JsonResult(1,list);
    }

}
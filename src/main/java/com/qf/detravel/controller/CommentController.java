package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Reply;
import com.qf.detravel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value="/add/first", method= RequestMethod.POST)
    public JsonResult addCommment(Comment comment) {
        comment.setCommentTime(new Date());
        commentService.insertComment(comment);

        return new JsonResult(1,comment);
    }

    @RequestMapping(value="/add/second", method= RequestMethod.POST)
    public JsonResult addReply(Reply reply) {
        reply.setReplyTime(new Date());

        commentService.insertReply(reply);

        return new JsonResult(1,reply);
    }

    @RequestMapping(value="/list")
    public JsonResult showList(Integer uid) {

        List<Dynamic> list = commentService.selectListByUId(uid);
        return new JsonResult(1,list);
    }

}
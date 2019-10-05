package com.qf.detravel.dao;

import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Reply;

import java.util.List;

public interface CommentDao {

    //一级评论
    public void insertComment(Comment comment);
    //回复
    public void insertReply(Reply reply);

    //查询朋友圈以及评论和回复
    public List<Dynamic> selectListByUId(int uid);

}

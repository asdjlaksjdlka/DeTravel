package com.qf.detravel.service.impl;

import com.qf.detravel.dao.CommentDao;
import com.qf.detravel.entity.Comment;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Reply;
import com.qf.detravel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public void insertComment(Comment comment) {
        commentDao.insertComment(comment);
    }

    @Override
    public void insertReply(Reply reply) {
        commentDao.insertReply(reply);
    }

    @Override
    public List<Dynamic> selectListByUId(int uid) {
        return commentDao.selectListByUId(uid);
    }
}

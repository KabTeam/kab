package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.CommentsRepository;
import cn.bdqn.kab.pojo.Comments;
import cn.bdqn.kab.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;


    @Override
    public Comments addNewComment(Comments comments) {
        return null;
    }

    @Override
    public void deleteComment(Integer commentId) {
        commentsRepository.deleteById(commentId);
    }
}

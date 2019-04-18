package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.Comments;
import org.springframework.data.domain.Page;

public interface CommentsService {

    /**
     * 用户评论(添加新的评论)
     * @param comments
     * @return
     */
    public Comments addNewComment(Comments comments);

    /**
     * 管理员删除评论
     * @param
     * @return
     */
    public  void deleteComment(Integer commentId);

    /**
     * 分页查询评论
     * @return
     */
    public Page<Comments> getArticel(Integer articleId, Integer currentPage, Integer pageSize);
}

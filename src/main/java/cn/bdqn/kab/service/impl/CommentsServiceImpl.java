package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.CommentsRepository;
import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.Comments;
import cn.bdqn.kab.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;

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

    @Override
    public Page<Comments> getArticel(final Integer articleId, Integer currentPage, Integer pageSize) {
        Specification<Comments> specification = new Specification<Comments>() {
            @Override
            public Predicate toPredicate(Root<Comments> root,
                                         CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                Path<Long> $id = root.get("articleId");
                Predicate _id = criteriaBuilder.equal($id, articleId);
                return criteriaBuilder.and(_id);
            }
        };
        Pageable pageable = PageRequest.of(currentPage,pageSize, Sort.Direction.DESC,"commentDate");
        if(articleId!=null){
            return commentsRepository.findAll(specification, pageable);

        }else{
            return  commentsRepository.findAll(pageable);
        }
    }
}

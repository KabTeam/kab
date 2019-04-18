package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ArticleRepository;
import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article addNewArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticel(Article article) {
        return articleRepository.saveAndFlush(article);
    }

    @Override
    public Page<Article> getArticel(final Integer typeId,Integer currentPage,Integer pageSize) {
        Specification<Article> specification = new Specification<Article>() {
            @Override
            public Predicate toPredicate(Root<Article> root,
                                         CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                Path<Long> $id = root.get("articletypeid");
                Predicate _id = criteriaBuilder.equal($id, typeId);
                return criteriaBuilder.and(_id);
            }
        };
        Pageable pageable = PageRequest.of(currentPage,pageSize, Sort.Direction.DESC,"updatedate");
        if(typeId!=null){
            return articleRepository.findAll(specification, pageable);

        }else{
          return  articleRepository.findAll(pageable);
        }


    }

    @Override
    public void deleteArticel(Integer articelId) {
        articleRepository.deleteById(articelId);
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findByArticleid(id);
    }
}

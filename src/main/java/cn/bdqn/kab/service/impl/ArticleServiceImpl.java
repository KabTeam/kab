package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ArticleRepository;
import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
    public Page<Article> getArticel(Integer currentPage,Integer pageSize) {
        Pageable pageable = PageRequest.of(currentPage,pageSize);
        return articleRepository.findAll(pageable);
    }

    @Override
    public void deleteArticel(Integer articelId) {
        articleRepository.deleteById(articelId);
    }
}

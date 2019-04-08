package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ArticleRepository;
import cn.bdqn.kab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

}

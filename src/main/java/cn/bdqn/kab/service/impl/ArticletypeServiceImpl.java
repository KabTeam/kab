package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ArticleRepository;
import cn.bdqn.kab.service.ArticletypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("articletypeService")
public class ArticletypeServiceImpl implements ArticletypeService {
    @Autowired
    private ArticleRepository articleRepository;

}

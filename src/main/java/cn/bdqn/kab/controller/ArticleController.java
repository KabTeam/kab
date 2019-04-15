package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;



}

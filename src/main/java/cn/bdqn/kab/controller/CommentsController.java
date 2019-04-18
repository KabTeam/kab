package cn.bdqn.kab.controller;

import cn.bdqn.kab.dao.ArticleRepository;
import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.Comments;
import cn.bdqn.kab.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @Autowired
    private ArticleRepository articleRepository;





}

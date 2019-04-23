package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.Comments;
import cn.bdqn.kab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;


    /**
     * 新闻管理
     * @param model
     * @return
     */
    @RequestMapping("/newsManage")
    public String newsManage(Model model,@RequestParam(value = "pageNo",required = false) Integer pageNo){
        if(pageNo==null){
            pageNo=0;
        }
        if(pageNo>0){
            pageNo--;
        }
        Page<Article> newsPage = articleService.getArticel(1,pageNo,4);
        model.addAttribute("newsPage",newsPage);
        return "newsManage";
    }

    /**
     * 评论管理
     * @param model
     * @param articleId
     * @return
     */
    @RequestMapping("/commentsManage")
    public String commentsManage(Model model,@RequestParam("articleId") Integer articleId){
        Article article =articleService.getArticleById(articleId);
        System.out.println(article.getCommentsLst().size()
        );
        model.addAttribute("comments",article.getCommentsLst());
        return "commentsManage";
    }

    @RequestMapping("/addNews")
    public String addNews(){
        return "addNews";
    }


    @RequestMapping("/addArticle")
    public String addArticle(@ModelAttribute Article article){

        return "";
    }


    /**KAB概况管理
     *
     * @param model
     * @return
     */
    @RequestMapping("/kabSsurveyManage")
    public String kabSsurveyManage(Model model){

        Page<Article> kabSsurveyPage = articleService.getArticel(2,0,4);
        Article kabSsurvey = kabSsurveyPage.getContent().get(0);
        model.addAttribute("kabSsurvey",kabSsurvey);
        return "kabSsurveyManage";
    }

    /**
     * 创业资讯管理
     * @param model
     * @return
     */
    @RequestMapping("/businessInformationManage")
    public String businessInformationManage(Model model,@RequestParam(value = "pageNo",required = false) Integer pageNo){
        if(pageNo==null){
            pageNo=0;
        }
        if(pageNo>0){
            pageNo--;
        }
        Page<Article> businessInformationPage = articleService.getArticel(3,pageNo,4);
        model.addAttribute("businessInformationPage",businessInformationPage);
        return "businessInformationManage";
    }


    /**
     * 课程介绍管理
     * @return
     */
    @RequestMapping("/kabCourseReferraManage")
    public String kabCourseReferraManage(Model model,@RequestParam(value = "pageNo",required = false) Integer pageNo){
        if(pageNo==null){
            pageNo=0;
        }
        if(pageNo>0){
            pageNo--;
        }
        Page<Article> kabCourseReferraPage = articleService.getArticel(4,pageNo,4);
        model.addAttribute("kabCourseReferraPage",kabCourseReferraPage);
        return "kabCourseReferralManage";
    }

    /**
     * 单页管理
     * @param model
     * @return
     */
    @RequestMapping("/singlePageManage")
    public String singlePageManage(Model model){
        Page<Article> singlePage = articleService.getArticel(5,0,4);
        model.addAttribute("singlePage",singlePage);
        return "singlePageManage";
    }

    /**
     * 跳转到修改新闻页面
     * @return
     */
    @RequestMapping("/modifyNews")
    public String modifyNews(Model model,@RequestParam("id") Integer id){
        Article article = articleService.getArticleById(id);
        model.addAttribute("article",article);
        return "modifyNews";
    }
}

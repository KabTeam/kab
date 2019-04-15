package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.KabUsers;
import cn.bdqn.kab.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class GradeController  {
    @Autowired
    private GradeService gradeService;

    /**
     * 跳转到班级管理页面(我的班级)
     * @return
     */
    @RequestMapping("/manageClass.html")
    public String classManage(Model model, HttpSession session){
        KabUsers user= (KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
            return "manageClass";
        }else {
            model.addAttribute("error","请进行登录后访问");
            return "forward:/home.html";
        }

    }

    /**
     * 跳转到创建班级页面(网上开班)
     * @return
     */
    @RequestMapping("/createClass.html")
    public String createClass(Model model,HttpSession session){
        KabUsers user= (KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
            return "createClass";
        }else {
            model.addAttribute("error","请进行登录后访问");
            return "forward:/home.html";
        }

    }
}

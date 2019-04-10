package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @RequestMapping("/login.html")
    public String login(){
        return "backgroundLogin";
    }
}

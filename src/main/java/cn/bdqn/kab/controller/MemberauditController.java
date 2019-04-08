package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.MemberauditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memberaudit")
public class MemberauditController {
    @Autowired
    private MemberauditService memberauditService;




}

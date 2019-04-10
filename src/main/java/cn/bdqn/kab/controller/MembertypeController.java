package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.MembertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembertypeController {
    @Autowired
    private MembertypeService membertypeService;


}

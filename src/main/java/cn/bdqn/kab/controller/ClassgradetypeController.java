package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.ClassgradetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classgradetype")
public class ClassgradetypeController  {
    @Autowired
    private ClassgradetypeService classgradetypeService;


}

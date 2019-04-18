package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.ClassgradeService;
import cn.bdqn.kab.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassgradeController {
    @Autowired
    private ClassgradeService classgradeService;
    @Autowired
    private ProvinceService provinceService;


    @RequestMapping("/classManage")
    public String classManage(Model model){

        return "classManage";
    }

}

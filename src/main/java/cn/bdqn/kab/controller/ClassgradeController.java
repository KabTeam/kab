package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.ClassgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classgrade")
public class ClassgradeController {
    @Autowired
    private ClassgradeService classgradeService;


}

package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class GradeController  {
    @Autowired
    private GradeService gradeService;


}

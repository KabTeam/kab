package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.KabUsers;
import cn.bdqn.kab.service.KabUsersService;
import cn.bdqn.kab.service.impl.KabUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KabUsersController {
    @Autowired
    private KabUsersService kabUsersService;


}

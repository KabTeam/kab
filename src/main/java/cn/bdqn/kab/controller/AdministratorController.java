package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.Administrator;
import cn.bdqn.kab.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @RequestMapping("/backgroundLogin.html")
    public String login(){
        return "backgroundLogin";
    }

    @ResponseBody
    @RequestMapping(value = "/adminLogin.do",produces = "application/json;charset=utf-8")
    public Object adminLogin(Model model, @RequestParam("adminName") String adminName,
                             @RequestParam("adminPwd") String adminPwd,
                             HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();
        try{
            Administrator administrator = administratorService.findByadminName(adminName);
            if(administrator!=null){
                   if(!administrator.getAdminpwd().equals(adminPwd)){
                       map.put("message","用户名错误！");
                       map.put("status",2);
                   }else{
                       session.setAttribute("admin",administrator);
                       map.put("message","登录成功！");
                       map.put("status",1);
                   }
            }else {
                map.put("message","密码错误！");
                map.put("status",2);
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("message","系统异常！");
            map.put("status",2);

        }
        System.out.println(map.get("message"));
        return map;
    }


}

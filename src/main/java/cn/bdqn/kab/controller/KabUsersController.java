package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.KabUsers;
import cn.bdqn.kab.service.KabUsersService;
import cn.bdqn.kab.service.impl.KabUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;

@Controller
public class KabUsersController {
    @Autowired
    private KabUsersService kabUsersService;

    /**
     * 跳转主页
     * @return
     */
    @RequestMapping("/home.html")
    public String home(Model model,HttpSession session){
        KabUsers user=(KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
        }
        return "home";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/userlogin.html")
    public String userLogin(){
        return "memberLogin";
    }

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/userRegist.html")
    public String userRegist(){
        return "memberRegist";
    }

    /**
     * 用户登录处理
     */
    @RequestMapping("/userlogin.do")
    public String userLoginDo(Model model, String userName, String userPwd, HttpSession session) throws Exception {
        KabUsers user=kabUsersService.findByUserName(userName);
        if(user==null){
            model.addAttribute("error","没有改用户!");
        }else if(!userPwd.equals(user.getUserPwd()) ){
            model.addAttribute("error","密码错误!");

        }else {
            session.setAttribute("kabUser",user);
        }
        return "forward:/home.html";
    }

    /**
     * 注销功能
     * @param session
     * @return
     */
    @RequestMapping("/logoff.html")
    public String logOff(HttpSession session){
        session.setAttribute("kabUser",null);
        return "redirect:/home.html";
    }

    /**
     * 跳转到修改个人资料页面
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/modifyPersonalData.html")
    public String updateUser(Model model, HttpSession session){
        KabUsers user= (KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
            return "modifyPersonalData";
        }else {
            model.addAttribute("error","请进行登录后访问");
            return "forward:/home.html";
        }
    }
    /**
     * 跳转到修改密码页面
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/modifyPassword.html")
    public String updateUserPwd(Model model, HttpSession session){
        KabUsers user= (KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
            return "modifyPassword";
        }else {
            model.addAttribute("error","请进行登录后访问");
            return "forward:/home.html";
        }
    }
    /**
     * 跳转到申请密保页面
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/applyEncrypted.html")
    public String applyEncrypted(Model model, HttpSession session){
        KabUsers user= (KabUsers) session.getAttribute("kabUser");
        if (user!=null){
            model.addAttribute("kabUser",user);
            return "applyEncrypted";
        }else {
            model.addAttribute("error","请进行登录后访问");
            return "forward:/home.html";
        }
    }

    /**
     * 修改个人资料
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/modifyPersonalData.do")
    public Object updateUserDo(HttpSession session){

        return "";
    }

    /**
     * 修改用户密码
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/modifyPassword.do")
    public Object updateUserPwd(HttpSession session){

        return "";
    }
    /**
     * 申请密保
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/applyEncrypted.do")
    public Object applyEncryptedDo(HttpSession session){

        return "";
    }
}

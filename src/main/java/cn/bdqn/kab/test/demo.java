package cn.bdqn.kab.test;

import cn.bdqn.kab.pojo.Administrator;
import cn.bdqn.kab.pojo.Article;
import cn.bdqn.kab.pojo.KabUsers;
import cn.bdqn.kab.pojo.Member;
import cn.bdqn.kab.service.AdministratorService;
import cn.bdqn.kab.service.ArticleService;
import cn.bdqn.kab.service.CommentsService;
import cn.bdqn.kab.service.KabUsersService;
import cn.bdqn.kab.service.impl.GradeServiceImpl;
import cn.bdqn.kab.service.impl.KabUsersServiceImpl;
import cn.bdqn.kab.service.impl.MemberServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class demo {

    @Resource(name="kabUsersService")
    private KabUsersService kabUsersService;
    @Resource(name="administratorService")
    private AdministratorService administratorService;
    @Resource(name="articleService")
    private ArticleService articleService;
    @Resource(name="commentsService")
    private CommentsService commentsService;


    @Test
    public void test01(){
        KabUsers kabUsers = new KabUsers();
        kabUsers.setUserName("lhy");
        kabUsers.setUserPwd("123456");
        kabUsers.setSecurityQuestion("123");
        kabUsers.setSecurityAnswer("1");
        kabUsers.setMailBox("asd");
        try {
            KabUsers k=kabUsersService.addNewKabUser(kabUsers);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void test02(){
        try {
            Administrator k=administratorService.findByadminName("admin");
            System.out.println(k.getAdminName());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Test
    public void test03(){
        try {
            Page<Article> lists =articleService.getArticel(1,4);
            for (Article Article: lists.getContent()) {
                System.out.println(Article.getArticletitle());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void test04(){
        try{
            Administrator admin = new Administrator();
            admin.setAdminid(1);
            admin.setAdminName("admin01");
            admin.setAdminpwd("123789");
            Administrator  ad =administratorService.updateAdminPwd(admin);
            System.out.println(ad.getAdminpwd());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void test05(){
        try{
            commentsService.deleteComment(1);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void test06(){
        try{
            KabUsers kabUsers = new KabUsers();
            kabUsers.setUserId(7);
            kabUsers.setUserName("qwe");
            kabUsers.setUserPwd("123789");
            kabUsers.setSecurityQuestion("123");
            kabUsers.setSecurityAnswer("1");
            kabUsers.setMailBox("asd");
            Member member = new Member();
            member.setMtypeid(1);
            member.setRealname("1230");
            member.setAcademy("789");
            member.setAtthetime(5);
            member.setDuty("4");
            member.setSubject("12");
            member.setBirthday(new Date(System.currentTimeMillis()));
            member.setEducationbackground("123");
            member.setMajor("1");
            member.setIdnumber("123");
            member.setPhonenumber("123");
            kabUsers.setMember(member);
            kabUsersService.addNewKabUser(kabUsers);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}

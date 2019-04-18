package cn.bdqn.kab.controller;

import cn.bdqn.kab.pojo.Notice;
import cn.bdqn.kab.service.NoticeService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/kabNoticeManage")
    public String kabNoticeManage(Model model){
        Page<Notice> kabNoticePage = noticeService.getNotice(0,4);
        model.addAttribute("kabNoticePage",kabNoticePage);
        return "kabNoticeManage";
    }
}

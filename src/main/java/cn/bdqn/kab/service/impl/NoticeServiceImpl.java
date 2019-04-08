package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.NoticeRepository;
import cn.bdqn.kab.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeRepository noticeRepository;


}

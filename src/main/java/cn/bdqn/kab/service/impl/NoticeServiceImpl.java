package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.NoticeRepository;
import cn.bdqn.kab.pojo.Notice;
import cn.bdqn.kab.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeRepository noticeRepository;


    @Override
    public Notice addNewNotice(Notice notice) {
        return noticeRepository.save(notice);
    }

    @Override
    public void updateNotice(Notice notice) {
         noticeRepository.saveAndFlush(notice);
    }

    @Override
    public Page<Notice> getNotice(Integer currentPage, Integer pageSize) {
        Pageable pageable = PageRequest.of(currentPage,pageSize);
        return noticeRepository.findAll(pageable);
    }

    @Override
    public void deleteNotice(Integer noticeId) {
        noticeRepository.deleteById(noticeId);
    }
}

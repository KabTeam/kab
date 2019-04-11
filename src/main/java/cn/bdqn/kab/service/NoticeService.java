package cn.bdqn.kab.service;


import cn.bdqn.kab.pojo.Notice;
import org.springframework.data.domain.Page;

public interface NoticeService {

    /**
     * 添加新的公告
     * @param notice
     * @return
     */
    public Notice addNewNotice(Notice notice);

    /**
     * 修改公告
     * @param notice
     * @return
     */
    public void updateNotice(Notice notice);

    /**
     * 分页查询公告
     * @return
     */
    public Page<Notice> getNotice(Integer currentPage, Integer pageSize);


    /**
     * 删除公告
     * @param noticeId
     */
    public void deleteNotice(Integer noticeId);
}

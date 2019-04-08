package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice,Integer> {

}

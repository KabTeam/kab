package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Memberaudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberauditRepository extends JpaRepository<Memberaudit,Integer> {

}

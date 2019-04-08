package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Membertype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembertypeRepository extends JpaRepository<Membertype,Integer> {

}

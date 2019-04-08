package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Classgrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassgradeRepository extends JpaRepository<Classgrade,Integer> {

}

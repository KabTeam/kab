package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Integer> {
}

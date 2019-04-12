package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {



}

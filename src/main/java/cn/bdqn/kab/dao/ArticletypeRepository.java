package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Articletype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticletypeRepository extends JpaRepository<Articletype,Integer> {
}

package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Classgradetype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassgradetypeRepository extends JpaRepository<Classgradetype,Integer> {
}

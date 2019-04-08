package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Integer> {

}

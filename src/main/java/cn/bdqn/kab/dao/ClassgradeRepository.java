package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Classgrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassgradeRepository extends JpaRepository<Classgrade,Integer> {

    /**
     * 获取学校下的所有班级
     * @param schooleId
     * @return
     */
    public List<Classgrade> findBySchoolId(Integer schooleId);

}

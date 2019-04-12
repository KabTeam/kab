package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Classgrade;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ClassgradeService {

    /**
     * 创建新班级
     * @param classgrade
     * @return
     */
    public Classgrade addNewClassGrade(Classgrade classgrade);

    /**
     * 删除班级
     * @return
     */
    public void deleteClassGrade(Integer classgradeid);

    /**
     * 修改班级信息
     * @param classgrade
     * @return
     */
    public Classgrade updateClassGrade(Classgrade classgrade);

    /**
     * 获取指定学校下的所有班级
     * @param schoolId
     * @return
     */
    public List<Classgrade> getClassgradeBySchoolId(Integer schoolId);

}

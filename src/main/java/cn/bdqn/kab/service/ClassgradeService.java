package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Classgrade;
import org.springframework.data.domain.Page;

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

}

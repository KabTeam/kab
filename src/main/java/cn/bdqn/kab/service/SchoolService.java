package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.School;

import java.util.List;

public interface SchoolService {

    /**
     * 新增学校
     * @return
     */
    public School addNewSchool(School school);

    /**
     * 获取省份下的所有学校
     * @param provinceId
     * @return
     */
    public List<School> getSchoolListByProvinceId(Integer provinceId);
}

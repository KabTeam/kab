package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Province;

import java.util.List;

public interface ProvinceService {

    /**
     * 查询所有的省份
     * @return
     */
    public List<Province> getAllProvince();

    /**
     * 添加省份
     * @param province
     * @return
     */
    public Province addNewProvince(Province province);
}

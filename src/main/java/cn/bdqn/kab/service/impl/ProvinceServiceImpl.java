package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ProvinceRepository;
import cn.bdqn.kab.pojo.Province;
import cn.bdqn.kab.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;


    @Override
    public List<Province> getAllProvince() {
        return provinceRepository.findAll();
    }

    @Override
    public Province addNewProvince(Province province) {
        return provinceRepository.save(province);
    }
}

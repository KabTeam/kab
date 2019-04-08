package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ProvinceRepository;
import cn.bdqn.kab.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;


}

package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ClassgradetypeRepository;
import cn.bdqn.kab.service.ClassgradetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("classgradetypeService")
public class ClassgradetypeServiceImpl implements ClassgradetypeService {
    @Autowired
    private ClassgradetypeRepository classgradetypeRepository;


}

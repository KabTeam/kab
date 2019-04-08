package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ClassgradeRepository;
import cn.bdqn.kab.service.ClassgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("classgradeService")
public class ClassgradeServiceImpl implements ClassgradeService {
    @Autowired
    private ClassgradeRepository classgradeRepository;

}

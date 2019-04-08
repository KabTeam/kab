package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.MembertypeRepository;
import cn.bdqn.kab.service.MembertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("membertypeService")
public class MembertypeServiceImpl implements MembertypeService {
    @Autowired
    private MembertypeRepository membertypeRepository;


}

package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.AdministratorRepository;
import cn.bdqn.kab.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

}

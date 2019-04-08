package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.KabUsersRepository;
import cn.bdqn.kab.service.KabUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("kabUsersService")
public class KabUsersServiceImpl implements KabUsersService {

    @Autowired
    private KabUsersRepository kabUsersRepository;

}

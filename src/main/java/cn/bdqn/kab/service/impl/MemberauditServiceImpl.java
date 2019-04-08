package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.MemberauditRepository;
import cn.bdqn.kab.service.MemberauditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberauditService")
public class MemberauditServiceImpl implements MemberauditService {
    @Autowired
    private MemberauditRepository memberauditRepository;

}

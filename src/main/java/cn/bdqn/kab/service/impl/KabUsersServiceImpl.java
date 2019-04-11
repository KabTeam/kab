package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.KabUsersRepository;
import cn.bdqn.kab.pojo.KabUsers;
import cn.bdqn.kab.service.KabUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("kabUsersService")
public class KabUsersServiceImpl implements KabUsersService {

    @Autowired
    private KabUsersRepository kabUsersRepository;


    public KabUsers addNewKabUser(KabUsers kabUsers)throws  Exception {

        return kabUsersRepository.save(kabUsers);
    }

    @Override
    public KabUsers findByUserName(String userName) throws  Exception{
        return kabUsersRepository.findByUserName(userName);
    }

    @Override
    public KabUsers updateKabUserInfo(KabUsers kabUsers) throws  Exception{
        return kabUsersRepository.saveAndFlush(kabUsers);
    }

    @Override
    public void deleteKabUser(Integer kabUserId) throws  Exception{
        kabUsersRepository.deleteById(kabUserId);
    }

    @Override
    public Page<KabUsers> getKabUsers(Integer currentPage, Integer pageSize) throws  Exception{
        Pageable pageable = PageRequest.of(currentPage,pageSize);
        return kabUsersRepository.findAll(pageable);
    }
}

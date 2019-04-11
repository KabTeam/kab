package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.AdministratorRepository;
import cn.bdqn.kab.pojo.Administrator;
import cn.bdqn.kab.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
      @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public Administrator findByadminName(String adminName) {
        Administrator admin = null;
        try{
            admin=administratorRepository.findByadminName(adminName);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return admin;
    }

    @Override
    public Administrator updateAdminPwd(Administrator administrator) {

        return administratorRepository.saveAndFlush(administrator);
    }
}

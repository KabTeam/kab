package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator,Integer> {

    /**
     * 根据管理员用户名获取管理员
     * @param
     * @return
     */
    public Administrator findByadminName(String adminName)throws Exception;

}

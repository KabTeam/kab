package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.KabUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KabUsersRepository extends JpaRepository<KabUsers,Integer> {
    /**
     *根据用户名查找用户
     * @return
     */
    public KabUsers findByUserName(String userName) throws  Exception;


    /**
     * 根据Id获取用户
     * @param id
     * @return
     */
    public KabUsers findByUserId(Integer id) throws  Exception;

}

package cn.bdqn.kab.dao;

import cn.bdqn.kab.pojo.KabUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KabUsersRepository extends JpaRepository<KabUsers,Integer> {
}

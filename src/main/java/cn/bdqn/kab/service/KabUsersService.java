package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.KabUsers;
import org.springframework.data.domain.Page;

public interface KabUsersService {
    /**
     * 注册新用户
     * @param kabUsers
     * @return
     */
    public KabUsers addNewKabUser(KabUsers kabUsers)  throws  Exception;

    /**
     * 登录
     * @param userName
     * @return
     */
    public KabUsers findByUserName(String userName)  throws  Exception;

    /**
     * 修改会员个人资料
     * @param kabUsers
     * @return
     */
    public KabUsers updateKabUserInfo(KabUsers kabUsers)  throws  Exception;

    /**
     * 删除用户
     * @param kabUserId
     */
    public void deleteKabUser(Integer kabUserId)throws  Exception;

    /**
     * 分页查询所有的用户
     * @param currentPage
     * @param pageSize
     * @return
     */
    public Page<KabUsers> getKabUsersList(Integer currentPage,Integer pageSize)throws  Exception;

    /**
     * 根据Id获取用户信息
     * @return
     */
    public KabUsers getKabUsersById(Integer id)throws  Exception;
}

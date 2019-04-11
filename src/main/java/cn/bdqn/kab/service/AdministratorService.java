package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Administrator;

public interface AdministratorService {

    /**
     * 根据管理员名获取管理员
     * 登录操作(返回管理员对象，控制层判断密码）
     * @return
     */
    public Administrator findByadminName(String adminName) throws Exception;

    /**
     * 修改管理员登录密码
     * @param administrator
     * @return
     */
    public Administrator updateAdminPwd(Administrator administrator)throws Exception;

}

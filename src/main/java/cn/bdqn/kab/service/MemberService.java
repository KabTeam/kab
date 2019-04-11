package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Member;

public interface MemberService {

    /**
     * 注册新会员
     * @param member
     * @return
     */
    public Member addNewMember(Member member);

}

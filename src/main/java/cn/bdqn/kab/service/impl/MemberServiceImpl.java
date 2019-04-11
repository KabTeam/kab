package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.MemberRepository;
import cn.bdqn.kab.pojo.Member;
import cn.bdqn.kab.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public Member addNewMember(Member member) {
        return memberRepository.save(member);
    }
}

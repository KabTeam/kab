package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.SchoolRepository;
import cn.bdqn.kab.pojo.School;
import cn.bdqn.kab.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School addNewSchool(School school) {
        return schoolRepository.save(school);
    }


}

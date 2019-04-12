package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.ClassgradeRepository;
import cn.bdqn.kab.pojo.Classgrade;
import cn.bdqn.kab.service.ClassgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classgradeService")
public class ClassgradeServiceImpl implements ClassgradeService {
    @Autowired
    private ClassgradeRepository classgradeRepository;

    @Override
    public Classgrade addNewClassGrade(Classgrade classgrade) {
        return null;
    }

    @Override
    public void deleteClassGrade(Integer classgradeid) {
        classgradeRepository.deleteById(classgradeid);
    }

    @Override
    public Classgrade updateClassGrade(Classgrade classgrade) {
        return classgradeRepository.saveAndFlush(classgrade);
    }

    @Override
    public List<Classgrade> getClassgradeBySchoolId(Integer schoolId) {
        return classgradeRepository.findBySchoolId(schoolId);
    }
}

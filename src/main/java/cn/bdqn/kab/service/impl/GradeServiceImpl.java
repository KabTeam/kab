package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.GradeRepository;
import cn.bdqn.kab.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gradeService")
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeRepository gradeRepository;


}

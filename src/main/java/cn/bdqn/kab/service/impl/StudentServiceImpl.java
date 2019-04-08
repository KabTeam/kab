package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.StudentRepository;
import cn.bdqn.kab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


}

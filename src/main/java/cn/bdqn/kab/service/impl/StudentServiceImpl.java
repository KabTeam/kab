package cn.bdqn.kab.service.impl;

import cn.bdqn.kab.dao.StudentRepository;
import cn.bdqn.kab.pojo.Student;
import cn.bdqn.kab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentListByClassGradeId(Integer classGradeId) {
        return studentRepository.findByClassGradeId(classGradeId);
    }

    @Override
    public void deleteStudent(List<Integer> stuIds) {
        for (Integer id:stuIds) {
            studentRepository.deleteById(id);
        }
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }
}

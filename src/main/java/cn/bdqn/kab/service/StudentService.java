package cn.bdqn.kab.service;

import cn.bdqn.kab.pojo.Student;

import java.util.List;

public interface StudentService {

    /**
     * 新增学生
     * @param student
     * @return
     */
    public Student addNewStudent(Student student);

    /**
     * 获取班级下的所有学生
     * @param classGradeId
     * @return
     */
    public List<Student> getStudentListByClassGradeId(Integer classGradeId);

    /**
     * 批量删除学生
     * @param stuIds
     */
    public void deleteStudent(List<Integer> stuIds);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    public Student updateStudent(Student student);
}

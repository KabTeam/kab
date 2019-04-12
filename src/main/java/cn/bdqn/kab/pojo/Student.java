package cn.bdqn.kab.pojo;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "STUDENTID")
    private Integer studentid;
    @Column(name = "STUDENT")
    private String student;
    @Column(name = "STUDENTNAME")
    private String studentname;
    @Column(name = "GENDER")
    private Integer gender;
    @Column(name = "AGE")
    private Integer age;

    @ManyToOne()
    @JoinColumn(name = "SCHOOLID")
    private School school;

    @Column(name = "MAJOR")
    private String major;
    @Column(name = "GRADEID")
    private Integer gradeid;

    @ManyToOne()
    @JoinColumn(name = "CLASSGRADEID")
    private Classgrade classGrade;

    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Classgrade getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(Classgrade classGrade) {
        this.classGrade = classGrade;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }
}

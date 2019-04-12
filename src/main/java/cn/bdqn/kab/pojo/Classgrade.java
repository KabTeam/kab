package cn.bdqn.kab.pojo;


import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLASSGRADE")
public class Classgrade {
    @Id
    @GeneratedValue
    @Column(name = "CLASSGRADEID")
    private Integer classgradeid;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="userId")
    private KabUsers kabUsers;

    @ManyToOne()
    @JoinColumn(name = "SCHOOLID")
    private School school;

    @Column(name = "CLASSGRADETYPEID")
    private Integer classgradetypeid;
    @Column(name = "CLASSGRADESTATUS")
    private Integer classgradestatus;
    @Column(name = "CREATEDATE")
    private Date createdate;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;
    @OneToMany(mappedBy = "studentid", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<Student>();
    public Integer getClassgradeid() {
        return classgradeid;
    }

    public void setClassgradeid(Integer classgradeid) {
        this.classgradeid = classgradeid;
    }

    public KabUsers getKabUsers() {
        return kabUsers;
    }

    public void setKabUsers(KabUsers kabUsers) {
        this.kabUsers = kabUsers;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getClassgradetypeid() {
        return classgradetypeid;
    }

    public void setClassgradetypeid(Integer classgradetypeid) {
        this.classgradetypeid = classgradetypeid;
    }

    public Integer getClassgradestatus() {
        return classgradestatus;
    }

    public void setClassgradestatus(Integer classgradestatus) {
        this.classgradestatus = classgradestatus;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

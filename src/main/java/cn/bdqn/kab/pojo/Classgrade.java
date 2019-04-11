package cn.bdqn.kab.pojo;


import javax.persistence.*;
import java.sql.Date;
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
    @Column(name = "SCHOOLID")
    private Integer schoolid;
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

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
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
}

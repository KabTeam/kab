package cn.bdqn.kab.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MID")
    private Integer mid;
    @Column(name = "MTYPEID")
    private Integer mtypeid;
    @Column(name = "REALNAME")
    private String realname;
    @Column(name = "ACADEMY")
    private String academy;
    @Column(name = "DUTY")
    private String duty;
    @Column(name = "ATTHETIME")
    private Integer atthetime;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "BIRTHDAY")
    private Date birthday;
    @Column(name = "EDUCATIONBACKGROUND")
    private String educationbackground;
    @Column(name = "MAJOR")
    private String major;
    @Column(name = "IDNUMBER")
    private String idnumber;
    @Column(name = "CLASSGRADEID")
    private Integer classgradeid;
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Column(name = "FAXNUMBER")
    private String faxnumber;
    @Column(name = "TELEPHONE")
    private String telephone;
    @Column(name = "MAILBOX")
    private String mailbox;
    @Column(name = "CONTACTADDRESS")
    private String contactaddress;
    @Column(name = "MANAGERIALEXPERIENCE")
    private String managerialexperience;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMtypeid() {
        return mtypeid;
    }

    public void setMtypeid(Integer mtypeid) {
        this.mtypeid = mtypeid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Integer getAtthetime() {
        return atthetime;
    }

    public void setAtthetime(Integer atthetime) {
        this.atthetime = atthetime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Integer getClassgradeid() {
        return classgradeid;
    }

    public void setClassgradeid(Integer classgradeid) {
        this.classgradeid = classgradeid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public String getManagerialexperience() {
        return managerialexperience;
    }

    public void setManagerialexperience(String managerialexperience) {
        this.managerialexperience = managerialexperience;
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

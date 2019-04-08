package cn.bdqn.kab.pojo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MEMBERAUDIT")
public class Memberaudit {
    @Id
    @GeneratedValue
    @Column(name = "MEMBERAUDITID")
    private Integer memberauditid;
    @Column(name = "USERID")
    private Integer userid;
    @Column(name = "ADMINID")
    private Integer adminid;
    @Column(name = "AUDITCREATEDATE")
    private Date auditcreatedate;
    @Column(name = "AUDITUPDATEDATE")
    private Date auditupdatedate;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getMemberauditid() {
        return memberauditid;
    }

    public void setMemberauditid(Integer memberauditid) {
        this.memberauditid = memberauditid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getAuditcreatedate() {
        return auditcreatedate;
    }

    public void setAuditcreatedate(Date auditcreatedate) {
        this.auditcreatedate = auditcreatedate;
    }

    public Date getAuditupdatedate() {
        return auditupdatedate;
    }

    public void setAuditupdatedate(Date auditupdatedate) {
        this.auditupdatedate = auditupdatedate;
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

package cn.bdqn.kab.pojo;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "NOTICE")
public class Notice {
    @Id
    @GeneratedValue
    @Column(name = "NOTICEID")
    private Integer noticeid;
    @Column(name = "NOTICETITLE")
    private String noticetitle;
    @Column(name = "NOTICEAUTHOR")
    private String noticeauthor;
    @Column(name = "NOTICERANK")
    private Integer noticerank;
    @Column(name = "NOTICECONTENT")
    private String noticecontent;
    @Column(name = "ISSUEDATE")
    private Date issuedate;
    @Column(name = "UPDATEDATE")
    private Date updatedate;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle;
    }

    public String getNoticeauthor() {
        return noticeauthor;
    }

    public void setNoticeauthor(String noticeauthor) {
        this.noticeauthor = noticeauthor;
    }

    public Integer getNoticerank() {
        return noticerank;
    }

    public void setNoticerank(Integer noticerank) {
        this.noticerank = noticerank;
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
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

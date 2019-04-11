package cn.bdqn.kab.pojo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "COMMENTS")
public class Comments {
    @Id
    @GeneratedValue
    @Column(name = "COMMENTID")
    private Integer commentid;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="articleid")
    private Article article;

    @Column(name = "USERID")
    private Integer userid;
    @Column(name = "COMMENTCONTENT")
    private String commentcontent;
    @Column(name = "COMMENTDATE")
    private Date commentdate;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
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

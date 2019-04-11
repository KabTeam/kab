package cn.bdqn.kab.pojo;

import javax.persistence.*;

@Entity
@Table(name = "KABUSERS")
public class KabUsers {
    @Id
    @GeneratedValue()
    @Column(name = "USERID")
    private Integer userId;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "USERPWD")
    private String userPwd;
    @Column(name = "MAILBOX")
    private String mailBox;
    @Column(name = "SECURITYQUESTION")
    private String securityQuestion;
    @Column(name = "SECURITYANSWER")
    private String securityAnswer;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="MEMBERID", unique=true)
    private Member member;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}

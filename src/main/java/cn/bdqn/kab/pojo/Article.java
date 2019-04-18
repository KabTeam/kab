package cn.bdqn.kab.pojo;


        import javax.persistence.*;
        import java.sql.Date;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

@Entity
@Table(name = "ARTICLE")
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "ARTICLEID")
    private Integer articleid;
    @Column(name = "ARTICLETYPEID")
    private Integer articletypeid;
    @Column(name = "ARTICLETITLE")
    private String articletitle;
    @Column(name = "ARTICLEAUTHOR")
    private String articleauthor;
    @Column(name = "PV")
    private Integer pv;
    @Column(name = "ISRECOMMEND")
    private Integer isrecommend;
    @Column(name = "ARTICLECONTENT")
    private String articlecontent;
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

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Comments> commentsLst = new HashSet<Comments>();

    public Set<Comments> getCommentsLst() {
        return commentsLst;
    }

    public void setCommentsLst(Set<Comments> commentsLst) {
        this.commentsLst = commentsLst;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public Integer getArticletypeid() {
        return articletypeid;
    }

    public void setArticletypeid(Integer articletypeid) {
        this.articletypeid = articletypeid;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle;
    }

    public String getArticleauthor() {
        return articleauthor;
    }

    public void setArticleauthor(String articleauthor) {
        this.articleauthor = articleauthor;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent;
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

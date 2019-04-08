package cn.bdqn.kab.pojo;


import javax.persistence.*;

@Entity
@Table(name = "CLASSGRADETYPE")
public class Classgradetype {
    @Id
    @GeneratedValue
    @Column(name = "CLASSGRADETYPEID")
    private Integer classgradetypeid;
    @Column(name = "CLASSGRADETYPENAME")
    private String classgradetypename;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getClassgradetypeid() {
        return classgradetypeid;
    }

    public void setClassgradetypeid(Integer classgradetypeid) {
        this.classgradetypeid = classgradetypeid;
    }

    public String getClassgradetypename() {
        return classgradetypename;
    }

    public void setClassgradetypename(String classgradetypename) {
        this.classgradetypename = classgradetypename;
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

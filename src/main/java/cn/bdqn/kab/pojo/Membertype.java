package cn.bdqn.kab.pojo;

import javax.persistence.*;

@Entity
@Table(name = "MEMBERTYPE")
public class Membertype {
    @Id
    @GeneratedValue
    @Column(name = "MTYPEID")
    private Integer mtypeid;
    @Column(name = "MTYPENAME")
    private String mtypename;
    @Column(name = "DESCRIBE")
    private String describe;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getMtypeid() {
        return mtypeid;
    }

    public void setMtypeid(Integer mtypeid) {
        this.mtypeid = mtypeid;
    }

    public String getMtypename() {
        return mtypename;
    }

    public void setMtypename(String mtypename) {
        this.mtypename = mtypename;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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

package cn.bdqn.kab.pojo;

import javax.persistence.*;

@Entity
@Table(name = "PROVINCE")
public class Province {
    @Id
    @GeneratedValue
    @Column(name = "PROVINCEID")
    private Integer provinceid;
    @Column(name = "PROVINCENAME")
    private String provincename;
    @Column(name = "SORT")
    private Integer sort;
    @Column(name = "CUSTOM1")
    private String custom1;
    @Column(name = "CUSTOM2")
    private String custom2;
    @Column(name = "CUSTOM3")
    private String custom3;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

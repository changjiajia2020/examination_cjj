package com.fh.entity_cjj.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_home")
public class Home_cjj {

    @TableId(value = "hid",type = IdType.AUTO)
    private Integer hid;   //	number(10)	主键ID
    @TableField("hname")
    private String hname;   //	varchar2(120)//	放映室名称

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Override
    public String toString() {
        return "Home_cjj{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                '}';
    }
}

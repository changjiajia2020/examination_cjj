package com.fh.entity_cjj.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@TableName("t_movie")
public class Movie_cjj {

    @TableId(value = "mid",type = IdType.AUTO)
    private Integer mid;    //	number(10)	主键ID
    @TableField("mname")
    private String mname;   //	varchar2(120)	电影名称
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")	// springMVC绑定报错
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("showTime")
    private Date showTime;   //	date	放映时间    年月日  时分秒
    @TableField("num")
    private Integer num;    //	int	余票数量
    @TableField("price")
    private BigDecimal price;   //	Number(2)	价格
    @TableField("imgUrl")
    private String imgUrl; //	varchar2(200)	图片保存路径
    // 外键
    @TableField("showHomeId")
    private Integer showHomeId;   //	number	放映室的ID

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getShowHomeId() {
        return showHomeId;
    }

    public void setShowHomeId(Integer showHomeId) {
        this.showHomeId = showHomeId;
    }

    @Override
    public String toString() {
        return "Movie_cjj{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", showTime=" + showTime +
                ", num=" + num +
                ", price=" + price +
                ", imgUrl='" + imgUrl + '\'' +
                ", showHomeId=" + showHomeId +
                '}';
    }
}

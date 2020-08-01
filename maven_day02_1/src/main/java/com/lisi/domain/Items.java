package com.lisi.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: 可爱的李四
 * @createTime: 2020/6/28 15:14
 * @version: 1.0.0
 * @place: 公司
 * @copyright: 老九学堂
 */
public class Items implements Serializable {

    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

package com.vito16.shop.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 图片实体
 * @author 木鱼 muyu@yiji.com
 * @version 2014/10/14
 */
@Entity
@DynamicUpdate
@Table(name = "t_picture")
public class Picture {
    private Integer id;
    private String title;
    private String memo;
    private String url;
    private Date updateTime;
    private User updateUser;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @ManyToOne
    @JoinColumn
    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }
}

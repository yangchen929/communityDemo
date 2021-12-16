package com.company.dao.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String username;//登录名
    private String realname;//真实名
    private String password;//密码 使用md5加密
    private String phone;//手机号
    private String email;//邮箱
    private Date hiredate;//入职日期
    /**
     * 1：超级管理员角色，不能删除，因为没有注册页面
     * 2：普通管理员角色，可以赋权限
     */
    private Integer type;
    private String img;//个人头像
    private Integer available;//状态 0：未启用 1.已启用


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hiredate=" + hiredate +
                ", img='" + img + '\'' +
                ", available=" + available +
                '}';
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public User(Integer id, String username, String realname, String password, String phone, String email, Date hiredate, Integer type, String img, Integer available) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;

        this.phone = phone;
        this.email = email;
        this.hiredate = hiredate;
        this.type = type;
        this.img = img;
        this.available = available;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}

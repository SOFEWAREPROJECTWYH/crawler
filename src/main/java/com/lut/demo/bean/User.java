package com.lut.demo.bean;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String salt;

    private String password;

    private String phone;

    private String email;

    private String gender;

    private String created_user;

    private Date created_time;

    private String modified_user;

    private Date modified_time;

    private String image;

    public User(Integer id, String username, String salt, String password, String phone, String email, String gender, String created_user, Date created_time, String modified_user, Date modified_time, String image) {
        this.id = id;
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.created_user = created_user;
        this.created_time = created_time;
        this.modified_user = modified_user;
        this.modified_time = modified_time;
        this.image = image;
    }

    public User() {
        super();
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
        this.username = username == null ? null : username.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCreated_user() {
        return created_user;
    }

    public void setCreated_user(String created_user) {
        this.created_user = created_user == null ? null : created_user.trim();
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getModified_user() {
        return modified_user;
    }

    public void setModified_user(String modified_user) {
        this.modified_user = modified_user == null ? null : modified_user.trim();
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}
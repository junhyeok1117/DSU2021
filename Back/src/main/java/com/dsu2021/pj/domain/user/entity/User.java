package com.dsu2021.pj.domain.user.entity;

public class User {
    private Long user_id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public User(Long user_id, String name, String email, String address, String phone) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}

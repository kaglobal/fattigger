package com.tigger.serviceprovder.model.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private  String id;
    private  String age;
    private  String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

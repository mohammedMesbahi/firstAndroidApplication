package com.mehditmimi.myapplication.beans;

public class User {
    private String loign;
    private String pwd;
    private String name;

    public User(String loign, String pwd, String name) {
        this.loign = loign;
        this.pwd = pwd;
        this.name = name;
    }

    public String getLoign() {
        return loign;
    }

    public void setLoign(String loign) {
        this.loign = loign;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

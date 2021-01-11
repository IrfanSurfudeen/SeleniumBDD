package com.seleniumautomation.envutils;

import java.util.List;

public class Environment {

    public String browser;
    //    public Users users;
    public String applicationurl;
    public String username;
    public String password;
    public String seleniumappurl;
//    public List<Users> users;

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return this.browser;
    }

    public void setApplicationurl(String applicationurl) {
        this.applicationurl = applicationurl;
    }

    public String getApplicationurl() {
        return this.applicationurl;
    }
//    public void setUsers(List<Users> users){
//        this.users = users;
//    }
//    public List<Users> getUsers() {  return this.getUsers();}

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setseleniumappurl(String seleniumappurl) {
        this.seleniumappurl = seleniumappurl;
    }

    public String getseleniumappurl() {
        return this.seleniumappurl;
    }

}
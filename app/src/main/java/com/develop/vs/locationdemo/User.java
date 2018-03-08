package com.develop.vs.locationdemo;

/**
 * Created by vamshi on 7/3/18.
 */

public class User {

    String username;
    String loc;

    public User(String username,String loc) {
        this.username = username;
        this.loc=loc;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

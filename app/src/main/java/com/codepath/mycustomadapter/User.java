package com.codepath.mycustomadapter;

import java.util.ArrayList;

/**
 * Created by Sylmene Anicet on 2/7/2018.
 */

public class User {
    public String name;
    public String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    //retrieve user's name
    public String getName(){
        return name;
    }

    //retrieve users' hometown
    public String getHometown(){
        return hometown;
    }
}

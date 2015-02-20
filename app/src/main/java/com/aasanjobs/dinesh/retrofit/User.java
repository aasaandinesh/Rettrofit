package com.aasanjobs.dinesh.retrofit;

/**
 * Created by dineshsingh on 19/02/15.
 */
public class User extends BaseDO{



    public User(){
        super();
        url="users";
        ;
    }

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

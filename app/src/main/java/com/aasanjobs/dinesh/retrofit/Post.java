package com.aasanjobs.dinesh.retrofit;

/**
 * Created by dineshsingh on 19/02/15.
 */
public class Post extends BaseDO{

    public Post(){
        super();
        url="posts";
    }

    private int userId;
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

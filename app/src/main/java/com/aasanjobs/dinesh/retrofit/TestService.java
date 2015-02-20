package com.aasanjobs.dinesh.retrofit;


import java.util.List;

import retrofit.http.GET;

/**
 * Created by dineshsingh on 19/02/15.
 */


public interface TestService {

@GET("/users")
    public List<User> getUsers();


}

package com.aasanjobs.dinesh.retrofit;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by dineshsingh on 19/02/15.
 */
public interface CustomREST {
    @GET("/{url}")
    public <T>  void get( @Path("url") String url,Callback<T> tCallback);
}

package com.aasanjobs.dinesh.retrofit;

import android.util.Log;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by dineshsingh on 19/02/15.
 */
public class BaseDO {

private RestAdapter r;
    protected String url;


    public  BaseDO() {
         r = new RestAdapter.Builder()
                .setEndpoint("http://jsonplaceholder.typicode.com/")
                .build();

    }

    public <T> void  get( final Callback<T> test) {
        CustomREST c = r.create(CustomREST.class);
        Log.v("retrofit",url);
        c.get(url, new Callback<T>() {
            @Override
            public void success(T t, Response response) {
                test.success(t, response);

            }

            @Override
            public void failure(RetrofitError error) {
                test.failure(error);
                Log.e("retrofit",error.getMessage());

            }
        });




    }
}

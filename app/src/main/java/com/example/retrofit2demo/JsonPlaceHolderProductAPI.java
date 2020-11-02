package com.example.retrofit2demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderProductAPI {
//    @GET("comphan")
//    Call<List<Product>> getRices();
//    @GET("trasua")
//    Call<List<Product>> getMilkTeas();
//    @GET("anvat")
//    Call<List<Product>> getSnacks();
//    @GET("bunpho")
//    Call<List<Product>> getNoodles();
//    @POST("test_retrofit")
//    @FormUrlEncoded
//    Call<Product> saveProduct(@Field("name") String username,
//                              @Field("address") String address);
    @POST("getlistshortnewsrq")
    Call<Poco> getlistshortnewsrq(@Body post post);
}

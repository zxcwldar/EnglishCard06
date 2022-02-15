package com.example.englishcard06.network;

import com.example.englishcard06.network.model.PixabayResponce;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabyApi {
    @GET("/api")
    Call<PixabayResponce> getImages(@Query("key") String key ,@Query("q") String englishWord);
}

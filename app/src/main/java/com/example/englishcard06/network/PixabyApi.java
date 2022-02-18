package com.example.englishcard06.network;

import com.example.englishcard06.network.model.PixabayResponce;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabyApi {
    @GET("/api?key=25677632-bbb6922cae47b99f5d2f289c0")
    Call<PixabayResponce> getImageBySearch(@Query("q") String keyWord);
}

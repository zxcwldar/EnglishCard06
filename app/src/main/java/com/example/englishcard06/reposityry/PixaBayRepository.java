package com.example.englishcard06.reposityry;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.englishcard06.App;
import com.example.englishcard06.network.model.Hits;
import com.example.englishcard06.network.model.PixabayResponce;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PixaBayRepository {

    static PixaBayRepository pixaBayRepository;

    public static PixaBayRepository getInstance(){
        if (pixaBayRepository == null){
            return new PixaBayRepository();
        }
        return pixaBayRepository; }


    public MutableLiveData<List<Hits>> getImage(String word){
        MutableLiveData<List<Hits>> listImages = new MutableLiveData<>();
        App.api.getImageBySearch(word).enqueue(new Callback<PixabayResponce>() {
            @Override
            public void onResponse(@NonNull Call<PixabayResponce> call, @NonNull Response<PixabayResponce> response) {
                if (response.isSuccessful()){
                    listImages.postValue(response.body().getHits());
                }
            }

            @Override
            public void onFailure(Call<PixabayResponce> call, Throwable t) {
                Log.e("ololo", t.getMessage());
            }
        });
        return listImages;
    }
}


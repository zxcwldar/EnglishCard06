package com.example.englishcard06.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.englishcard06.App;
import com.example.englishcard06.R;
import com.example.englishcard06.activity.ui.adapter.AdapterWords;
import com.example.englishcard06.base.BaseFragment;
import com.example.englishcard06.databinding.FragmentWordsBinding;
import com.example.englishcard06.network.model.Hits;
import com.example.englishcard06.network.model.PixabayResponce;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WordsFragment extends BaseFragment<FragmentWordsBinding> {
    private AdapterWords adapterWords;
    private LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());

    @Override
    public FragmentWordsBinding bind() {
        return FragmentWordsBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.recyclerWords.setLayoutManager(linearLayout);
        adapterWords = new AdapterWords();
        getImages();
    }


    private void getImages() {
        String word = binding.wordsEt.getText().toString();
        App.retrofitClient.providePixabayApi().getImages("25677632-bbb6922cae47b99f5d2f289c0", word)
                .enqueue(new Callback<PixabayResponce>() {
                    @Override
                    public void onResponse(Call<PixabayResponce> call, Response<PixabayResponce> response) {
                        if (response.isSuccessful()) {
                            adapterWords.setList((ArrayList<Hits>) response.body().getHits());
                            binding.recyclerWords.setAdapter(adapterWords);
                            Log.e("ololo", "" + response.body());

                        }
                    }

                    @Override
                    public void onFailure(Call<PixabayResponce> call, Throwable t) {
                        Log.e("ololo", t.getMessage());

                    }
                });

    }

}

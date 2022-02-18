package com.example.englishcard06.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.englishcard06.network.model.Hits;
import com.example.englishcard06.reposityry.PixaBayRepository;

import java.util.List;

public class PixaBayViewModel extends ViewModel {

    public MutableLiveData<List<Hits>> hitMutableLiveData = new MutableLiveData<>();

    PixaBayRepository repository = PixaBayRepository.getInstance();

    public MutableLiveData<List<Hits>> getImages(String word){
        hitMutableLiveData = repository.getImage(word);
        return hitMutableLiveData;
    }
}


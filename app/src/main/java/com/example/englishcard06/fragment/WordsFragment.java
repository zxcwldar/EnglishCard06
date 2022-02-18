package com.example.englishcard06.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.example.englishcard06.viewmodel.PixaBayViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WordsFragment extends BaseFragment<FragmentWordsBinding> {
    private AdapterWords adapterWords;
    PixaBayViewModel viewModel;
    private Handler handler;


    @Override
    public FragmentWordsBinding bind() {
        return FragmentWordsBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(PixaBayViewModel.class);
        initAdapter();
        listener();
    }


    private void listener() {
        binding.edWords.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (handler != null){
                    handler= null;
                }

            }

            @Override
            public void afterTextChanged(  Editable editable) {
                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        binding.progressBar.setVisibility(View.VISIBLE);
                        viewModel.getImages(binding.edWords.getText().toString()).observe(getViewLifecycleOwner(), hits -> {
                            if (hits != null) {
                                binding.progressBar.setVisibility(View.GONE);
                                binding.recyclerView.setAdapter(adapterWords);
                                adapterWords.setData((ArrayList<Hits>) hits);
                            }
                        });
                    }
                }, 2000);
            }
        });
    }


    private void initAdapter() {
        adapterWords= new AdapterWords();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding= null;
    }
}

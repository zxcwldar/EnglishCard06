package com.example.englishcard06.activity.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.englishcard06.databinding.ItemWordsBinding;
import com.example.englishcard06.network.model.Hits;

import java.util.ArrayList;
import java.util.List;

public class AdapterWords extends RecyclerView.Adapter<AdapterWords.HolderWords> {
    private ItemWordsBinding binding;
    List<Hits> list = new ArrayList<>();


    @NonNull
    @Override
    public HolderWords onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemWordsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new HolderWords(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderWords holder, int position) {
        holder.OnBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<Hits> list) {
        this.list = list;
    }

    public class HolderWords extends RecyclerView.ViewHolder {
        ItemWordsBinding binding;

        public HolderWords(@NonNull ItemWordsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void OnBind(Hits model) {
            Glide.with(binding.imageVw).load(model.getLargeImageURL()).into(binding.imageVw);

        }
    }

}

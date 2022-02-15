package com.example.englishcard06.fragment;

import com.example.englishcard06.base.BaseFragment;
import com.example.englishcard06.databinding.FragmentCategoryBinding;

public class CategoryFragment extends BaseFragment<FragmentCategoryBinding> {
    @Override
    public FragmentCategoryBinding bind() {
        return FragmentCategoryBinding.inflate(getLayoutInflater());
    }
}

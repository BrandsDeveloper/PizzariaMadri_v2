package com.cursoandroid.pizzariamadri_tcc.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.pizzariamadri_tcc.ViewPagerAdapter;
import com.cursoandroid.pizzariamadri_tcc.databinding.FragmentMenuBinding;

import java.util.Objects;

public class menu extends Fragment {

    private FragmentMenuBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMenuBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new promocoes(), "");
        adapter.addFragment(new pizzas(), "");
        adapter.addFragment(new entradas(), "");
        adapter.addFragment(new sobremesas(), "");

        binding.viewpager.setAdapter(adapter);
        binding.tabsNavigation.setupWithViewPager(binding.viewpager);

        Objects.requireNonNull(binding.tabsNavigation.getTabAt(0)).setText("Promoções");
        Objects.requireNonNull(binding.tabsNavigation.getTabAt(1)).setText("Pizza");
        Objects.requireNonNull(binding.tabsNavigation.getTabAt(2)).setText("Entradas");
        Objects.requireNonNull(binding.tabsNavigation.getTabAt(3)).setText("Sobremesas");


    }


}

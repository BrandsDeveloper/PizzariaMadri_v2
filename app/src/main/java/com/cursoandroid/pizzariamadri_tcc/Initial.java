package com.cursoandroid.pizzariamadri_tcc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.cursoandroid.pizzariamadri_tcc.databinding.ActivityInicialBinding;
import com.cursoandroid.pizzariamadri_tcc.fragments.Inicio;
import com.cursoandroid.pizzariamadri_tcc.fragments.conta;
import com.cursoandroid.pizzariamadri_tcc.fragments.menu;
import com.cursoandroid.pizzariamadri_tcc.fragments.pedidos;

public class Initial extends AppCompatActivity {

    private ActivityInicialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInicialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main2);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }

}
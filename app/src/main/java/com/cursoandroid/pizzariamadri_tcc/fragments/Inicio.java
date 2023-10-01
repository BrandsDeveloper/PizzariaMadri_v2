package com.cursoandroid.pizzariamadri_tcc.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.cursoandroid.pizzariamadri_tcc.R;

public class Inicio extends Fragment implements View.OnClickListener {

    TextView Ofertas01, Ofertas02, userName01;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        userName01 = view.findViewById(R.id.userName01);

        Bundle args = getArguments();
        if (args != null) {
            String nome = args.getString("nome");
            userName01.setText(nome);
        }

        Ofertas01 = (TextView) view.findViewById(R.id.viewOfertas01);
        Ofertas02 = (TextView) view.findViewById(R.id.viewOfertas02);

        Ofertas01.setOnClickListener(this);
        Ofertas02.setOnClickListener(this);

        HorizontalScrollView horizontalScrollView = view.findViewById(R.id.horizontal_scroll_view);
        HorizontalScrollView horizontalScrollView2 = view.findViewById(R.id.horizontal_scroll_view2);

        // Desabilita a exibição da barra de rolagem horizontal
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.viewOfertas01 || v.getId() == R.id.viewOfertas02){
            BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.nav_view);
            bottomNavigationView.setSelectedItemId(R.id.page_menu);
        }
    }
}
package com.cursoandroid.pizzariamadri_tcc.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.cursoandroid.pizzariamadri_tcc.Pizza;
import com.cursoandroid.pizzariamadri_tcc.R;

public class sobremesas extends Fragment implements View.OnClickListener{


    LinearLayout sobre01 ,sobre02, sobre03, sobre04, sobre05, sobre06;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sobremesas, container, false);

        sobre01 = (LinearLayout) view.findViewById(R.id.entra01);
        sobre02 = (LinearLayout) view.findViewById(R.id.entra02);
        sobre03 = (LinearLayout) view.findViewById(R.id.entra03);
        sobre04 = (LinearLayout) view.findViewById(R.id.entra04);
        sobre05 = (LinearLayout) view.findViewById(R.id.entra05);
        sobre06 = (LinearLayout) view.findViewById(R.id.entra06);

        sobre01.setOnClickListener(this);
        sobre02.setOnClickListener(this);
        sobre03.setOnClickListener(this);
        sobre04.setOnClickListener(this);
        sobre05.setOnClickListener(this);
        sobre06.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){

        if(v.getId() == R.id.entra01){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Banana));
            intent.putExtra("descricao_pizza", getString(R.string.descBanana));
            intent.putExtra("valor_pizza", getString(R.string.valorBanana));
            intent.putExtra("imagem_pizza", R.drawable.branco);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra02){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.MeMs));
            intent.putExtra("descricao_pizza", getString(R.string.descMeMs));
            intent.putExtra("valor_pizza", getString(R.string.valorMeMs));
            intent.putExtra("imagem_pizza", R.drawable.m_e_m);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra03){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Morango));
            intent.putExtra("descricao_pizza", getString(R.string.descMorango));
            intent.putExtra("valor_pizza", getString(R.string.valorMorango));
            intent.putExtra("imagem_pizza", R.drawable.morango);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra04){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Oreo));
            intent.putExtra("descricao_pizza", getString(R.string.descOreo));
            intent.putExtra("valor_pizza", getString(R.string.valorOreo));
            intent.putExtra("imagem_pizza", R.drawable.oreo);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra05){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Prestigio));
            intent.putExtra("descricao_pizza", getString(R.string.descPrestigio));
            intent.putExtra("valor_pizza", getString(R.string.valorPrestigio));
            intent.putExtra("imagem_pizza", R.drawable.prestigio);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra06){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Sonho));
            intent.putExtra("descricao_pizza", getString(R.string.descSonho));
            intent.putExtra("valor_pizza", getString(R.string.valorSonho));
            intent.putExtra("imagem_pizza", R.drawable.sonho);
            startActivity(intent);
        }

    }
}
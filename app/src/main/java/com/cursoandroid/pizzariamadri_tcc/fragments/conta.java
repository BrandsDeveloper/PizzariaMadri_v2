package com.cursoandroid.pizzariamadri_tcc.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.pizzariamadri_tcc.Login;
import com.cursoandroid.pizzariamadri_tcc.Politicas;
import com.cursoandroid.pizzariamadri_tcc.R;
import com.cursoandroid.pizzariamadri_tcc.cadastro;
import com.cursoandroid.pizzariamadri_tcc.termos;
import com.cursoandroid.pizzariamadri_tcc.version;

public class conta extends Fragment implements View.OnClickListener {


    TextView meusDados,termos,privacidade,versionApp;
    ImageView seta01,seta02,seta03,seta04;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_conta, container, false);

//        meusDados = (TextView) view.findViewById(R.id.meusDados);
        termos = (TextView) view.findViewById(R.id.termos);
        privacidade = (TextView) view.findViewById(R.id.privacidade);
        versionApp = (TextView) view.findViewById(R.id.versionApp);

//        seta01 = (ImageView) view.findViewById(R.id.seta01);
        seta02 = (ImageView) view.findViewById(R.id.seta02);
        seta03 = (ImageView) view.findViewById(R.id.seta03);
        seta04 = (ImageView) view.findViewById(R.id.seta04);

//        meusDados.setOnClickListener(this);
        termos.setOnClickListener(this);
        privacidade.setOnClickListener(this);
        versionApp.setOnClickListener(this);

//        seta01.setOnClickListener(this);
        seta02.setOnClickListener(this);
        seta03.setOnClickListener(this);
        seta04.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){

//        if(v.getId() == R.id.meusDados || v.getId() == R.id.seta01){
//            Intent dados = new Intent(getActivity(), Login.class);
//            startActivity(dados);
//        }

        if(v.getId() == R.id.termos || v.getId() == R.id.seta02){
            Intent termosUso = new Intent(getActivity(), termos.class);
            startActivity(termosUso);
        }

        if(v.getId() == R.id.privacidade || v.getId() == R.id.seta03){
            Intent privacidade = new Intent(getActivity(), Politicas.class);
            startActivity(privacidade);
        }

        if(v.getId() == R.id.versionApp || v.getId() == R.id.seta04){
            Intent version = new Intent(getActivity(), version.class);
            startActivity(version);
        }

    }
}
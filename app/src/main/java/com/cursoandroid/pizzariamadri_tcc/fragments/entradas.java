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

public class entradas extends Fragment implements View.OnClickListener{


    LinearLayout entra01 ,entra02, entra03, entra04, entra05, entra06;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_entradas, container, false);

        entra01 = (LinearLayout) view.findViewById(R.id.entra01);
        entra02 = (LinearLayout) view.findViewById(R.id.entra02);
        entra03 = (LinearLayout) view.findViewById(R.id.entra03);
        entra04 = (LinearLayout) view.findViewById(R.id.entra04);
        entra05 = (LinearLayout) view.findViewById(R.id.entra05);
        entra06 = (LinearLayout) view.findViewById(R.id.entra06);

        entra01.setOnClickListener(this);
        entra02.setOnClickListener(this);
        entra03.setOnClickListener(this);
        entra04.setOnClickListener(this);
        entra05.setOnClickListener(this);
        entra06.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){

        if(v.getId() == R.id.entra01){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Bacalhau));
            intent.putExtra("descricao_pizza", getString(R.string.descBacalhau));
            intent.putExtra("valor_pizza", getString(R.string.valorBacalhau));
            intent.putExtra("imagem_pizza", R.drawable.bacalhau);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra02){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Bruschetta));
            intent.putExtra("descricao_pizza", getString(R.string.descBruschetta));
            intent.putExtra("valor_pizza", getString(R.string.valorBruschetta));
            intent.putExtra("imagem_pizza", R.drawable.bruschetta);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra03){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Croquetes));
            intent.putExtra("descricao_pizza", getString(R.string.descCroquetes));
            intent.putExtra("valor_pizza", getString(R.string.valorCroquetes));
            intent.putExtra("imagem_pizza", R.drawable.croquetes);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra04){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Rissois));
            intent.putExtra("descricao_pizza", getString(R.string.descRissois));
            intent.putExtra("valor_pizza", getString(R.string.valorRissois));
            intent.putExtra("imagem_pizza", R.drawable.rissois);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra05){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Abobrinha));
            intent.putExtra("descricao_pizza", getString(R.string.descAbobrinha));
            intent.putExtra("valor_pizza", getString(R.string.valorAbobrinha));
            intent.putExtra("imagem_pizza", R.drawable.abobrinha);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra06){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Berinjela));
            intent.putExtra("descricao_pizza", getString(R.string.descBerinjela));
            intent.putExtra("valor_pizza", getString(R.string.valorBerinjela));
            intent.putExtra("imagem_pizza", R.drawable.berinjela);
            startActivity(intent);
        }

    }
}
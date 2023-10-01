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

public class pizzas extends Fragment implements View.OnClickListener{


    LinearLayout pizzas01 ,pizzas02, pizzas03, pizzas04, pizzas05, pizzas06, pizzas07, pizzas08, pizzas09;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pizzas, container, false);

        pizzas01 = (LinearLayout) view.findViewById(R.id.entra01);
        pizzas02 = (LinearLayout) view.findViewById(R.id.entra02);
        pizzas03 = (LinearLayout) view.findViewById(R.id.entra03);
        pizzas04 = (LinearLayout) view.findViewById(R.id.entra04);
        pizzas05 = (LinearLayout) view.findViewById(R.id.entra05);
        pizzas06 = (LinearLayout) view.findViewById(R.id.entra06);
        pizzas07 = (LinearLayout) view.findViewById(R.id.pizzas07);
        pizzas08 = (LinearLayout) view.findViewById(R.id.pizzas08);
        pizzas09 = (LinearLayout) view.findViewById(R.id.pizzas09);

        pizzas01.setOnClickListener(this);
        pizzas02.setOnClickListener(this);
        pizzas03.setOnClickListener(this);
        pizzas04.setOnClickListener(this);
        pizzas05.setOnClickListener(this);
        pizzas06.setOnClickListener(this);
        pizzas07.setOnClickListener(this);
        pizzas08.setOnClickListener(this);
        pizzas09.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){

        if(v.getId() == R.id.entra01){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Pepperoni));
            intent.putExtra("descricao_pizza", getString(R.string.descPepperoni));
            intent.putExtra("valor_pizza", getString(R.string.valorPepperoni));
            intent.putExtra("imagem_pizza", R.drawable.pepperoni);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra02){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Napolitana));
            intent.putExtra("descricao_pizza", getString(R.string.descNapolitana));
            intent.putExtra("valor_pizza", getString(R.string.valorNapolitana));
            intent.putExtra("imagem_pizza", R.drawable.napolitana);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra03){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Portuguesa));
            intent.putExtra("descricao_pizza", getString(R.string.descPortuguesa));
            intent.putExtra("valor_pizza", getString(R.string.valorPortuguesa));
            intent.putExtra("imagem_pizza", R.drawable.portuguesa);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra04){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Calabresa));
            intent.putExtra("descricao_pizza", getString(R.string.descCalabresa));
            intent.putExtra("valor_pizza", getString(R.string.valorCalabresa));
            intent.putExtra("imagem_pizza", R.drawable.calabresa);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra05){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Queijo));
            intent.putExtra("descricao_pizza", getString(R.string.descQueijo));
            intent.putExtra("valor_pizza", getString(R.string.valorQueijo));
            intent.putExtra("imagem_pizza", R.drawable.queijo);
            startActivity(intent);
        }

        if(v.getId() == R.id.entra06){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Marguerita));
            intent.putExtra("descricao_pizza", getString(R.string.descMarguerita));
            intent.putExtra("valor_pizza", getString(R.string.valorMarguerita));
            intent.putExtra("imagem_pizza", R.drawable.marguerita);
            startActivity(intent);
        }

        if(v.getId() == R.id.pizzas07){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Cogumelos));
            intent.putExtra("descricao_pizza", getString(R.string.descCogumelos));
            intent.putExtra("valor_pizza", getString(R.string.valorCogumelos));
            intent.putExtra("imagem_pizza", R.drawable.cogumelo);
            startActivity(intent);
        }

        if(v.getId() == R.id.pizzas08){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.QueijoT));
            intent.putExtra("descricao_pizza", getString(R.string.descQueijoT));
            intent.putExtra("valor_pizza", getString(R.string.valorQueijoT));
            intent.putExtra("imagem_pizza", R.drawable.queijo_tomate);
            startActivity(intent);
        }

        if(v.getId() == R.id.pizzas09){
            Intent intent = new Intent(getActivity(), Pizza.class);
            intent.putExtra("nome_pizza", getString(R.string.Frango));
            intent.putExtra("descricao_pizza", getString(R.string.descFrango));
            intent.putExtra("valor_pizza", getString(R.string.valorFrango));
            intent.putExtra("imagem_pizza", R.drawable.frango);
            startActivity(intent);
        }


    }
}
package com.cursoandroid.pizzariamadri_tcc.fragments;

import static android.content.Intent.getIntent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.pizzariamadri_tcc.Login;
import com.cursoandroid.pizzariamadri_tcc.Pizza;
import com.cursoandroid.pizzariamadri_tcc.R;
import com.cursoandroid.pizzariamadri_tcc.envioPedido;

public class dropdownPedidos extends Fragment implements View.OnClickListener{

    private TextView tituloPizza, valorPizza, dropValue2;
    private ImageView pizzaImg;
    private Button btnSolicitar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_dropdown_pedidos, container, false);


        dropValue2 = view.findViewById(R.id.dropValue2);

        btnSolicitar = view.findViewById(R.id.btnSolicitar);
        btnSolicitar.setOnClickListener(this);

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



//        pizzaImg = view.findViewById(R.id.dropImage);
//        tituloPizza = view.findViewById(R.id.dropTitle);
//        valorPizza = view.findViewById(R.id.dropValue);
//
//        Intent intent = getActivity().getIntent();
//        String titlePizza = intent.getStringExtra("nome_pizza");
//        String valuePizza = intent.getStringExtra("valor_pizza");
//        int imagePizza = intent.getIntExtra("imagem_pizza", 0);
//
//        tituloPizza.setText(titlePizza);
//        valorPizza.setText(valuePizza);
//        pizzaImg.setImageResource(imagePizza);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSolicitar){
            String valor = dropValue2.getText().toString();

            Intent envio = new Intent(getActivity(), envioPedido.class);
            envio.putExtra("valor", valor);
            startActivity(envio);
        }
    }
}

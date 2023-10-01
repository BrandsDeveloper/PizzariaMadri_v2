package com.cursoandroid.pizzariamadri_tcc.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cursoandroid.pizzariamadri_tcc.R;
import com.cursoandroid.pizzariamadri_tcc.numero_do_pedido;

public class numberPedido extends Fragment implements View.OnClickListener{

    private Button abrirPedidos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_number_pedido, container, false);

        abrirPedidos = view.findViewById(R.id.abrirPedidos);
        abrirPedidos.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.abrirPedidos){

            Intent envio = new Intent(getActivity(), numero_do_pedido.class);
            startActivity(envio);
        }
    }
}
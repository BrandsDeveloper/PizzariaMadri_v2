package com.cursoandroid.pizzariamadri_tcc;

import static android.app.PendingIntent.getActivity;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.pizzariamadri_tcc.fragments.dropdownPedidos;

public class Pizza extends AppCompatActivity implements View.OnClickListener {

    private TextView tituloPizza, descPizza, valorPizza;
    private ImageView arrow01, pizzaImg;

    private Button btnAdd;
    //btnPequeno, btnMedio, btnGrande,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        arrow01 = (ImageView) findViewById(R.id.arrow01);
        arrow01.setOnClickListener(this);
        //btnPequeno = (Button) findViewById(R.id.btnPequeno);
        //btnMedio = (Button) findViewById(R.id.btnMedio);
        //btnGrande = (Button) findViewById(R.id.btnGrande);
        //btnPequeno.setOnClickListener(this);
        //btnMedio.setOnClickListener(this);
        //btnGrande.setOnClickListener(this);
        btnAdd = (Button) findViewById(R.id.btnCar);
        btnAdd.setOnClickListener(this);

        pizzaImg = (ImageView) findViewById(R.id.pizzaImg);

        tituloPizza = findViewById(R.id.tituloPizza);
        valorPizza = findViewById(R.id.valorPizza);

        Intent intent = getIntent();
        String titlePizza = intent.getStringExtra("nome_pizza");
        String valuePizza = intent.getStringExtra("valor_pizza");
        int imagePizza = intent.getIntExtra("imagem_pizza", 0);

        tituloPizza.setText(titlePizza);
        valorPizza.setText(valuePizza);
        pizzaImg.setImageResource(imagePizza);
    }

    @Override
    public void onClick(View v) {
        try {
            if (v.getId() == R.id.arrow01) {
                finish();
            }

            if(v.getId() == R.id.btnCar){
                Intent intent = new Intent(Pizza.this, Initial.class);
                intent.putExtra("selectedItemId", R.id.page_requests);
                startActivity(intent);
                finish();

//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                dropdownPedidos fragment = new dropdownPedidos();
//                transaction.add(R.id.dropdown_pedidos, fragment);
//                transaction.commit();

            }
        } catch (Exception e) {
            Log.e("onClickError", "Error occurred: " + e.getMessage());
        }
    }
}

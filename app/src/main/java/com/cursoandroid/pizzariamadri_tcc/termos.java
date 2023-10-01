package com.cursoandroid.pizzariamadri_tcc;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cursoandroid.pizzariamadri_tcc.fragments.conta;

public class termos extends AppCompatActivity implements View.OnClickListener {

    ImageView close01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termos);
        close01 = (ImageView) findViewById(R.id.close01);

        close01.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.close01) {
            finish();
        }
    }

}
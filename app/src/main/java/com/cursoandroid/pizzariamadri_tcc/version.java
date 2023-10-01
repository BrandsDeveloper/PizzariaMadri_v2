package com.cursoandroid.pizzariamadri_tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cursoandroid.pizzariamadri_tcc.fragments.conta;

public class version extends AppCompatActivity implements View.OnClickListener{

    ImageView back01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version);

        back01 = (ImageView) findViewById(R.id.back01);
        back01.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back01) {
            finish();
        }
    }
}
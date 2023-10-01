package com.cursoandroid.pizzariamadri_tcc;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cursoandroid.pizzariamadri_tcc.R.id;

public class Politicas extends AppCompatActivity implements View.OnClickListener{

    ImageView close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas);

        close = (ImageView) findViewById(R.id.close);

        close.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.close) {
            finish();
        }
    }
}
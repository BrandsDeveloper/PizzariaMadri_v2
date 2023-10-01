package com.cursoandroid.pizzariamadri_tcc;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class numero_do_pedido extends AppCompatActivity {

    private static final String PREFS_FILE_NAME = "PedidoPrefs";
    private static final String NUMERO_PEDIDO_KEY = "numeroPedido";

    private TextView textViewNumeroPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_do_pedido);

        textViewNumeroPedido = findViewById(R.id.NumeroPedido);

        // Recupere o número do pedido armazenado nas SharedPreferences
        String numeroPedido = getNumeroPedidoFromSharedPreferences();

        // Verifique se o número do pedido é válido
        if (numeroPedido != null && !numeroPedido.isEmpty()) {
            textViewNumeroPedido.setText(numeroPedido);
        } else {
            // Se o número do pedido não estiver disponível, defina o texto como vazio ou qualquer outro valor padrão desejado
            textViewNumeroPedido.setText("");
        }
    }

    // Recupere o número do pedido das SharedPreferences
    private String getNumeroPedidoFromSharedPreferences() {
        SharedPreferences prefs = getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        return prefs.getString(NUMERO_PEDIDO_KEY, null);
    }
}

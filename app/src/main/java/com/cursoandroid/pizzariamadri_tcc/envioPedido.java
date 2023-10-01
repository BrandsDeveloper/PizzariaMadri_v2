package com.cursoandroid.pizzariamadri_tcc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cursoandroid.pizzariamadri_tcc.fragments.numberPedido;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class envioPedido extends AppCompatActivity {

    private static final String PREFS_FILE_NAME = "PedidoPrefs";
    private static final String NUMERO_PEDIDO_KEY = "numeroPedido";
    private EditText nomeEnvio, dddEnvio, telefoneEnvio, enderecoEnvio, cepEnvio;
    private TextView valorEnvio, pizzaEnvio;
    private RadioButton deliveryEnvio, dinheiroEnvio, localEnvio, maquinaEnvio;
    private Button btnEnvio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_pedido);

        nomeEnvio = findViewById(R.id.nomeEnvio);
        dddEnvio = findViewById(R.id.dddEnvio);
        telefoneEnvio = findViewById(R.id.telefoneEnvio);
        enderecoEnvio = findViewById(R.id.editTextTextPersonName);
        cepEnvio = findViewById(R.id.editTextTextPostalAddress);
        deliveryEnvio = findViewById(R.id.deliveryEnvio);
        dinheiroEnvio = findViewById(R.id.dinheiroEnvio);
        maquinaEnvio = findViewById(R.id.maquinaEnvio);
        localEnvio = findViewById(R.id.localEnvio);
        pizzaEnvio = findViewById(R.id.pizzaEnvio);
        valorEnvio = findViewById(R.id.valorEnvio);
        btnEnvio = findViewById(R.id.btnEnvio);

        btnEnvio.setOnClickListener(v -> {
                enviarDados();
        });
    }

    private void enviarDados() {

        // Obtenha o número do pedido gerado
        String numeroPedido = gerarNumeroPedido();

        saveNumeroPedidoToSharedPreferences(numeroPedido);

        // Crie uma Intent para iniciar a Activity numberPedido
        Intent intent = new Intent(envioPedido.this, numero_do_pedido.class);
        intent.putExtra("numeroPedido", numeroPedido);
        startActivity(intent);
        finish();

        // Obtenha os valores dos campos do formulário
        String nome = nomeEnvio.getText().toString().trim();
        String ddd = dddEnvio.getText().toString().trim();
        String telefone = telefoneEnvio.getText().toString().trim();
        String endereco = enderecoEnvio.getText().toString().trim();
        String cep = cepEnvio.getText().toString().trim();
        String entrega = deliveryEnvio.isChecked() ? "Delivery" : "Local";
        String pagamento = dinheiroEnvio.isChecked() ? "Dinheiro" : "Maquininha";
        String pizza = pizzaEnvio.getText().toString().trim();
        String valor = valorEnvio.getText().toString().trim();

        // Realize a validação dos campos obrigatórios
        if (nome.isEmpty() || ddd.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || cep.isEmpty() || entrega.isEmpty() || pagamento.isEmpty()) {
            Toast.makeText(envioPedido.this, "Preencha todos os campos obrigatórios.", Toast.LENGTH_SHORT).show();
            return; // Saia do método se algum campo obrigatório estiver em branco
        }

        // Verifique se uma opção de entrega foi selecionada
        if (!deliveryEnvio.isChecked() && !localEnvio.isChecked()) {
            Toast.makeText(envioPedido.this, "Selecione uma opção para entrega.", Toast.LENGTH_SHORT).show();
            return; // Saia do método se nenhuma opção de entrega for selecionada
        }

        // Verifique se uma opção de pagamento foi selecionada
        if (!dinheiroEnvio.isChecked() && !maquinaEnvio.isChecked()) {
            Toast.makeText(envioPedido.this, "Selecione uma opção para pagamento.", Toast.LENGTH_SHORT).show();
            return; // Saia do método se nenhuma opção de pagamento for selecionada
        }

        // URL do script PHP no seu servidor que receberá os dados
        String url = "https://guinpec.com/js/script.php";

        // Crie a requisição POST usando Volley
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Manipule a resposta do servidor, se necessário
                        Toast.makeText(envioPedido.this, "Dados enviados com sucesso!", Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Manipule os erros, se ocorrerem
                        Toast.makeText(envioPedido.this, "Erro ao enviar os dados.", Toast.LENGTH_SHORT).show();
                        error.printStackTrace();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                // Defina os parâmetros de formulário necessários aqui
                Map<String, String> params = new HashMap<>();
                params.put("nome", nome);
                params.put("ddd", ddd);
                params.put("telefone", telefone);
                params.put("endereco", endereco);
                params.put("cep", cep);
                params.put("entrega", entrega);
                params.put("pagamento", pagamento);
                params.put("pizza", pizza);
                params.put("valor", valor);
                params.put("codigo", numeroPedido);
                return params;
            }
        };

        // Adicione a requisição à fila de solicitações Volley
        queue.add(request);

    }

    private void saveNumeroPedidoToSharedPreferences(String numeroPedido) {
        SharedPreferences prefs = getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(NUMERO_PEDIDO_KEY, numeroPedido);
        editor.apply();
    }



    private String gerarNumeroPedido() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteres.length());
            char randomChar = caracteres.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

}

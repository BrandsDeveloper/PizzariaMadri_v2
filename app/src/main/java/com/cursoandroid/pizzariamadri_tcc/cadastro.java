package com.cursoandroid.pizzariamadri_tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cadastro extends AppCompatActivity implements View.OnClickListener {

    TextView facaLogin;
    EditText nomeCadastro, emailCadastro, senhaCadastro, confirmSenhaCadastro;
    Button btnCadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        facaLogin = findViewById(R.id.facaLogin);
        nomeCadastro = findViewById(R.id.nomeCadastro);
        emailCadastro = findViewById(R.id.emailCadastro);
        senhaCadastro = findViewById(R.id.senhaCadastro);
        confirmSenhaCadastro = findViewById(R.id.confirmSenhaCadastro);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        facaLogin.setOnClickListener(this);
        nomeCadastro.setOnClickListener(this);
        emailCadastro.setOnClickListener(this);
        senhaCadastro.setOnClickListener(this);
        confirmSenhaCadastro.setOnClickListener(this);
        btnCadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.facaLogin){
            finish();
        }
// capturando os dados digitados e armazenando nas variáveis
        String NomeCad = nomeCadastro.getText().toString();
        String EmailCad = emailCadastro.getText().toString();
        String SenhaCad = senhaCadastro.getText().toString();
        String ConfSenhaCad = confirmSenhaCadastro.getText().toString();


        // Criando a conexão com o banco de dados
        BancoController bd = new BancoController(getBaseContext());
        String resultado;

        // validando os campos - o preenchimento
        if (nomeCadastro.length()==0)
        {
            String msg = "Preencha o campo nome";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        }else{
            if (emailCadastro.length()==0)
            {
                String msg = "Preencha o campo e-mail";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
            else
            {
                if (senhaCadastro.length()==0)
                {
                    String msg = "Preencha o campo de senha";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (SenhaCad.equals(ConfSenhaCad)) {

                        // se nome preenchido, senha e confirmação de senha são iguais
                        // manda inserir no banco de dados (funcao está no bancocontroller.java)
                        resultado = bd.insereDadosUsuario(NomeCad, EmailCad, SenhaCad);

                        Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
                        limpar();
                        Intent telaListaUsuarios = new Intent(this, Login.class);
                    }else{
                        String msg = "As senhas digitadas não são iguais, digite novamente!";
                        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                    }
                }
            }

        }
    }
    public void limpar()
    {
        nomeCadastro.setText("");
        emailCadastro.setText("");
        senhaCadastro.setText("");
        confirmSenhaCadastro.setText("");
        nomeCadastro.requestFocus();
    }
}
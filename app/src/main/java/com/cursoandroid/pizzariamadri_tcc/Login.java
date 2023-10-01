package com.cursoandroid.pizzariamadri_tcc;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnLogar;
    EditText loginEmail, loginSenha;
    TextView Cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Cadastro = findViewById(R.id.Cadastro);
        loginEmail = findViewById(R.id.loginEmail);
        loginSenha = findViewById(R.id.loginSenha);
        btnLogar = findViewById(R.id.btnLogar);


        Cadastro.setOnClickListener(this);
        loginEmail.setOnClickListener(this);
        loginSenha.setOnClickListener(this);
        btnLogar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.Cadastro){
        Intent intent = new Intent(this, cadastro.class);
        startActivity(intent);
        }

        if (v.getId() == R.id.btnLogar) {
            // carrega o método para verificar se o usuário existe
            consultaUsuarioLogin();
        }
    }

    public void consultaUsuarioLogin()
    {
        // captando os dados digitados e armazenando em variáveis
        String Login = loginEmail.getText().toString();
        String SenhaLogin = loginSenha.getText().toString();

        // conectar com o banco de dados - criando um objeto do BD
        BancoController bd = new BancoController(getBaseContext());

        // chamando o método carregaDadosLogin que recebe o email e a senha para
        // buscar as informações no banco de dados
        Cursor dados = bd.carregaDadosLogin(Login, SenhaLogin) ;

        // se encontrou os dados do usuario e senha
        if(dados.moveToFirst()){
            // carregando uma nova tela
            // levando parametros (nome do usuario) para a tela de login
            Intent tela = new Intent(this, Initial.class);
            String nome = dados.getString(1);
//            Bundle parametros = new Bundle();
//            parametros.putString("nome",nome);
//            tela.putExtras(parametros);
            tela.putExtra("nome", nome);
            startActivity(tela);
        }else{
            String msg= "Dados não encontrados no sistema, digite outro!!";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            limpar();
        }
    }
    public void limpar(){
        loginEmail.setText("");
        loginSenha.setText("");
        loginEmail.requestFocus();
    }
}
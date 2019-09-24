package br.edu.fasam.mobile.exemplodebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    EditText txtNome;
    EditText txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibir(View view) {

        //Passo 1 capturar dados da tela
        txtNome = findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);

        //Pegar o texto que o usuario digitou
        String nome,telefone;
        nome = txtNome.getText().toString();
        telefone = txtTelefone.getText().toString();

        //Exibir dados ao usuario  SAÍDA
        String dados = String.format("O texto digitado foi: %s %s",
                nome,telefone);

        //Exibir os dados para o usuario
        Toast.makeText(getApplicationContext(),dados,
                Toast.LENGTH_LONG).show();


    }
}

package br.edu.fasam.mobile.exemplodebug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibirTela(View view) {

        int opcao = view.getId();
        Intent intent;

        //Verifica qual botao foi adionado
        switch (opcao){

            //Exibir tela MainActivity
            case R.id.btnMain:

                intent = new Intent(this,MainActivity.class);
                startActivity(intent);

                break;

            //Exibir tela ListaAcitivy
            case R.id.btnLista:
                intent = new Intent(this,ListaActivity.class);
                startActivity(intent);
                break;

                // Exibir tela de Aluno
            case R.id.btnAluno:
                //Passagem de dados de uma tela para outras
                //Preparar a intenção para passar os dados
                intent = new Intent(this,AlunoActivity.class);
                intent.putExtra("dados","Exemplo de passagem de dados");
                    break;

                    //Exibir tela de professor
            case R.id.btnProfessor:
                break;

            default:
                Toast.makeText(getApplicationContext(),
                        "Opcao Inválida",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}

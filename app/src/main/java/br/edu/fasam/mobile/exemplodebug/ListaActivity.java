package br.edu.fasam.mobile.exemplodebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaActivity extends DebugActivity {

    EditText txtNome;
    EditText txtEmail;
    ListView listView;

    List<HashMap<String,String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    public void adicionar(View view) {

        //Capturar dados da tela
        //findViewById busca o componente pelo id
        //utilizando a classe R.java
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);

        //Declarar as variáveis para receber os dados
        String nome,email;

        //Extrair conteúdo do componente EditText
        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();

        //Formatar saída para o usuário
        String dados = String
                .format("Os dados digitados foram %s %s",
                        nome,email);

        //Adiciona dados num mapa de valores (dicionário)
        //Mapa como um "array associativo", K = key, v = value
        HashMap<String,String> map = new HashMap<>();
        map.put("nome",nome);
        map.put("email",email);

        lista.add(map);

        //Mapeamento de dados do List<HashMap<K,V> para
        //imprimir no layout
        String[] de = {"nome","email"}; //dados do Map

        //id's do layout item.xml
        int[] para = {R.id.txtNomeAluno,R.id.labelEmail};

        //Criar o simpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                lista,
                R.layout.item,
                de,
                para
        );

        //Buscar a listView e imprimir os dados
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);






    }
}

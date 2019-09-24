package br.edu.fasam.mobile.exemplodebug;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class AlunoActivity  extends DebugActivity{
    List<HashMap<String,String>> lista = new ArrayList<>();

    EditText txtNome;
    EditText txtNota1;
    EditText txtNota2;
    EditText txtNota3;
    ListView listView;

    //Entrada
    @Override
    public void onCreate (Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_aluno);


    }

    public void adicionarAluno(View view) {


        txtNome = findViewById(R.id.txtNomeAluno);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtNota3 = findViewById(R.id.txtNota3);

        String nomeAluno,nota1,nota2,nota3;

        nomeAluno=txtNome.getText().toString();
        nota1=txtNota1.getText().toString();
        nota2=txtNota2.getText().toString();
        nota3=txtNota3.getText().toString();



        //Processamento em um list<HashMap<String,String>
        HashMap<String,String> map = new HashMap<>();
        map.put("nome",nomeAluno);
        map.put("nota1",nota1);
        map.put("nota2",nota2);
        map.put("nota3",nota3);

        lista.add(map);

        String[] de = {"nome","nota1","nota2","nota3"};

        int[] para = {R.id.txtNomeAluno,R.id.txtNota1,R.id.txtNota2,R.id.txtNota3};


        //Adicionar itens na listView - Usando SimpleAdapter

        SimpleAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                lista,
                R.layout.activity_item_aluno,
                de,
                para


        );
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}

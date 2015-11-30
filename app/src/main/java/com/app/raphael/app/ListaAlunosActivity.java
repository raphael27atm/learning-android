package com.app.raphael.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by raphael on 30/11/15.
 */
public class ListaAlunosActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem_alunos);

        ListView lista = (ListView) findViewById(R.id.lista);

        String[] alunos = {"Marlon", "Adriano", "Anderson"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, alunos);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Toast.makeText(ListaAlunosActivity.this, "A posição é " + position, Toast.LENGTH_SHORT).show();
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
                Toast.makeText(ListaAlunosActivity.this, "Aluno clicado é " + adapter.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}

package com.app.raphael.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}

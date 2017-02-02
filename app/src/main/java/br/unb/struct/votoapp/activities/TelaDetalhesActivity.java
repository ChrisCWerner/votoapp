package br.unb.struct.votoapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import br.unb.struct.votoapp.R;

/**
 * Created by rodrigo on 25/01/17.
 */

public class TelaDetalhesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teladetalhes);


    }
}

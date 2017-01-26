package br.unb.struct.votoapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.unb.struct.votoapp.R;

/**
 * Created by rodrigo on 25/01/17.
 */

public class TelaDetalhesActivity extends AppCompatActivity {
    private Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teladetalhes);

        btVoltar = (Button) findViewById(R.id.bt_voltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaVotacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}

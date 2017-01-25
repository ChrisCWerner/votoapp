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

public class TelaVotacaoActivity extends AppCompatActivity {

    private Button btDetalhes1;
    private Button btDetalhes2;
    private Button btVotar1;
    private Button btVotar2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telavotacao);

        btDetalhes1 = (Button) findViewById(R.id.bt_detalhes1);
        btDetalhes2 = (Button) findViewById(R.id.bt_detalhes2);
        btVotar1 = (Button) findViewById(R.id.bt_votar1);
        btVotar1 = (Button) findViewById(R.id.bt_votar2);


        btDetalhes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaDetalhesActivity.class);
                startActivity(intent);
            }
        });

        btDetalhes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaDetalhesActivity.class);
                startActivity(intent);
            }
        });


    }


}

package br.unb.struct.votoapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.unb.struct.votoapp.R;
import br.unb.struct.votoapp.model.Refeicao;
import br.unb.struct.votoapp.model.Singleton;
import br.unb.struct.votoapp.model.VotoRefeicao;

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
        btVotar2 = (Button) findViewById(R.id.bt_votar2);

        final Singleton singleton = Singleton.getINSTANCE();
        singleton.getLista().add(new VotoRefeicao(new Refeicao("Principal1","Vegetariano1","Salada1","Guarnição1")));
        singleton.getLista().add(new VotoRefeicao(new Refeicao("Principal2","Vegetariano2","Salada2","Guarnição2")));


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

        btVotar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TelaResultadoActivity.class);
                singleton.getLista().get(0).incrementaVoto();
                startActivity(intent);
            }
        });

        btVotar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TelaResultadoActivity.class);
                singleton.getLista().get(1).incrementaVoto();
                startActivity(intent);
            }
        });


    }


}

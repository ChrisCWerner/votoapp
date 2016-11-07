package br.unb.struct.votoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.unb.struct.votoapp.model.Refeicao;
import br.unb.struct.votoapp.model.VotoRefeicao;

public class TelaVotacao extends AppCompatActivity {

    Button bt_votar1;
    Button bt_votar2;
    Button bt_detalhes1;
    Button bt_detalhes2;
    Refeicao ref1;
    Refeicao ref2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telavotacao);

        ref1 = new Refeicao("Frango","NoVegan","Brocolis","Batata Doce");
        ref2 = new Refeicao("Ovo","NoVegan","Alface","Batata Doce");

        final Singleton singleton = Singleton.getINSTANCE();
        singleton.getLista().add(new VotoRefeicao(ref1));
        singleton.getLista().add(new VotoRefeicao(ref2));

        bt_votar1 = (Button) findViewById(R.id.bt_votar1);
        bt_votar2 = (Button) findViewById(R.id.bt_votar2);
        bt_detalhes1 = (Button) findViewById(R.id.bt_detalhes1);
        bt_detalhes2 = (Button) findViewById(R.id.bt_detalhes2);
        TextView text1 = (TextView) findViewById(R.id.tv_pratoprincipal1);
        TextView text2 = (TextView) findViewById(R.id.tv_pratovegetariano1);
        TextView text3 = (TextView) findViewById(R.id.tv_pratoprincipal2);
        TextView text4 = (TextView) findViewById(R.id.tv_pratovegetariano2);

        text1.setText(singleton.getLista().get(0).getRefeicao().getPratoPrincipal());
        text2.setText(singleton.getLista().get(0).getRefeicao().getPratoVegetariano());
        text3.setText(singleton.getLista().get(1).getRefeicao().getPratoPrincipal());
        text4.setText(singleton.getLista().get(1).getRefeicao().getPratoVegetariano());

        bt_votar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaResultado.class);
                singleton.getLista().get(0).incrementaVoto();
                //intent.putExtra("votos",singleton.getLista().get(0).getVotos());
               //Toast.makeText(getApplicationContext(),singleton.getLista().get(1).getVotos()+"a",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        bt_votar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaResultado.class);
                singleton.getLista().get(1).incrementaVoto();
                //intent.putExtra("votos",singleton.getLista().get(1).getVotos());
                startActivity(intent);
            }
        });
        bt_detalhes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaDetalhes.class);

                startActivity(intent);
            }
        });
        bt_detalhes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TelaDetalhes.class);

                startActivity(intent);
            }
        });
    }

}

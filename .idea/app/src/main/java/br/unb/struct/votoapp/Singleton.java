package br.unb.struct.votoapp;

import java.util.ArrayList;

import br.unb.struct.votoapp.model.VotoRefeicao;

/**
 * Created by User on 30/10/2016.
 */

public class Singleton {

    private static Singleton INSTANCE = new Singleton();
    ArrayList<VotoRefeicao> voto;

    public Singleton(){
        this.voto = new ArrayList<VotoRefeicao>();
    }
    public static Singleton getINSTANCE(){
        return INSTANCE;
    }
    public static void setINSTANCE(Singleton INSTANCE){
        Singleton.INSTANCE = INSTANCE;
    }

    public ArrayList<VotoRefeicao> getLista() {
        return voto;
    }

    public void setLista(ArrayList<VotoRefeicao> voto) {
        this.voto = voto;
    }
}

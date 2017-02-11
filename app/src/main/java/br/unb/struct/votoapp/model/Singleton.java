package br.unb.struct.votoapp.model;

import java.util.ArrayList;

/**
 * Created by User on 11/02/2017.
 */

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    ArrayList<VotoRefeicao> lista;

    public Singleton(){
        this.lista = new ArrayList<VotoRefeicao>();
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public ArrayList<VotoRefeicao> getLista() {
        return lista;
    }
}

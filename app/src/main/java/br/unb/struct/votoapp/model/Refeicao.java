package br.unb.struct.votoapp.model;

/**
 * Created by lucasrez on 04/10/16.
 */

public class Refeicao {
    private String mPratoPrincipal;
    private String mPratoVegetariano;
    private String mSalada;
    private String mGuarnicao;

    public Refeicao(String pratoPrincipal, String pratoVegetariano, String salada, String guarnicao) {
        this.mPratoPrincipal = pratoPrincipal;
        this.mPratoVegetariano = pratoVegetariano;
        this.mSalada = salada;
        this.mGuarnicao = guarnicao;
    }

    public String getPratoPrincipal() {
        return mPratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.mPratoPrincipal = pratoPrincipal;
    }

    public String getPratoVegetariano() {
        return mPratoVegetariano;
    }

    public void setPratoVegetariano(String pratoVegetariano) {
        this.mPratoVegetariano = pratoVegetariano;
    }

    public String getmSalada() {
        return mSalada;
    }

    public void setmSalada(String mSalada) {
        this.mSalada = mSalada;
    }

    public String getmGuarnicao() {
        return mGuarnicao;
    }

    public void setmGuarnicao(String mGuarnicao) {
        this.mGuarnicao = mGuarnicao;
    }
}

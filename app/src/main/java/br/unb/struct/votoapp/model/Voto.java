package br.unb.struct.votoapp.model;

/**
 * Created by lucasrez on 04/10/16.
 */

public class Voto {
    private int mVotosRef1;
    private int mVotosRef2;

    public Voto(int votosRef1, int votosRef2) {
        this.mVotosRef1 = votosRef1;
        this.mVotosRef2 = votosRef2;
    }

    public int getVotosRef1() {
        return mVotosRef1;
    }

    public void setVotosRef1(int votosRef1) {
        this.mVotosRef1 = votosRef1;
    }

    public int getVotosRef2() {
        return mVotosRef2;
    }

    public void setVotosRef2(int votosRef2) {
        this.mVotosRef2 = votosRef2;
    }

    public void incrementaVoto(int refeicao) {
        switch (refeicao) {
            case 1:
                setVotosRef1(getVotosRef1()+1);
                break;
            case 2:
                setVotosRef2(getVotosRef2()+1);
                break;
            default:
                //voto invalido
                break;
        }
    }
}

package br.unb.struct.votoapp.model;

/**
 * Created by lucasrez on 07/10/16.
 */

public class VotoRefeicao {
    private Refeicao refeicao;
    private int votos;

    public VotoRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
        this.votos = 0;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaVoto() {
        votos =+ 1;
    }
}

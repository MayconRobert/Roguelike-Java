package br.unisal.aula;

public class Lobo extends Personagem{

    public static final char SIMBOLO = '☢';

    public Lobo(Ponto2D posicao){
        super(posicao, SIMBOLO);
    }

    @Override
    public void atualizar(Mundo mundo, Jogador jogador) {
        Ponto2D posicaoJogador = jogador.getPosicao();
        System.out.println(posicaoJogador);
        if(this.posicao.getX() == posicaoJogador.getX()){
            if(this.posicao.getY() > posicaoJogador.getY()){
                mover(mundo, 0, -1);
            }else{
                mover(mundo, 0, 1);
            }
        }else if(this.posicao.getY() == posicaoJogador.getY()){
            if(this.posicao.getX() > posicaoJogador.getX()){
                mover(mundo, -1, 0);
            }else{
                mover(mundo, 1, 0);
            }
        }
    }

}
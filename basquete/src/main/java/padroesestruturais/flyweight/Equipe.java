package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private List<Jogador> jogadores = new ArrayList<>();

    public void contratar(String nomeJogador, String nomePosicao, String sigla) {
        Posicao posicao = PosicaoFactory.getPosicao(nomePosicao, sigla);
        Jogador jogador = new Jogador(nomeJogador, posicao);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }

}

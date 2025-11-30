package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PosicaoFactory {
    private static Map<String, Posicao> posicoes = new HashMap<>();

    public static Posicao getPosicao(String nome, String sigla) {
        Posicao posicao = posicoes.get(nome);
        if (posicao == null) {
            posicao = new Posicao(nome, sigla);
            posicoes.put(nome, posicao);
        }
        return posicao;
    }

    public static int getTotalPosicoes() {
        return posicoes.size();
    }

}

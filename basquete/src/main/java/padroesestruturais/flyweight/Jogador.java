package padroesestruturais.flyweight;

public class Jogador {

    private String nome;
    private Posicao posicao;

    public Jogador(String nome, Posicao posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", posicao='" + posicao.getNome() + '\'' +
                ", sigla='" + posicao.getSigla() + '\'' +
                '}';
    }
}

package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquipeTest {

    @Test
    void deveRetornarJogadores() {
        Equipe equipe = new Equipe();
        equipe.contratar("LeBron James", "Armador", "PG");
        equipe.contratar("Stephen Curry", "Armador", "PG");
        equipe.contratar("Kevin Durant", "Ala", "SF");
        equipe.contratar("Giannis Antetokounmpo", "Ala-Pivo", "PF");

        List<String> saida = Arrays.asList(
                "Jogador{nome='LeBron James', posicao='Armador', sigla='PG'}",
                "Jogador{nome='Stephen Curry', posicao='Armador', sigla='PG'}",
                "Jogador{nome='Kevin Durant', posicao='Ala', sigla='SF'}",
                "Jogador{nome='Giannis Antetokounmpo', posicao='Ala-Pivo', sigla='PF'}");

        assertEquals(saida, equipe.obterJogadores());
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Equipe equipe = new Equipe();
        equipe.contratar("LeBron James", "Armador", "PG");
        equipe.contratar("Stephen Curry", "Armador", "PG");
        equipe.contratar("Kevin Durant", "Ala", "SF");
        equipe.contratar("Giannis Antetokounmpo", "Ala-Pivo", "PF");

        assertEquals(3, PosicaoFactory.getTotalPosicoes());
    }

}

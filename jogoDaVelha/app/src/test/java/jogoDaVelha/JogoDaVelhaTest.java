/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoDaVelha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class JogoDaVelhaTest {
    
    JogoDaVelha jogoDaVelha;
        
    @BeforeEach
    public void inicializando(){
        jogoDaVelha = new JogoDaVelha();
    }
    
    private Boolean verificarGrid(String[][] grid){
        Boolean teste = true;
        for(String[] linha : grid){
            for(String coluna : linha){
                if(coluna != null){
                    teste = false;
                }
            }
        }
        return teste;
    }
    
    @Test 
    public void tabuleiroIsEmptyTest(){
        assertTrue(verificarGrid(new String[3][3]), "Erro em verificarGrid()");
        assertTrue(verificarGrid(jogoDaVelha.getTabuleiro()), "A variavel 'tabuleiro' deveria iniciar vazia.");
    }
    
    @Test
    public void vezStartXTest(){
        assertEquals("X",jogoDaVelha.getVez(), "A variavel 'vez' deveria começar em 'X'.");
    }
    
    @Test
    public void jogadasStartTest(){
        assertEquals(0,jogoDaVelha.getJogadas());
    }
    
    @Test
    public void botaoPressTest(){
        jogoDaVelha.marcarJogada(jogoDaVelha.getBotao("gridA1"),0,0);
        assertEquals("X",jogoDaVelha.getTabuleiro()[0][0], "Deveria ter marcado 'X' em gridA1/tabuleiro[0][0]");
    }
    
    
    public void trocaDeTurnoTest(){
        /*
        for(int i = 0; i < 3; i++){
            String letra;
            switch(i){
                case 0 : letra = "A";
                case 1 : letra = "B";
                case 2 : letra = "C";
                default: letra = "9VDGAV@&GD";
            }
            for(int j = 0; j<3; j++){
                jogoDaVelha.marcarJogada(jogoDaVelha.getBotao("gridA1"),i,j);
                assertEquals( (j + 1) + (i * 3),jogoDaVelha.getTurno(), "Turno não contabilizado corretamente - depois de " + (j + i * 3) + " jogadas marcadas.");
            }
        }
        */
        jogoDaVelha.marcarJogada(jogoDaVelha.getBotao("gridA1"),0,0);
        assertEquals( 1,jogoDaVelha.getTurno(), "Turno não contabilizado corretamente.");
    }
    
}

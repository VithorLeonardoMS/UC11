/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class calculadoraTest {
    @Test
    public void testarSomar(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2,3);
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");
    }
    
}

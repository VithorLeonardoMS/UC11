/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaTeste2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class CalculadoraTest {
    
    Calculadora calc = new Calculadora();
    
    @Test
    public void testAdd(){;
        Double resultado = calc.soma(2.0 ,3.0);
        assertEquals(5, resultado, " A soma de 2 + 3 deve resultar em 5");
    }
    
    @Test
    public void testSubtracao(){
        Double resultado = calc.subtracao(5.0,2.0);
        assertEquals(3, resultado, "A subtracao de 5 - 2 deve resultar em 3");
    }
    
    @Test
    public void testMultiplicacao(){
        Double resultado = calc.multiplicacao(2.0, 4.0);
        assertEquals(8, resultado, "A multiplicacao de 2 * 4 deve resultar em 8");
    }
    
    @Test
    public void testDivisaoSimples(){
        Double resultado = calc.divisao(5.0, 2.0);
        assertEquals( 2.5,resultado, "A divisao de 5 / 2 deve resultar em 2.5");
    }
    
    @Test
    public void testDivisaoPorZero(){
       IllegalArgumentException excesao = assertThrows(IllegalArgumentException.class, () -> calc.divisao(10.0, 0.0));
       assertEquals("Divisao por zero nao e permitida",excesao.getMessage(), "A divisão de 10 / 0 deveria gerar IllegalArgumentException -> Divisao por zero nao e permitida");
    }
    
    @Test
    public void testPotenciacao(){
        Double resultado = calc.potenciacao(2.0, 3);
        assertEquals(8,resultado, "A potencia de 2^3 deve resultar em 8");
    }
    
    @Test
    public void testRaizQuadrada(){
        Double resultado = calc.raizQuadrada(25.0);
        assertEquals(5,resultado, "A raiz de 25 deve resultar em 5");
    }
    
    @Test
    public void testRaizQuadradaPorNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calc.raizQuadrada(calc.raizQuadrada(-2.0)));
        assertEquals("Raiz quadrada de numero negativo nao e permitida", exception.getMessage(), "A raiz de -2.0 deveria geral IllegalArgumentException -> Raiz quadrada de numero negativo nao e permitida");
    }
    
}


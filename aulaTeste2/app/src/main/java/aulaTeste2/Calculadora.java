/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaTeste2;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Calculadora {
    public double soma(Double a,Double b){
        return a + b;
    }
    
    public Double subtracao(Double a, Double b){
        return a - b;
    }
    
    public Double multiplicacao(Double a, Double b){
        return a * b;
    }
    
    public Double divisao(Double a, Double b){
        if(b == 0){
            throw new IllegalArgumentException("Divisao por zero nao e permitida");
        } 
        
        return a / b;
        
    }
    
    public Double potenciacao(Double a,int b){
        return Math.pow(a,b);
    }
    
    public Double raizQuadrada(Double a){
        if(a < 0){
            throw new IllegalArgumentException("Raiz quadrada de numero negativo nao e permitida");
        }
        return Math.sqrt(a);
    }
    
}

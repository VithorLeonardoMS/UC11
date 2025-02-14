/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3Estoque;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Estoque {
    ArrayList<Produto> produtos = new ArrayList<>();
    
    
    public void adicionarProduto(String nome, int quantidade){
        if()
        produtos.add(new Produto(nome,quantidade));
    }
    
    public void removerProduto(String nome, int quantidade){
        produtos.removeIf(p -> p.quantidade <= quantidade);
        for(Produto produto : produtos){
            if(produto.nome.equals(nome)){
                produto.quantidade -= quantidade;
            }
        }
        
    }
    
    public int consultarQuantidade(String nome){
        int retorno = 0;
        for(Produto produto : produtos){
            if(produto.nome.equals(nome)){
                retorno = produto.quantidade;
            }
        }
        return retorno;
    }
    
    public int produtoMaisEstocado(){
        return 0;
    }
    
    public void limparEstoque(){
        
    }
    
    
}



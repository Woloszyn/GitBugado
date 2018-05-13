/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 *Este enumerado retorna os tipos que um produto pode ter
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @since 23/03/2018
 * @version 1.0
 */
public enum TipoDeProduto {
    
    LIMPEZA("Limpeza"),
    ALIMENTACAO("Alimentação"),
    ELETRONICO("Eletronico"),
    BRINQUEDO("Brinquedo"),
    BEBIDA("Bebida") ;
    
   private String tipoProduto ;

    private TipoDeProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return  tipoProduto;
    }
   
   
    
    
}

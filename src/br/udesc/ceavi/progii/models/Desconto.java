/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 * Enum com a quantia de desconto dada para clientes
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 20/04/2018
 */
public enum Desconto {
    DEZPORCENTO("10%"),
    VINTEPORCENTO("20%"),
    TRINTAPORCENTO("30%"),
    QUARENTAPORCENTO("40%"),
    CINQUENTAPORCENTO("50%") ;
    private String desconto ;

    private Desconto(String desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return desconto;
    }
    
    
    
    
    
}

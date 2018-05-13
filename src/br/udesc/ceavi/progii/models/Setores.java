/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 * Este enumerado retorna os setores de um supermercado 
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0 
 * @since 23/03/2018
 */
public enum Setores {
    PADARIA("Padaria") ,
    ACOUGUE("Açougue"),
    HIGIENE("Higiene"),
    LIMPEZA("Limpeza"),
    PERFUMARIA("Perfumaria"),
    FRIOS("Frios"),
    HORTIFRUTI("Hortifruti"),
    GESTAO("Gestao"),
    SSEGURANCA("Segurança") ;
    
    private String setores; 

    private Setores(String setores) {
        this.setores = setores;
    }

    @Override
    public String toString() {
        return "Setores \n" + "Setor= " + setores ;
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 *  Este enumerado serve para fornecer o número dos setores 
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0
 * @since 23/03/2018
 */
public enum Cargo {
    CAIXA ("Caixa") ,
    FAXINEIRO("Faxineiro") ,
    SEGURANCA("Segurança") ,
    REPOSITOR("Repositor"),
    RH ("Recursos Humanos") ,
    GERENCIA("Gerencia") ,
    PADARIA("Padeiro") ,
    ACOUGUEIRO("Açougueiro") ;
    private String cargo ;

    private Cargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return cargo ;
    }
    
    
   
    
}

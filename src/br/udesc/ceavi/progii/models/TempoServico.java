/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 *Enum para definir o tempo de serviço de um funcionário
 * @author Eduardo Woloszyn
 * @since 20/04/2018
 * @version 1.0
 */
public enum TempoServico {
    MAISDEVINTEANOS("Mais de 20 Anos"),
    MAISDEDEZANOS("Mais de 10 Anos"),
    MAISDECINCOANOS("Mais de Cinco Anos"),
    MAISDEUMANO("Mais de um ano"),
    RECEMCONTRATADO("Recém contratado");
    
    private String tempoServico ;

    private TempoServico(String tempoServico) {
        this.tempoServico = tempoServico;
    }

    @Override
    public String toString() {
        return  tempoServico ;
    }
    
    
    
    
}

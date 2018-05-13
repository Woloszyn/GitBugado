/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 * Classe abstrata para atribuir váriaveis padrões sobre pessoas
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0 
 * @since 23/03/2018
 */
public abstract class Pessoa {
    
    protected String nome ;
    protected long cpf ;
    protected long rg ; 

    public Pessoa() {
    }

      
    public Pessoa(String nome, long cpf, long rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 * Esta classe irá servir para cadastrar um novo Mercado, pegando informações de todas as classes
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0
 * @since 23/03/2018
 */
public abstract class Mercado {
    private String nome ; 
    private int idMercado ; 
    private Endereco endereco ;
    private Funcionario funcionarios ;
    private Caixa oCaixa ;
    

    public Mercado(String nome, int idMercado) {
        this.nome = nome;
        this.idMercado = idMercado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdMercado() {
        return idMercado;
    }

    public void setIdMercado(int idMercado) {
        this.idMercado = idMercado;
    }

    @Override
    public String toString() {
        return "Mercado{" + "nome=" + nome + ", idMercado=" + idMercado + '}';
    }
    
    
    
    
    
    
    
}

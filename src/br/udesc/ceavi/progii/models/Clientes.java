/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 *Esta classe serve para cadastro de funcionários
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0
 * @since 23/03/2018
 */
public class Clientes extends Pessoa {
    private boolean desconto ; 

    public Clientes(boolean desconto, String nome, long cpf, long rg) {
        super(nome, cpf, rg);
        this.desconto = desconto;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public long getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public long getRg() {
        return rg;
    }

    @Override
    public void setRg(long rg) {
        this.rg = rg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.desconto ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (this.desconto != other.desconto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clientes \n " + " Desconto= " + desconto + '}';
    }

    
    
    
    
    
    
    
    
    
}

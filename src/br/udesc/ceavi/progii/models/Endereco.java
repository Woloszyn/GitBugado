/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

import java.util.Objects;

/**
 *Esta classe irá conter os dados a respeito do endereço
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0
 * @since 23/03/2018
 */
public class Endereco {
    private long cep ;
    private short numero ;
    private String cidade ;
    private String rua ;
    private String bairro ;

    public Endereco(long cpf, short numero, String cidade, String rua, String bairro) {
        this.cep = cpf;
        this.numero = numero;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public long getCpf() {
        return cep;
    }

    public void setCpf(long cpf) {
        this.cep = cpf;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (this.cep ^ (this.cep >>> 32));
        hash = 83 * hash + this.numero;
        hash = 83 * hash + Objects.hashCode(this.cidade);
        hash = 83 * hash + Objects.hashCode(this.rua);
        hash = 83 * hash + Objects.hashCode(this.bairro);
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
        final Endereco other = (Endereco) obj;
        if (this.cep != other.cep) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco \n " + "CEP =" + cep + "\n numero= " + numero + "\n cidade= " + cidade + "\n rua= " + rua + "\n bairro= " + bairro  ;
    }
    
    
    
}

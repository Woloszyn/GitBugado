/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

import java.util.Objects;

/**
 * Classe modelo para Filiais
 * @author Eduardo Woloszyn
 * @since 07/05/2018
 * @version 1.0
 */
public class Filial {
    private String nome ;
    private String cnpj ;
    private String cep ;
    private short numero ;
    private String cidade ;
    private String rua ;
    private String bairro ;

    public Filial(String nome, String cnpj, String cep, short numero, String cidade, String rua, String bairro) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
    }

    public Filial() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.cnpj);
        hash = 31 * hash + Objects.hashCode(this.cep);
        hash = 31 * hash + this.numero;
        hash = 31 * hash + Objects.hashCode(this.cidade);
        hash = 31 * hash + Objects.hashCode(this.rua);
        hash = 31 * hash + Objects.hashCode(this.bairro);
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
        final Filial other = (Filial) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
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
        return "Filial" + "\n Nome= " + nome + "\n CNPJ=" + cnpj + "\n Cep=" + cep + "\n Número= " + numero + "\n Cidade= " + cidade + "\n Rua= " + rua + "\n Bairro= " + bairro ;
    }
    
    
    
    
}

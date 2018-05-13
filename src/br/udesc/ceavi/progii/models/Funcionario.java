/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

import java.util.Objects;

/**
 * Esta classe define os atributos e métodos de Funcionario
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0 
 * @since 23/03/2018
 */
public class Funcionario extends Pessoa {

    private double salario ; 
    private Cargo carg ;

    public Funcionario() {
    }

    
    public Funcionario(double salario, Cargo carg, String nome, long cpf, long rg) {
        super(nome, cpf, rg);
        this.salario = salario;
        this.carg = carg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCarg() {
        return carg;
    }

    public void setCarg(Cargo carg) {
        this.carg = carg;
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
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.carg);
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
        final Funcionario other = (Funcionario) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (this.carg != other.carg) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + carg.toString() ;
    }
    
    
    
    
    
    
    
}

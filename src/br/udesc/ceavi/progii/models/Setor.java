/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

/**
 * Esta classe define os comportamentos de um setor
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0 
 * @since 23/03/2018
 */
public class Setor {
    private double tamanho ;
    private Setores setorz ;
    private Mercado mercado ;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public Setores getSetorz() {
        return setorz;
    }

    public void setSetorz(Setores setorz) {
        this.setorz = setorz;
    }

    public Setor(double tamanho, Setores setorz) {
        this.tamanho = tamanho;
        this.setorz = setorz;
    }

    @Override
    public String toString() {
        return "Setor{" + "tamanho=" + tamanho + "\n"+ setorz.toString();
    }
    
    
    
    
    
    
    
}

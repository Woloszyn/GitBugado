/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.models;

import java.util.Objects;

/**
 *Esta classe fornece as informações sobre o fornecedor e também adiciona informações
 * @author Eduardo Woloszyn, Leonardo Tadeu Jaques Steinke, Bruno Trindade e Silva, Denilson Laucsen
 * @version 1.0
 * @since 23/03/2018
 */
public class Fornecedores {
    private long cnpj ;
    private String nomeEmpresa;
    private double pedidoMinimo ;
    private TipoDeProduto tipoProd ;

    public Fornecedores(long cnpj, String nomeEmpresa, double pedidoMinimo, TipoDeProduto tipoProd) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.pedidoMinimo = pedidoMinimo;
        this.tipoProd = tipoProd;
    }

    public Fornecedores() {
        super();
        this.cnpj=0;
        this.nomeEmpresa="";
        this.pedidoMinimo = 0 ;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPedidoMinimo() {
        return pedidoMinimo;
    }

    public void setPedidoMinimo(double pedidoMinimo) {
        this.pedidoMinimo = pedidoMinimo;
    }

    public TipoDeProduto getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(TipoDeProduto tipoProd) {
        this.tipoProd = tipoProd;
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "cnpj=" + cnpj + ", nomeEmpresa=" + nomeEmpresa + ", pedidoMinimo=" + pedidoMinimo + tipoProd.toString();
    }
    
    
   
}

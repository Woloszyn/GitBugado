/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.control.dao.interfaces;

/**
 * Interface para tratamento de exceções do tipo CRUD
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 13/05/2018
 */
public interface DAO<X> {
   boolean btnNovo (X obj) throws Exception ;
   boolean btnCancelar (X obj) throws Exception;
   boolean btnGravar (X obj) throws Exception;
   boolean btnExcluir (X obj) throws Exception ;
    
}

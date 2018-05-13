/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.control.dao.interfaces;

import br.udesc.ceavi.progii.control.dao.exceptions.NumeroCNPJmaiorException;
import br.udesc.ceavi.progii.models.Filial;

/**
 * Classe que implementa os possíveis erros do frame Filiais.
 * @author Eduardo Woloszyn
 * @since 13/05/2018
 * @version 1.0
 */
public class FiliaisDAO implements DAO<Filial> {

    @Override
    public boolean btnNovo(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean btnCancelar(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean btnGravar(Filial obj) throws NumeroCNPJmaiorException {
        if (obj.getCnpj().length()!= 14) {
            throw new NumeroCNPJmaiorException();
        } 
        
        
    return true ;
    }

    @Override
    public boolean btnExcluir(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

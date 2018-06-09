
package br.udesc.ceavi.progii.control.dao.interfaces;

import br.udesc.ceavi.progii.control.dao.exceptions.NumeroCEPInvalido;
import br.udesc.ceavi.progii.control.dao.exceptions.NumeroCnpjInvalido;
import br.udesc.ceavi.progii.control.dao.exceptions.NumeroNumeroInvalido;
import br.udesc.ceavi.progii.models.Filial;
import br.udesc.ceavi.progii.view.FrameCRUDFiliais;
import javax.swing.JOptionPane;

/**
 * Esta classe define as exceções disparadas para o Frame filiais
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 04/06/2018
 */
public class FiliaisDAO implements DAO<Filial>{

    @Override
    public boolean btnGravar(Filial obj) throws NumeroCnpjInvalido,NumeroCEPInvalido, NumeroNumeroInvalido {
        if (obj.getCnpj().length()>14) {
            throw new NumeroCnpjInvalido(" Número maior que o válido");
        } else if (obj.getCnpj().length()<14) {
            throw new NumeroCnpjInvalido(" Número menor que o válido");
        } 
        
        if (obj.getCep().length()>8) {
            throw new NumeroCEPInvalido("Número maior que 8 digitos");
        } else if (obj.getCep().length()<8) {
            throw new NumeroCEPInvalido("Número menor que 8 digitos");
        } 
        if (obj.getNumero()>1000 || obj.getNumero()<1) {
            throw new NumeroNumeroInvalido("Número não está no intervalo certo");
        }
        
        
        
     return true ;   
    }

    @Override
    public boolean btnNovo(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean btnCancelar(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean btnExcluir(Filial obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.control.dao.exceptions;

import javax.swing.JOptionPane;

/**
 * Esta classe é uma exceção causada caso digite numeros à mais no campo CNPJ
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 13/05/2018
 */
public class NumeroCNPJmaiorException extends Exception{

    public NumeroCNPJmaiorException(String message) {
        super("Número de CNPJ inválido "+message);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public NumeroCNPJmaiorException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
    
    
}

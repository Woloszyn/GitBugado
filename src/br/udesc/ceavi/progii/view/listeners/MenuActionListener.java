/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.listeners;

import br.udesc.ceavi.progii.view.FrameCRUD;
import br.udesc.ceavi.progii.view.principal.FrameSistema;
import java.awt.event.ActionListener;

/**
 *  Listener genérico para todos os métodos internos da aplicação
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 07/05/2018
 * 
 */
public abstract class MenuActionListener implements ActionListener {
  protected  FrameCRUD frame ;
  
  protected final FrameSistema tela;

    public MenuActionListener(FrameSistema tela) {
        this.tela = tela;
    }
    
  
  
    
    
    
    
}

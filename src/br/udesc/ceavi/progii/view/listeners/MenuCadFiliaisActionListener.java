/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.listeners;

import br.udesc.ceavi.progii.models.Filial;
import br.udesc.ceavi.progii.view.FrameCRUDFiliais;
import br.udesc.ceavi.progii.view.principal.FrameSistema;
import java.awt.event.ActionEvent;

/**
 * Classe para cadastrar o internalFrame de filiais à desktop
 * @author Eduardo Woloszyn
 * @since 07/05/2018
 * @version 1.0
 */
public class MenuCadFiliaisActionListener extends MenuActionListener {

    public MenuCadFiliaisActionListener(FrameSistema tela) {
        super(tela);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Filial filial = new Filial();
        
        frame = FrameCRUDFiliais.getInstance();
        
        ((FrameCRUDFiliais)frame).setFilial(filial);
        
        ListenerCRUDFiliais listener = new ListenerCRUDFiliais(filial, frame);
        
        tela.addIntFrame(frame);
        frame.setVisible(true);
        
    }
    
    
    
}

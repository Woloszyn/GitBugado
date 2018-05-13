/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.listeners;

import br.udesc.ceavi.progii.models.Caixa;
import br.udesc.ceavi.progii.view.FrameCRUDCaixa;
import br.udesc.ceavi.progii.view.principal.FrameSistema;
import java.awt.event.ActionEvent;

/**
 * Esta classe serve para adicionar listener no menu bar para Caixa
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 07/05/2018
 */
public class MenuCadCaixaActionListener extends MenuActionListener {
     public MenuCadCaixaActionListener(FrameSistema tela) {
        super(tela);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Define o objeto da camada Model
        Caixa caixa = new Caixa();

        //Define o objeto da camada View (JInternalFrame)
        frame = FrameCRUDCaixa.getInstance();
        
        ((FrameCRUDCaixa)frame).setCaixa(caixa);

        //Define o Controller para um cadastro CRUDEndereco
        ListenerCRUDCaixa listenerCaixa = ListenerCRUDCaixa.getInstancia(caixa, frame);

        //Insere a JInternalFrame na aplicação principal
        tela.addIntFrame(frame);
        frame.setVisible(true);
    }
    
    
}

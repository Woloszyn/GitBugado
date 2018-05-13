/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.listeners;

import br.udesc.ceavi.progii.models.Filial;
import br.udesc.ceavi.progii.view.FrameCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Listener para a tela de Filiais
 * @author Eduardo Woloszyn
 * @version 1.0
 * @since 07/05/2018
 */
public class ListenerCRUDFiliais {
    private static ListenerCRUDFiliais instancia ;
    
    private Filial filial ;
    
    private FrameCRUD frame ;

    public ListenerCRUDFiliais(Filial filial, FrameCRUD frame) {
        this.filial = filial;
        this.frame = frame;
        
        addListeners() ;
        
    }

    private void addListeners() {
        JButton botao ;
        
        botao  = frame.getPanelBotoesCRUD().getBtnCancelar();
        botao.addActionListener(new btCancelarActionListener());
        
        botao = frame.getPanelBotoesCRUD().getBtnExcluir();
        botao.addActionListener(new btExcluirActionListener());
        
        botao = frame.getPanelBotoesCRUD().getBtnGravar();
        botao.addActionListener(new btGravarActionListener());
        
        botao= frame.getPanelBotoesCRUD().getBtnNovo();
        botao.addActionListener(new btNovoActionListener());
    }

    public static ListenerCRUDFiliais getInstancia(Filial filial, FrameCRUD frame) {
        if (instancia==null) 
            instancia = new ListenerCRUDFiliais(filial, frame);
        
        
        return instancia;
    }
    
    private class btCancelarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }
    private class btNovoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.limparCampos();
        }
    }
    private class btExcluirActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(frame,"Deseja excluir os dados selecionados ?","Confirmar?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (resposta == JOptionPane.YES_OPTION) {
               frame.limparCampos();
            }
        
        }
    }
    private class btGravarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //método control para adicionar campos ao banco de dados
            
            frame.limparCampos();
        }
    }
    
    
    
    
    
}

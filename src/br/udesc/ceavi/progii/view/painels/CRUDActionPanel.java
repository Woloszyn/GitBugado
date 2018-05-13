/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.painels;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Esta classe serve para criar um painel CRUD padrão
 * @author Eduardo Woloszyn
 * @since 19/04/2018
 * @version 1.0
 */
public class CRUDActionPanel extends JPanel {
   // dimensão do tamanho do botão
    private Dimension dimensaoBotao ;
   //Dimensão do panel
    private Dimension dimensaoPanel ;
   // Gerenciador de layout
   private LayoutManager layout ;
   // Botões
   private JButton btnCancelar ; 
   private JButton btnNovo ; 
   private JButton btnGravar ; 
   private JButton btnExcluir ; 
   
   private Container parent ;

    public CRUDActionPanel(Container parent) {
        this.parent = parent;
        
        
        initComponents() ;
        addComponents() ;
        
        super.setVisible(true);
        super.setSize(dimensaoPanel);
        
    }

    
   
   
   
   public JButton getBtnCancelar() {
        return btnCancelar;
    }


    public JButton getBtnNovo() {
        return btnNovo;
    }

    public JButton getBtnGravar() {
        return btnGravar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    /**
     * Método responsável pela iniciação dos componentes
     */
    
    private void initComponents() {
     
     //Setando a dimensão padrão do botão
     dimensaoBotao = new Dimension(100, 20);
     //Setando a dimensão do panel 
     dimensaoPanel = new Dimension(parent.getWidth(),30); // O parent foi passado no construtor
     
     layout = new FlowLayout(FlowLayout.CENTER);
     
     // Setando os botões com seus nomes e dimensões
     btnExcluir = new JButton("Excluir");
     btnExcluir.setSize(dimensaoBotao);
     
     btnNovo = new JButton("Novo");
     btnNovo.setSize(dimensaoBotao);
     
     btnCancelar = new JButton("Cancelar");
     btnCancelar.setSize(dimensaoBotao);
     
     btnGravar = new JButton("Gravar");
     btnGravar.setSize(dimensaoBotao);
     
        
        
    }
    /**
     * Método para adicionar os componentes ao JPanel
     */
    private void addComponents() {
        //Seta o "layout" do panel
        this.setLayout(layout);
        
        // adiciona os botões ao panel 
        this.add(btnNovo);
        this.add(btnCancelar);
        this.add(btnGravar);
        this.add(btnExcluir);
        
        
    }
   
   
   
    
    
    
    
    
}

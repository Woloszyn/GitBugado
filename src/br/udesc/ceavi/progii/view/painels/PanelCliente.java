/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.painels;

import br.udesc.ceavi.progii.models.Clientes;
import br.udesc.ceavi.progii.models.Desconto;
import br.udesc.ceavi.progii.models.TipoDeProduto;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Este Panel serve para mostrar opções acerca da opção cliente
 * @author Eduardo Woloszyn
 * @since 20/04/2018
 * @version 1.0
 */
public class PanelCliente extends JPanel {
   private JLabel lblDesconto ;
   private JComboBox cbxDesconto ;
   private Desconto enumDesconto ;
   private Clientes cliente ;
    
   private Dimension dimensao ;
   private LayoutManager layout ;
   
    Container parent ;

    public PanelCliente(Container parent) {
        
        this.parent = parent ;
        initComponents() ;
        addComponents() ;
        
        super.setVisible(true);
        super.setSize(dimensao);
        
    }

    private void initComponents() {
       lblDesconto = new JLabel("Desconto");
       cbxDesconto = new JComboBox(enumDesconto.values());
       
       dimensao= new Dimension(parent.getWidth(),80);
       
       layout = new GridLayout(0, 2);
       cbxDesconto.setSelectedIndex(-1);
    }

    private void addComponents() {
       this.setLayout(layout);
        
       this.add(lblDesconto);
       this.add(cbxDesconto);
       
        
    }

   
   
    
    
    
}

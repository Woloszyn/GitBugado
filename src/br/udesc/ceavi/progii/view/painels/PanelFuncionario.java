/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.view.painels;

import br.udesc.ceavi.progii.models.Cargo;
import br.udesc.ceavi.progii.models.TempoServico;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Woloszyn
 */
public class PanelFuncionario extends JPanel{
    private Cargo enumCargo ;
    private TempoServico enumTempoServico ;
    
    private JLabel lblCargo ;
    private JLabel lblTempoServico;
    private JLabel lblSalario;
    
    private JComboBox cbxCargo ;
    private JComboBox cbxTempoServico ;
    
    private JTextField tfSalario ;
    
    private Container parent ;
    private LayoutManager layout ;
    
    private Dimension dimensao ;

    public PanelFuncionario(Container container) {
       this.parent = container ;
       
       initComponents() ;
       addComponents() ;
       
       super.setVisible(true);
       super.setSize(dimensao);
       
        
    }

    private void initComponents() {
        dimensao = new Dimension(parent.getWidth(), 100);
        
        lblCargo = new JLabel("Cargo");
        lblSalario = new JLabel("Salario");
        lblTempoServico = new JLabel("Tempo de Serviço");
        
        tfSalario = new JTextField();
        
        cbxCargo = new JComboBox(enumCargo.values());
        cbxTempoServico = new JComboBox(enumTempoServico.values());
        
        layout = new GridLayout(3, 2);
        
    }

    private void addComponents() {
        this.setLayout(layout);
        
        this.add(lblCargo);
        this.add(cbxCargo);
        this.add(lblSalario);
        this.add(tfSalario);
        this.add(lblTempoServico);
        this.add(cbxTempoServico);
        
        
        
        
        
    }
    
    
    
    
    
}

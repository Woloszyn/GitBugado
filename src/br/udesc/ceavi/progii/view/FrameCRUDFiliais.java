package br.udesc.ceavi.progii.view;

import br.udesc.ceavi.progii.models.Filial;
import br.udesc.ceavi.progii.view.painels.PanelEndereco;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Woloszyn, Denilson Laucsen ,Leonardo Steinke
 */
public class FrameCRUDFiliais extends FrameCRUD{
    
    private static FrameCRUDFiliais instancia;
    
    private static final String titulo = "Cadastro de Filiais";
    private static final Dimension dimension = new Dimension (450,270);
    
    //private Filiais filial;
    
    private Label lbNome;
    private Label lbCNPJ;
    
    private JTextField tfNome;
    private JTextField tfCNPJ;
    
    private JPanel panelFormulario;
    private PanelEndereco panelEndereco;
    
    private LayoutManager layout;
    private GridBagConstraints cons;

    private Filial filial ;
    public FrameCRUDFiliais(){
        super(titulo, dimension);
        
       //endereco = new Endereco();

        initializeComponents();
        addComponents();
        
    }
    
    public static FrameCRUDFiliais getInstance(){
         if(instancia == null) {
             instancia = new FrameCRUDFiliais();
         }
        
        return instancia;
    }

    private void initializeComponents() {
        lbCNPJ = new Label("CNPJ:");
        lbNome = new Label("Nome:");
        
        tfCNPJ = new JTextField();
        tfNome = new JTextField();

        layout = new GridBagLayout();
        panelEndereco = new PanelEndereco(this);
        panelFormulario = new JPanel(layout);

        panelEndereco.setBorder(BorderFactory.createTitledBorder("Dados do Endereço"));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Dados da Filial"));
        
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(lbCNPJ,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 100;
        panelFormulario.add(tfCNPJ,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(lbNome,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 160;
        panelFormulario.add(tfNome,cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 100;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.gridheight = 50;
        panelFormulario.add(panelEndereco,cons);
        super.addFormulario(panelFormulario);
                
        
    }

    @Override
    public void limparCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    
    
    
}
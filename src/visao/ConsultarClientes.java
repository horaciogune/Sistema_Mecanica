/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Controller.ClienteController;
import Modelo.ModeloCliente;
import Conexao.ConnectionFactory;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class ConsultarClientes extends javax.swing.JPanel {

    ArrayList<ModeloCliente> listaModeloClientes = new ArrayList<>();
    ClienteController clienteController = new ClienteController();
    ModeloCliente modeloCliente = new ModeloCliente();
    
    private CadastrarClientes cliente;
    
    public ConsultarClientes() {
        initComponents();
        CarregarClientes();
      
         
         cliente = new CadastrarClientes();
         
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        painelBorderr11 = new utilitarios.PainelBorderr1();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        painelBorderr13 = new utilitarios.PainelBorderr1();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new componentes.Tabela();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acção", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 1, 14))); // NOI18N

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Apagar.png"))); // NOI18N
        jButton2.setText("Apagar");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Adicionar.png"))); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/print.png"))); // NOI18N
        jButton6.setText("Imprimir");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        painelBorderr11.setBackgroundColor(new java.awt.Color(0, 102, 204));

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        painelBorderr13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelBorderr13.setBackgroundColor(new java.awt.Color(0, 102, 204));
        painelBorderr13.setBorderColor(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(0, 102, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        javax.swing.GroupLayout painelBorderr13Layout = new javax.swing.GroupLayout(painelBorderr13);
        painelBorderr13.setLayout(painelBorderr13Layout);
        painelBorderr13Layout.setHorizontalGroup(
            painelBorderr13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr13Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        painelBorderr13Layout.setVerticalGroup(
            painelBorderr13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout painelBorderr11Layout = new javax.swing.GroupLayout(painelBorderr11);
        painelBorderr11.setLayout(painelBorderr11Layout);
        painelBorderr11Layout.setHorizontalGroup(
            painelBorderr11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBorderr11Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(painelBorderr13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBorderr11Layout.setVerticalGroup(
            painelBorderr11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBorderr11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBorderr13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLIENTE", "NOME", "ENDEREÇO", "TELEFONE", "DOCUMENTO", "NÚMERO", "DATA REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setResizable(false);
            jtClientes.getColumnModel().getColumn(1).setResizable(false);
            jtClientes.getColumnModel().getColumn(2).setResizable(false);
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
            jtClientes.getColumnModel().getColumn(4).setResizable(false);
            jtClientes.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painelBorderr11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(painelBorderr11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Ações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           try {
            try (Connection conn = ConnectionFactory.getConnection()) {
                String src = "src\\relatorios\\clientes.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(src);
                JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
                JasperViewer.viewReport(jp);
            }
            
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(painelBorderr13, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        EnviarDadosParaFormulariio();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ApagarCliente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new CadastrarClientes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.removeAll();
        PainelCasa painelCasa = new PainelCasa();
        this.setLayout(new BorderLayout());
        this.add(painelCasa , BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.removeAll();
        PainelConsultas painelConsultas = new PainelConsultas();
        this.setLayout(new BorderLayout());
        this.add(painelConsultas , BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private componentes.Tabela jtClientes;
    private utilitarios.PainelBorderr1 painelBorderr11;
    private utilitarios.PainelBorderr1 painelBorderr13;
    // End of variables declaration//GEN-END:variables


public void CarregarClientes(){
  
    DefaultTableModel modelo = (DefaultTableModel) jtClientes.getModel();
    modelo.setNumRows(0); 
    listaModeloClientes = clienteController.getListaModeloClienteController();
    int cont = listaModeloClientes.size();
    
    for(int i=0; i< cont;i++){
        modelo.addRow(new Object[]{
            listaModeloClientes.get(i).getId(),
            listaModeloClientes.get(i).getNome(),
            listaModeloClientes.get(i).getEndereco(),
            listaModeloClientes.get(i).getTelefone(),
            listaModeloClientes.get(i).getDocumento(),
            listaModeloClientes.get(i).getNumero(),
            listaModeloClientes.get(i).getDataCriacao()
        });
        
    }
}

public void EnviarDadosParaFormulariio(){
   
    int linha = jtClientes.getSelectedRow();
    
    if (linha == -1) {
        JOptionPane.showMessageDialog(null, "SELECIONE UM CLIENTE PARA ATUALIZAR!", "Erro", JOptionPane.WARNING_MESSAGE);
        return;
    }
   int codigo = (int) jtClientes.getValueAt(linha, 0);
    modeloCliente = clienteController.getClientePeloIdController(codigo);
    cliente.setVisible(true);
    
    cliente.codigo().setText(String.valueOf(modeloCliente.getId()));
    cliente.nome().setText(modeloCliente.getNome());
    cliente.endereco().setText(modeloCliente.getEndereco());
    cliente.telefone().setText(modeloCliente.getTelefone());
    cliente.documento().setSelectedItem(modeloCliente.getDocumento());
    cliente.numero().setText(modeloCliente.getNumero());
     
}

public void ApagarCliente(){
    int linha = jtClientes.getSelectedRow();
    if (linha == -1) {
        JOptionPane.showMessageDialog(null, "SELECIONE UM CLIENTE PARA EXCLUIR!", "Erro", JOptionPane.WARNING_MESSAGE);
        return;
    }
   
    int codigo = (int) jtClientes.getValueAt(linha, 0);

    int opcaoApagar = JOptionPane.showConfirmDialog(this, "EXCLUIR CLIENTE ?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (opcaoApagar != JOptionPane.YES_OPTION) {
        return;
    }
    
    if(clienteController.ApagarClienteController(codigo)){
      
        this.CarregarClientes();
    }else{
     JOptionPane.showMessageDialog(this,"ERRO AO EXCLUIR CLIENTE, ELE PODE ESTAR ASSOCIADO A UMA OPERACAO","ERRO",JOptionPane.ERROR_MESSAGE);
    }
    
}

}

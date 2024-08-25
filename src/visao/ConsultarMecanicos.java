/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Controller.MecanicoController;
import Modelo.ModeloMecanico;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ConsultarMecanicos extends javax.swing.JPanel {
    
    ArrayList<ModeloMecanico>listaModeloMecanicos = new ArrayList<>();
    MecanicoController mecanicoController = new MecanicoController();
    ModeloMecanico modeloMecanico = new ModeloMecanico();
    
    private CadastrarMecanicos mecanicos;
    
    public ConsultarMecanicos() {
        initComponents();
        CarregarMecanicos();
        
        mecanicos = new CadastrarMecanicos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMecanicos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        painelBorderr19 = new utilitarios.PainelBorderr1();
        painelBorderr20 = new utilitarios.PainelBorderr1();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtMecanicos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jtMecanicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID UNCIONARIO", "NOME", "ENDERECO", "TELEFONE", "ESPECIALIDADE", "DATA REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMecanicos);
        if (jtMecanicos.getColumnModel().getColumnCount() > 0) {
            jtMecanicos.getColumnModel().getColumn(0).setResizable(false);
            jtMecanicos.getColumnModel().getColumn(1).setResizable(false);
            jtMecanicos.getColumnModel().getColumn(2).setResizable(false);
            jtMecanicos.getColumnModel().getColumn(3).setResizable(false);
            jtMecanicos.getColumnModel().getColumn(4).setResizable(false);
            jtMecanicos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accoes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 1, 14))); // NOI18N

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/print.png"))); // NOI18N
        jButton6.setText("Imprimir");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        painelBorderr19.setBackgroundColor(new java.awt.Color(0, 102, 204));

        painelBorderr20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelBorderr20.setBackgroundColor(new java.awt.Color(0, 102, 204));
        painelBorderr20.setBorderColor(new java.awt.Color(255, 255, 255));

        jTextField5.setBackground(new java.awt.Color(0, 102, 204));
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        javax.swing.GroupLayout painelBorderr20Layout = new javax.swing.GroupLayout(painelBorderr20);
        painelBorderr20.setLayout(painelBorderr20Layout);
        painelBorderr20Layout.setHorizontalGroup(
            painelBorderr20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr20Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelBorderr20Layout.setVerticalGroup(
            painelBorderr20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 102, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout painelBorderr19Layout = new javax.swing.GroupLayout(painelBorderr19);
        painelBorderr19.setLayout(painelBorderr19Layout);
        painelBorderr19Layout.setHorizontalGroup(
            painelBorderr19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBorderr20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBorderr19Layout.setVerticalGroup(
            painelBorderr19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBorderr19Layout.createSequentialGroup()
                .addGroup(painelBorderr19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr19Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelBorderr20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painelBorderr19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(painelBorderr19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     EnviarDadosParaFormulario();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    ApagarFuncionario();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new CadastrarMecanicos().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.removeAll();
        PainelCasa painelCasa = new PainelCasa();
        this.setLayout(new BorderLayout());
        this.add( painelCasa , BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.removeAll();
        PainelConsultas painelConsultas = new PainelConsultas();
        this.setLayout(new BorderLayout());
        this.add( painelConsultas  , BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable jtMecanicos;
    private utilitarios.PainelBorderr1 painelBorderr19;
    private utilitarios.PainelBorderr1 painelBorderr20;
    // End of variables declaration//GEN-END:variables
    
   
  private void EnviarDadosParaFormulario(){
       int linha = jtMecanicos.getSelectedRow();
         
      if (linha == -1) {
        JOptionPane.showMessageDialog(null, "SELECIONE UM FUNCIONARIO PARA ATUALIZAR!", "Erro", JOptionPane.WARNING_MESSAGE);
        return;
    }
    int codigo = (int) jtMecanicos.getValueAt(linha, 0);
    
    mecanicos.setVisible(true);
    modeloMecanico = mecanicoController.getMecanicoPeloIdController(codigo);
    
    mecanicos.codigo().setText(String.valueOf(modeloMecanico.getId()));
    mecanicos.nome().setText(modeloMecanico.getNome());
    mecanicos.endereco().setText(modeloMecanico.getEndereco());
    mecanicos.especialidade().setText(modeloMecanico.getEspecialidade());
    mecanicos.telefone().setText(modeloMecanico.getTelefone());
       
 }
  
  private void ApagarFuncionario(){
      int linha = jtMecanicos.getSelectedRow();
   
    if (linha == -1) {
        JOptionPane.showMessageDialog(null, "SELECIONE UM FUNCIONARIO PARA EXCLUIR!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int codigo = (int) jtMecanicos.getValueAt(linha, 0);

    int opcaoApagar = JOptionPane.showConfirmDialog(this, "EXCLUIR O FUNCIONARIO?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (opcaoApagar != JOptionPane.YES_OPTION) {
        return;
    }
    
     if (mecanicoController.ApagarMecanicoController(codigo)) {
        this.CarregarMecanicos();
    } else {
        JOptionPane.showMessageDialog(this, "ERRO AO EXCLUIR FUNCIONARIO, o funcionario pode estar relacionado a uma operação", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}
      
  
    
    
    private void CarregarMecanicos() {
        
        DefaultTableModel modelo = (DefaultTableModel) jtMecanicos.getModel();
        modelo.setNumRows(0);
        listaModeloMecanicos = mecanicoController.getListaMecanicoController();
        int cont = listaModeloMecanicos.size();
        
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModeloMecanicos.get(i).getId(),
                listaModeloMecanicos.get(i).getNome(),
                listaModeloMecanicos.get(i).getEndereco(),
                listaModeloMecanicos.get(i).getEspecialidade(),
                listaModeloMecanicos.get(i).getTelefone(),
                listaModeloMecanicos.get(i).getDataCriacao()
            });
            
        }
        
        
    }
}

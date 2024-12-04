package visao;

import Conexao.ConnectionFactory;
import Controller.OrdemServicoController;
import Controller.PecasController;
import Modelo.ModeloOrdemServico;
import Modelo.ModeloPecas;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ConsultarOrdem extends javax.swing.JPanel {

    ModeloOrdemServico modeloOrdemServico = new ModeloOrdemServico();
    OrdemServicoController ordemservicoController = new OrdemServicoController();
    ArrayList<ModeloOrdemServico> listaModeloOrdemServicos = new ArrayList<>();

    PecasController pecasController = new PecasController();
    ArrayList<ModeloPecas> listaModeloPecas = new ArrayList<ModeloPecas>();
    ModeloPecas modeloPecas = new ModeloPecas();

    private VerDetalhesOrdem verDetalhesOrdem;

    private CriarOrdemServico criarOrdemServico;
    
    private Faturar fatura;

    public ConsultarOrdem() {
        initComponents();
        verDetalhesOrdem = new VerDetalhesOrdem();
        criarOrdemServico = new CriarOrdemServico();
        fatura = new Faturar();
        CarregarOrdenServico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        painelBorderr11 = new utilitarios.PainelBorderr1();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        painelBorderr13 = new utilitarios.PainelBorderr1();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtOrdens.setBackground(new java.awt.Color(240, 240, 240));
        jtOrdens.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jtOrdens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA ABERTURA", "DATA FECHAMENTO", "CLIENTE", "MATRICULA", "SERVICO", "PRECO TOTAL", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtOrdens.setRowHeight(35);
        jScrollPane1.setViewportView(jtOrdens);
        if (jtOrdens.getColumnModel().getColumnCount() > 0) {
            jtOrdens.getColumnModel().getColumn(0).setResizable(false);
            jtOrdens.getColumnModel().getColumn(1).setResizable(false);
            jtOrdens.getColumnModel().getColumn(2).setResizable(false);
            jtOrdens.getColumnModel().getColumn(3).setResizable(false);
            jtOrdens.getColumnModel().getColumn(4).setResizable(false);
            jtOrdens.getColumnModel().getColumn(5).setResizable(false);
            jtOrdens.getColumnModel().getColumn(6).setResizable(false);
            jtOrdens.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accoes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 1, 14))); // NOI18N

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/print.png"))); // NOI18N
        jButton6.setText("Factura");
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

        jButton7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/print.png"))); // NOI18N
        jButton7.setText("Detalhes");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/print.png"))); // NOI18N
        jButton8.setText("Imprimir");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painelBorderr11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(painelBorderr11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      GerarFatura();
      jtOrdens.clearSelection();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EnviarDadosParaFormulario();
        jtOrdens.clearSelection();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ApagarOrdem();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.removeAll();
        CriarOrdemServico criarOrdemServico = new CriarOrdemServico();
        this.setLayout(new BorderLayout());
        this.add(criarOrdemServico, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.removeAll();
        PainelCasa painelCasa = new PainelCasa();
        this.setLayout(new BorderLayout());
        this.add(painelCasa, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.removeAll();
        PainelConsultas painelConsultas = new PainelConsultas();
        this.setLayout(new BorderLayout());
        this.add(painelConsultas, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        verDetalhes();
        jtOrdens.clearSelection();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

         relatorio();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtOrdens;
    private utilitarios.PainelBorderr1 painelBorderr11;
    private utilitarios.PainelBorderr1 painelBorderr13;
    // End of variables declaration//GEN-END:variables

    public void CarregarOrdenServico() {

        DefaultTableModel modelo = (DefaultTableModel) jtOrdens.getModel();
        modelo.setNumRows(0);
        listaModeloOrdemServicos = ordemservicoController.getListaOrdemServicocontroller();
        int cont = listaModeloOrdemServicos.size();

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModeloOrdemServicos.get(i).getId(),
                listaModeloOrdemServicos.get(i).getDataAbertura(),
                listaModeloOrdemServicos.get(i).getDataFechamento(),
                listaModeloOrdemServicos.get(i).getNomeCliente(),
                listaModeloOrdemServicos.get(i).getMatriculaVeiculo(),
                listaModeloOrdemServicos.get(i).getServico(),
                listaModeloOrdemServicos.get(i).getPrecoTotal(),
                listaModeloOrdemServicos.get(i).getStatus()

            });
        }
    }

    private void ApagarOrdem() {
        int linha = jtOrdens.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA ORDEM PARA EXCLUIR!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = (int) jtOrdens.getValueAt(linha, 0);

        int opcaoApagar = JOptionPane.showConfirmDialog(this, "EXCLUIR ORDEM DE SERVIÇO?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcaoApagar != JOptionPane.YES_OPTION) {
            return;
        }

        if (ordemservicoController.ApagarOrdemServicocontroller(id)) {
            this.CarregarOrdenServico();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO AO EXCLUIR SERVIÇO, A ordem pode estar relacionado a uma operação", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void verDetalhes() {
        int linha = jtOrdens.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA ORDEM PARA VER DETALHES!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = (int) jtOrdens.getValueAt(linha, 0);

        verDetalhesOrdem.setVisible(true);

        modeloOrdemServico = ordemservicoController.getOrdemServicocontroller(id);
        verDetalhesOrdem.txtCodigoOrdem().setText(String.valueOf(modeloOrdemServico.getId()));
        verDetalhesOrdem.txtCodigoCliente().setText(String.valueOf(modeloOrdemServico.getIdCliente()));
        verDetalhesOrdem.txtCliente().setText(modeloOrdemServico.getNomeCliente());
        verDetalhesOrdem.txtMatricula().setText(modeloOrdemServico.getMatriculaVeiculo());
        verDetalhesOrdem.txtVeiculo().setText(modeloOrdemServico.getMarcaVeiculo());
        verDetalhesOrdem.txtMecanico().setText(modeloOrdemServico.getNomeMecanico());
        verDetalhesOrdem.txtProblema().setText(modeloOrdemServico.getProblema());
        verDetalhesOrdem.txtServico().setText(modeloOrdemServico.getServico());
        verDetalhesOrdem.txtObservacoes().setText(modeloOrdemServico.getObservacoes());
        verDetalhesOrdem.txtDataAbertura().setText(modeloOrdemServico.getDataAbertura());
        verDetalhesOrdem.txtDataFechamento().setText(modeloOrdemServico.getDataFechamento());
        verDetalhesOrdem.txtPecas().setText(modeloOrdemServico.getPecas());
        verDetalhesOrdem.txtStatus().setText(modeloOrdemServico.getStatus());
        verDetalhesOrdem.txtValor().setText(String.valueOf(modeloOrdemServico.getPrecoTotal()));

    }

    public void EnviarDadosParaFormulario() {

        int linha = jtOrdens.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA ORDEM PARA VER ATUALIZAR!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = (int) jtOrdens.getValueAt(linha, 0);
        
      

        modeloOrdemServico = ordemservicoController.getOrdemServicocontroller(id);
        criarOrdemServico.txtCodigo().setText(String.valueOf(modeloOrdemServico.getId()));
        criarOrdemServico.txtIdCliente().setText(String.valueOf(modeloOrdemServico.getIdCliente()));
        criarOrdemServico.cboCliente().setSelectedItem(modeloOrdemServico.getNomeCliente());
        criarOrdemServico.cboMatricula().setSelectedItem(modeloOrdemServico.getMatriculaVeiculo());
        criarOrdemServico.txtVeiculo().setText(modeloOrdemServico.getMarcaVeiculo());
        criarOrdemServico.cboMecanico().setSelectedItem(modeloOrdemServico.getNomeMecanico());
        criarOrdemServico.txtProblema().setText(modeloOrdemServico.getProblema());
        criarOrdemServico.txtServico().setText(modeloOrdemServico.getServico());
        criarOrdemServico.txtObservacoes().setText(modeloOrdemServico.getObservacoes());
        criarOrdemServico.txtpecas().setText(modeloOrdemServico.getPecas());
        criarOrdemServico.cboStatus().setSelectedItem(modeloOrdemServico.getStatus());
        criarOrdemServico.dataSaida().setDateFormatString(modeloOrdemServico.getDataAbertura());
        criarOrdemServico.txtValorPago().setText(String.valueOf(modeloOrdemServico.getPrecoTotal()));

        this.ChamarFormulario(criarOrdemServico);

    }
    
    public void GerarFatura(){
        
        int linha = jtOrdens.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA ORDEM PARA GERAR FATURA!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = (int) jtOrdens.getValueAt(linha, 0);
        
        fatura.setVisible(true);
        modeloOrdemServico = ordemservicoController.getOrdemServicocontroller(id);
        
        fatura.txtCodigoOrdem().setText(String.valueOf(modeloOrdemServico.getId()));
        fatura.txtValorpagar().setText(String.valueOf(modeloOrdemServico.getPrecoTotal()));
        
    }

    public void ChamarFormulario(CriarOrdemServico criarOrdemServico) {
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(criarOrdemServico, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    public void relatorio(){
                                             

    try {
        // Pegar a linha selecionada
        int linha = jtOrdens.getSelectedRow(); 
        
        // Verificar se alguma linha foi selecionada
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA ORDEM PARA GERAR O RELATÓRIO!", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Pegar o valor do ID na primeira coluna (coluna 0)
      int codigo = (int) jtOrdens.getValueAt(linha, 0);
System.out.println("ID selecionado: " + codigo); // Coluna 0 contém o ID do funcionário

        try (Connection conn = ConnectionFactory.getConnection()) {
            // Caminho para o arquivo .jrxml
            String src = "src\\relatorios\\rcb.jrxml";
            
            // Compilar o relatório
            JasperReport jr = JasperCompileManager.compileReport(src);

            // Criar um Map para os parâmetros do relatório
          Map<String, Object> parametros = new HashMap<>();
parametros.put("P_idd", codigo); // 'selectedId' é o nome do parâmetro definido no relatório Jasper

            // Preencher o relatório com o parâmetro e a conexão
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conn);

            // Exibir o relatório
            JasperViewer.viewReport(jp, false);
        }

    } catch (SQLException | JRException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }


  }
  


}

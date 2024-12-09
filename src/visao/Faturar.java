package visao;

import Controller.ControllerFluxo;
import Controller.FaturaController;
import Controller.OrdemServicoController;
import Modelo.ModeloFatura;
import Modelo.ModeloFluxo;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Faturar extends javax.swing.JFrame {

    ModeloFatura modeloFatura = new ModeloFatura();
    FaturaController faturaController = new FaturaController();

    OrdemServicoController ordemServicoController = new OrdemServicoController();

    public Faturar() {
        initComponents();
        setLocationRelativeTo(null);
        btnFinalizar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelBorderr11 = new utilitarios.PainelBorderr1();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoOrdem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtValorpagar = new javax.swing.JTextField();
        cboMetodoPagamento = new javax.swing.JComboBox();
        txtValorRecebido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTrocos = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FINALIZAR");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        painelBorderr11.setBackgroundColor(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Finalizar Ordem de Servico");

        javax.swing.GroupLayout painelBorderr11Layout = new javax.swing.GroupLayout(painelBorderr11);
        painelBorderr11.setLayout(painelBorderr11Layout);
        painelBorderr11Layout.setHorizontalGroup(
            painelBorderr11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        painelBorderr11Layout.setVerticalGroup(
            painelBorderr11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Logomarca");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Ordem de Servico ID ");

        txtCodigoOrdem.setEditable(false);
        txtCodigoOrdem.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        txtCodigoOrdem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigoOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel9.setText("Metodo de Pagamento: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel10.setText("Total A pagar :");

        txtValorpagar.setEditable(false);
        txtValorpagar.setBackground(new java.awt.Color(187, 187, 187));
        txtValorpagar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        txtValorpagar.setForeground(new java.awt.Color(60, 63, 65));
        txtValorpagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cboMetodoPagamento.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        cboMetodoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "M-pesa", "E-mola" }));
        cboMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMetodoPagamentoActionPerformed(evt);
            }
        });

        txtValorRecebido.setBackground(new java.awt.Color(60, 63, 65));
        txtValorRecebido.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        txtValorRecebido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorRecebidoActionPerformed(evt);
            }
        });
        txtValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorRecebidoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel11.setText("Recebido :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("Trocos:");

        txtTrocos.setEditable(false);
        txtTrocos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        txtTrocos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtValorRecebido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorpagar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMetodoPagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 292, Short.MAX_VALUE)
                    .addComponent(txtTrocos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFinalizar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBorderr11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelBorderr11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMetodoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMetodoPagamentoActionPerformed

    private void txtValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorRecebidoActionPerformed
        CalcularTrocos();
    }//GEN-LAST:event_txtValorRecebidoActionPerformed

    private void txtValorRecebidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorRecebidoKeyReleased
        CalcularTrocos();
    }//GEN-LAST:event_txtValorRecebidoKeyReleased

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        GerarFatura();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Faturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faturar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox cboMetodoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private utilitarios.PainelBorderr1 painelBorderr11;
    private javax.swing.JTextField txtCodigoOrdem;
    private javax.swing.JTextField txtTrocos;
    private javax.swing.JTextField txtValorRecebido;
    private javax.swing.JTextField txtValorpagar;
    // End of variables declaration//GEN-END:variables

    public JTextField txtCodigoOrdem() {
        return txtCodigoOrdem;
    }

    public JTextField txtValorpagar() {
        return txtValorpagar;
    }

    public void CalcularTrocos() {
        double trocos = 0;
        double recebido = 0;
        double valorApagar = 0;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        try {
            recebido = Double.parseDouble(txtValorRecebido.getText());
            valorApagar = Double.parseDouble(txtValorpagar.getText());

            if (recebido >= valorApagar) {
                trocos = recebido - valorApagar;

                txtTrocos.setText(df.format(trocos));
                txtValorRecebido.setForeground(new Color(0, 204, 51));
                btnFinalizar.setEnabled(true);
            } else {
                txtTrocos.setText("0.00");
                txtValorRecebido.setForeground(Color.RED);
                btnFinalizar.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            txtTrocos.setText("0.00");
            txtValorRecebido.setForeground(Color.RED);
        }
        if (txtValorRecebido.getText().equals("")) {
            btnFinalizar.setEnabled(false);
            return;
        }
    }

    public void GerarFatura() {

        if (txtCodigoOrdem.getText().isEmpty() || cboMetodoPagamento.getSelectedItem() == null
                || txtValorpagar.getText().isEmpty() || txtValorRecebido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        modeloFatura.setIdOrdem(Integer.parseInt(txtCodigoOrdem.getText()));
        modeloFatura.setMetodoPagamento(cboMetodoPagamento.getSelectedItem().toString());
        modeloFatura.setValorApagar(Double.parseDouble(txtValorpagar.getText().replace(".", "").replace(",", ".")));
        modeloFatura.setValorRecebido(Double.parseDouble(txtValorRecebido.getText().replace(".", "").replace(",", ".")));

        try {
            String trocosStr = txtTrocos.getText().replace(".", "").replace(",", ".");
            double trocos = Double.parseDouble(trocosStr);
            modeloFatura.setTrocos(trocos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "VALOR DOS TROCOS INVÁLIDOS.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int resultado = faturaController.GerarFaturaController(modeloFatura);

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "SUCESSO!");

            try {

                OrdemServicoController ordemServicoController = new OrdemServicoController();
                String matriculaVeiculo = ordemServicoController.obterMatriculaPorIdOrdemController(modeloFatura.getIdOrdem());

                if (matriculaVeiculo != null) {
                    ModeloFluxo modeloFluxo = new ModeloFluxo();
                    modeloFluxo.setMatricula(matriculaVeiculo);
                    modeloFluxo.setEstado("Saída");
                    modeloFluxo.setData(new java.util.Date());

                    ControllerFluxo controllerFluxo = new ControllerFluxo();
                    boolean sucessoFluxo = controllerFluxo.salvarFluxoController(modeloFluxo);

                    if (sucessoFluxo) {
                        // JOptionPane.showMessageDialog(this, "Fluxo de saída registrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao registrar fluxo de saída.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível encontrar a matrícula do veículo para esta ordem.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao registrar fluxo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

            limparFormulario();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "OCORREU UM ERRO AO FINALIZAR A ORDEM DE SERVIÇO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparFormulario() {
        this.txtCodigoOrdem.setText("");
        this.txtTrocos.setText("");
        this.txtValorRecebido.setText("");
        this.txtValorpagar.setText("");

    }

}

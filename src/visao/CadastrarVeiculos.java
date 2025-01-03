package visao;

import Controller.ClienteController;
import Controller.ControllerFluxo;
import Controller.VeiculoController;
import Modelo.ModeloCliente;
import Modelo.ModeloFluxo;
import Modelo.ModeloVeiculo;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastrarVeiculos extends javax.swing.JFrame {

    ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
    VeiculoController veiculoController = new VeiculoController();

    ClienteController clienteController = new ClienteController();
    ArrayList<ModeloCliente> listaModeloClientes = new ArrayList<>();

    public CadastrarVeiculos() {
        initComponents();
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        CarregarProprietariosNaComobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        cboProprietario = new javax.swing.JComboBox();
        cboModelo = new componentes.UJComboBox();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR VEICULOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Matrícula:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Proprietário:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Modelo:");

        txtMatricula.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Adicionar.png"))); // NOI18N
        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        cboProprietario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProprietarioActionPerformed(evt);
            }
        });

        cboModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "Toyota", "Nissan", "Ford", "Isuzu", "Mitsubishi", "Volkswagen", "Hyundai", "Kia", "Honda", "Suzuki", "Renault", "Mazda", "Chevrolet", "Peugeot", "Land Rover", "Mahindra", "Mercedes-Benz", "BMW", "Audi", "Jeep", "Tata", "Subaru", "Chery", "Haval", "Great Wall", "Fiat", "Volvo", "Datsun", "Opel", "Lexus", "SsangYong", "Jaguar", "Porsche", "Bentley", "Infiniti", "Mini", "Maserati" }));
        cboModelo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMarca)
                                .addComponent(cboProprietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salvarOuAlterar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProprietarioActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.UJComboBox cboModelo;
    private javax.swing.JComboBox cboProprietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables

    public JTextField codigo() {
        return txtCodigo;
    }

    public JTextField matricula() {
        return txtMatricula;
    }

    public JComboBox modelo() {
        return cboModelo;
    }

    public JTextField marca() {
        return txtMarca;
    }

    public JComboBox proprietario() {
        return cboProprietario;
    }

    private void CarregarProprietariosNaComobox() {

        listaModeloClientes = clienteController.getListaModeloClienteController();
        cboProprietario.removeAllItems();
        cboProprietario.addItem("--Selecione--");
        for (int i = 0; i < listaModeloClientes.size(); i++) {
            cboProprietario.addItem(listaModeloClientes.get(i).getNome());
        }

    }

   private void SalvarVeiculos() {
    if (!txtMatricula.getText().isEmpty() && cboModelo.getSelectedItem() != null && !txtMarca.getText().isEmpty() && cboProprietario.getSelectedItem() != null) {
        // Configuração do modelo de veículo
        modeloVeiculo.setMatricula(txtMatricula.getText());
        modeloVeiculo.setModelo(cboModelo.getSelectedItem().toString());
        modeloVeiculo.setMarca(txtMarca.getText());
        modeloVeiculo.setCliente(cboProprietario.getSelectedItem().toString());

        // Verificação de duplicação
        if (veiculoController.VerificarExistenciaVeiculoController(modeloVeiculo)) {
            JOptionPane.showMessageDialog(this, "MATRICULA DO VEICULO JA EXISTENTE  ", "Duplicação de Dados", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validação de campos obrigatórios
        if (modeloVeiculo.getModelo().equals("--Selecione--") || modeloVeiculo.getCliente().equals("--Selecione--")) {
            JOptionPane.showMessageDialog(this, "ALGUM CAMPO OBRIGATORIO IGNORADO", "ERRO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Salvar veículo no banco de dados
        if (veiculoController.SalvarVeiculoController(modeloVeiculo) > 0) {
            JOptionPane.showMessageDialog(this, "SUCESSO");
            
            // Inserir no fluxo com estado "Entrada"
            ModeloFluxo modeloFluxo = new ModeloFluxo();
            modeloFluxo.setMatricula(txtMatricula.getText());
            modeloFluxo.setEstado("Entrada");
            modeloFluxo.setData(new java.util.Date());

            ControllerFluxo controllerFluxo = new ControllerFluxo();
            if (controllerFluxo.salvarFluxoController(modeloFluxo)) {
                JOptionPane.showMessageDialog(this, "Fluxo registrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao registrar fluxo de Entrada !", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            LimparaGormulario(); // Limpar formulário
        } else {
            JOptionPane.showMessageDialog(this, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "ALGUM CAMPO OBRIGATORIO IGNORADO", "ERRO", JOptionPane.WARNING_MESSAGE);
    }
}


    public void EditarVeiculo() {
        if (!txtMatricula.getText().isEmpty() && !txtMarca.getText().isEmpty() && cboModelo.getSelectedItem() != null
                && cboProprietario.getSelectedItem() != null) {
            modeloVeiculo.setId(Integer.parseInt(txtCodigo.getText()));
            modeloVeiculo.setMatricula(txtMatricula.getText());
            modeloVeiculo.setModelo(cboModelo.getSelectedItem().toString());
            modeloVeiculo.setMarca(txtMarca.getText());
            modeloVeiculo.setCliente(cboProprietario.getSelectedItem().toString());

            if (veiculoController.VerificarExistenciaVeiculoController(modeloVeiculo)) {
                JOptionPane.showMessageDialog(this, "MATRICULA DO VEICULO JA EXISTENTE  ", "Duplicação de Dados", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (modeloVeiculo.getModelo().equals("--Selecione--") || modeloVeiculo.getCliente().equals("--Selecione--")) {
                JOptionPane.showMessageDialog(this, "ALGUN CAMPO OBRIGATORIO IGNORADO", "ERRO", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (veiculoController.AtualizarVeiculoController(modeloVeiculo)) {
                JOptionPane.showMessageDialog(this, "ATUALIZADO COM SUCESSO");
                LimparaGormulario();

            } else {
                JOptionPane.showMessageDialog(this, "ERRO AO ATUALIZAR DADOS DO VEICULO", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ALGUM CAMPO OBRIGADO IGNORADO.", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void salvarOuAlterar() {

        if (txtCodigo.getText().isEmpty()) {
            this.SalvarVeiculos();
        } else {
            this.EditarVeiculo();
        }
    }

    public void LimparaGormulario() {
        this.txtCodigo.setText("");
        this.txtMarca.setText("");
        this.txtMarca.setText("");
        this.cboModelo.setSelectedItem("--Selecione");
        this.txtMatricula.setText("");
        this.cboProprietario.setSelectedItem("--Selecione--");
    }

}

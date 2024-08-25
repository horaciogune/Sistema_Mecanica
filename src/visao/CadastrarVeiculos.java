
package visao;

import Controller.ClienteController;
import Controller.VeiculoController;
import Modelo.ModeloCliente;
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Matricula:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Proprietario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Modelo:");

        txtMatricula.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(51, 51, 51));
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 51, 51));

        cboProprietario.setBackground(new java.awt.Color(240, 240, 240));
        cboProprietario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboProprietario.setForeground(new java.awt.Color(51, 51, 51));
        cboProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProprietarioActionPerformed(evt);
            }
        });

        cboModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "Toyota", "Nissan", "Ford", "Isuzu", "Mitsubishi", "Volkswagen", "Hyundai", "Kia", "Honda", "Suzuki", "Renault", "Mazda", "Chevrolet", "Peugeot", "Land Rover", "Mahindra", "Mercedes-Benz", "BMW", "Audi", "Jeep", "Tata", "Subaru", "Chery", "Haval", "Great Wall", "Fiat", "Volvo", "Datsun", "Opel", "Lexus", "SsangYong", "Jaguar", "Porsche", "Bentley", "Infiniti", "Mini", "Maserati" }));
        cboModelo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarca)
                            .addComponent(cboProprietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(111, Short.MAX_VALUE))
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

public JTextField codigo(){
    return txtCodigo;
}
public JTextField matricula(){
    return txtMatricula;
}
public JComboBox modelo(){
    return cboModelo;
}
public JTextField marca(){
    return txtMarca;
}
public JComboBox proprietario(){
    return cboProprietario;
}
    
    

private void CarregarProprietariosNaComobox(){
    
    listaModeloClientes = clienteController.getListaModeloClienteController();
    cboProprietario.removeAllItems();
    cboProprietario.addItem("--Selecione--");
    for(int i=0; i < listaModeloClientes.size();i++){
        cboProprietario.addItem(listaModeloClientes.get(i).getNome());
    }
    
    
}
   
private void SalvarVeiculos(){
    
    if(!txtMatricula.getText().isEmpty()&& cboModelo.getSelectedItem()!= null && !txtMarca.getText().isEmpty() && cboProprietario.getSelectedItem() !=null){
    modeloVeiculo.setMatricula(txtMatricula.getText());
    modeloVeiculo.setModelo(cboModelo.getSelectedItem().toString());
    modeloVeiculo.setMarca(txtMarca.getText());
    modeloVeiculo.setCliente(cboProprietario.getSelectedItem().toString());
    
    if(veiculoController.VerificarExistenciaVeiculoController(modeloVeiculo)){
        JOptionPane.showMessageDialog(this,"Veiculo ja existente","ERRO",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if(veiculoController.SalvarVeiculoController(modeloVeiculo)>0){
     JOptionPane.showMessageDialog(this,"SUCESSO");
    }else{
     JOptionPane.showMessageDialog(this,"ERRO","ERRO",JOptionPane.ERROR_MESSAGE);
 
    }
    }else{
       JOptionPane.showMessageDialog(this,"ALGUN CAMPO OBRIGATORIO IGNORADO","ERRO",JOptionPane.ERROR_MESSAGE);
   
    }
}

public void EditarVeiculo(){
    if(!txtMatricula.getText().isEmpty() && ! txtMarca.getText().isEmpty() && cboModelo.getSelectedItem() !=null 
    && cboProprietario.getSelectedItem() !=null){
    modeloVeiculo.setId(Integer.parseInt(txtCodigo.getText()));
    modeloVeiculo.setMatricula(txtMatricula.getText());
    modeloVeiculo.setModelo(cboModelo.getSelectedItem().toString());
    modeloVeiculo.setMarca(txtMarca.getText());
    modeloVeiculo.setCliente(cboProprietario.getSelectedItem().toString());
    
    if(veiculoController.AtualizarVeiculoController(modeloVeiculo)){
        JOptionPane.showMessageDialog(this,"ATUALIZADO COM SUCESSO");
        
    }else{
       JOptionPane.showMessageDialog(this,"ERRO AO ATUALIZAR DADOS DO VEICULO","Erro",JOptionPane.ERROR_MESSAGE);
    }
    }else{
     JOptionPane.showMessageDialog(this, "ALGUM CAMPO OBRIGADO IGNORADO.", "Erro", JOptionPane.ERROR_MESSAGE);
   
    }
}

private void salvarOuAlterar(){
    
    if(txtCodigo.getText().isEmpty()){
    this.SalvarVeiculos();
    }else{
        this.EditarVeiculo();
    }
}

}

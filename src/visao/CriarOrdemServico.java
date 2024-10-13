package visao;

import Controller.ClienteController;
import Controller.MecanicoController;
import Controller.OrdemServicoController;
import Controller.PecasController;
import Controller.VeiculoController;
import Modelo.ModeloCliente;
import Modelo.ModeloMecanico;
import Modelo.ModeloOrdemServico;
import Modelo.ModeloPecas;
import Modelo.ModeloVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class CriarOrdemServico extends javax.swing.JPanel {

    ModeloOrdemServico modeloOrdemServico = new ModeloOrdemServico();
    ArrayList<ModeloOrdemServico> listaModeloOrdemServicos = new ArrayList<>();
    OrdemServicoController ordemServicoController = new OrdemServicoController();

    ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
    VeiculoController veiculoController = new VeiculoController();
    ArrayList<ModeloVeiculo> listaModeloVeiculos = new ArrayList<>();

    ClienteController clienteController = new ClienteController();
    ArrayList<ModeloCliente> listaModeloClientes = new ArrayList<>();
    ModeloCliente modeloCliente = new ModeloCliente();

    ArrayList<ModeloMecanico> listaModeloMecanicos = new ArrayList<>();
    MecanicoController mecanicoController = new MecanicoController();
    ModeloMecanico modeloMecanico = new ModeloMecanico();

    ArrayList<ModeloPecas> listaModeloPecas = new ArrayList<>();
    PecasController pecasController = new PecasController();
    ModeloPecas modeloPecas = new ModeloPecas();

    public CriarOrdemServico() {
        initComponents();
        CarregarClientesNaComboBox();
        CarregarMatriculasNaComboBox();
        CarregarMecanicosNaComboBox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cboMecanico = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        dataSaida = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        cboStatus = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cboMatricula = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtVeiculo = new javax.swing.JTextField();
        painelBorderr14 = new utilitarios.PainelBorderr1();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        painelBorderr15 = new utilitarios.PainelBorderr1();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new utilitarios.JTextFieldBorder();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new utilitarios.JTextFieldBorder();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtProblema = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtServico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtpecas = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cliente:");

        cboCliente.setBackground(new java.awt.Color(0, 102, 204));
        cboCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboCliente.setForeground(new java.awt.Color(255, 255, 255));
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Mecanico:");

        cboMecanico.setBackground(new java.awt.Color(0, 102, 204));
        cboMecanico.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboMecanico.setForeground(new java.awt.Color(255, 255, 255));
        cboMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMecanicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMecanico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        dataSaida.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Data Saida:");

        cboStatus.setBackground(new java.awt.Color(0, 102, 204));
        cboStatus.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboStatus.setForeground(new java.awt.Color(255, 255, 255));
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "Aberto", "Fechado", "EM Andamento" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Status:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Matricula:");

        cboMatricula.setBackground(new java.awt.Color(0, 102, 204));
        cboMatricula.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboMatricula.setForeground(new java.awt.Color(255, 255, 255));
        cboMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMatriculaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Veiculo :");

        txtVeiculo.setEditable(false);
        txtVeiculo.setBackground(new java.awt.Color(0, 102, 204));
        txtVeiculo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        txtVeiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeiculoActionPerformed(evt);
            }
        });
        txtVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVeiculoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVeiculoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboMatricula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVeiculo))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        painelBorderr14.setBackgroundColor(new java.awt.Color(0, 102, 204));

        jButton7.setBackground(new java.awt.Color(0, 102, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        painelBorderr15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelBorderr15.setBackgroundColor(new java.awt.Color(0, 102, 204));
        painelBorderr15.setBorderColor(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(0, 102, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        javax.swing.GroupLayout painelBorderr15Layout = new javax.swing.GroupLayout(painelBorderr15);
        painelBorderr15.setLayout(painelBorderr15Layout);
        painelBorderr15Layout.setHorizontalGroup(
            painelBorderr15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr15Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        painelBorderr15Layout.setVerticalGroup(
            painelBorderr15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBorderr15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBackgroundColor(new java.awt.Color(0, 102, 204));
        txtCodigo.setBorderColor(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero:");

        txtIdCliente.setEditable(false);
        txtIdCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setBackgroundColor(new java.awt.Color(0, 102, 204));
        txtIdCliente.setBorderColor(new java.awt.Color(255, 255, 255));
        txtIdCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Cliente:");

        javax.swing.GroupLayout painelBorderr14Layout = new javax.swing.GroupLayout(painelBorderr14);
        painelBorderr14.setLayout(painelBorderr14Layout);
        painelBorderr14Layout.setHorizontalGroup(
            painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBorderr14Layout.createSequentialGroup()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(painelBorderr15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBorderr14Layout.setVerticalGroup(
            painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBorderr14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBorderr15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtProblema.setColumns(20);
        txtProblema.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtProblema.setRows(5);
        txtProblema.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descricao do Problema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N
        jScrollPane4.setViewportView(txtProblema);

        txtServico.setColumns(20);
        txtServico.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtServico.setRows(5);
        txtServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servico a ser Realizado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N
        jScrollPane2.setViewportView(txtServico);

        txtObservacoes.setColumns(20);
        txtObservacoes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtObservacoes.setRows(5);
        txtObservacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observacoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N
        jScrollPane3.setViewportView(txtObservacoes);

        txtpecas.setColumns(20);
        txtpecas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtpecas.setRows(5);
        txtpecas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inclua pecas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N
        jScrollPane5.setViewportView(txtpecas);
        txtpecas.getAccessibleContext().setAccessibleName("Incluir pecas");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Valor Total a Pagar:");

        txtValorPago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txtValorPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagoActionPerformed(evt);
            }
        });
        txtValorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorPagoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorPagoKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton2.setText("Gravar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane2)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorPago))
                    .addComponent(jScrollPane3))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jButton2))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBorderr14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(painelBorderr14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        PrencherIdClientePeloNome();
    }//GEN-LAST:event_cboClienteActionPerformed

    private void cboMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMecanicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMecanicoActionPerformed

    private void cboMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMatriculaActionPerformed
        PrencherMarcaDoVeiculoPelaMatricula();
    }//GEN-LAST:event_cboMatriculaActionPerformed

    private void txtVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeiculoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtVeiculoActionPerformed

    private void txtVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVeiculoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtVeiculoKeyPressed

    private void txtVeiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVeiculoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtVeiculoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SalvarOrdemServico();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtValorPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagoKeyReleased

    private void txtValorPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagoKeyPressed

    private void txtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagoActionPerformed

    private void txtClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteIdActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboMatricula;
    private javax.swing.JComboBox cboMecanico;
    private javax.swing.JComboBox cboStatus;
    private com.toedter.calendar.JDateChooser dataSaida;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private utilitarios.PainelBorderr1 painelBorderr14;
    private utilitarios.PainelBorderr1 painelBorderr15;
    private utilitarios.JTextFieldBorder txtCodigo;
    private utilitarios.JTextFieldBorder txtIdCliente;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextArea txtProblema;
    private javax.swing.JTextArea txtServico;
    private javax.swing.JTextField txtValorPago;
    private javax.swing.JTextField txtVeiculo;
    private javax.swing.JTextArea txtpecas;
    // End of variables declaration//GEN-END:variables

    private void CarregarClientesNaComboBox() {
        listaModeloClientes = clienteController.getListaModeloClienteController();
        cboCliente.removeAllItems();
        cboCliente.addItem("--Selecione--");
        for (int i = 0; i < listaModeloClientes.size(); i++) {
            cboCliente.addItem(listaModeloClientes.get(i).getNome());
        }
    }

    private void CarregarMatriculasNaComboBox() {
        listaModeloVeiculos = veiculoController.getListaVeiculoController();
        cboMatricula.removeAllItems();
        cboMatricula.addItem("--Selecione--");
        for (int i = 0; i < listaModeloVeiculos.size(); i++) {
            cboMatricula.addItem(listaModeloVeiculos.get(i).getMatricula());
        }
    }

    private void CarregarMecanicosNaComboBox() {
        listaModeloMecanicos = mecanicoController.getListaMecanicoController();
        cboMecanico.removeAllItems();
        cboMecanico.addItem("--Selecione--");
        for (int i = 0; i < listaModeloMecanicos.size(); i++) {
            cboMecanico.addItem(listaModeloMecanicos.get(i).getNome());
        }
    }

    private void PrencherMarcaDoVeiculoPelaMatricula() {
        modeloVeiculo = veiculoController.getVeiculoPelaMatriculaController(cboMatricula.getSelectedItem().toString());
        txtVeiculo.setText(modeloVeiculo.getMarca());
    }

    private void PrencherIdClientePeloNome() {
        modeloCliente = clienteController.getClienteControllerPeloNome(cboCliente.getSelectedItem().toString());
        txtIdCliente.setText(String.valueOf(modeloCliente.getId()));
    }

    

    private void SalvarOrdemServico() {

        modeloOrdemServico.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
        modeloOrdemServico.setNomeCliente(cboCliente.getSelectedItem().toString());
        modeloOrdemServico.setNomeMecanico(cboMecanico.getSelectedItem().toString());
        modeloOrdemServico.setMatriculaVeiculo(cboMatricula.getSelectedItem().toString());
        modeloOrdemServico.setMarcaVeiculo(txtVeiculo.getText());
        modeloOrdemServico.setStatus(cboStatus.getSelectedItem().toString());
        modeloOrdemServico.setProblema(txtProblema.getText());
        modeloOrdemServico.setServico(txtServico.getText());
        modeloOrdemServico.setObservacoes(txtObservacoes.getText());
        modeloOrdemServico.setPecas(txtpecas.getText());
        modeloOrdemServico.setPrecoTotal(Double.parseDouble(txtValorPago.getText()));

        Date dataSelecionada = dataSaida.getDate();

        if (dataSelecionada != null) {

            SimpleDateFormat formatoData = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");

            String dataFormatada = formatoData.format(dataSelecionada);

            modeloOrdemServico.setDataFechamento(dataFormatada);
        } else {
            System.out.println("Nenhuma data foi selecionada.");
        }

        if (ordemServicoController.SalvarOrdemServicocontroller(modeloOrdemServico) > 0) {
            JOptionPane.showMessageDialog(this, "SUCESSO");
        } else {
            JOptionPane.showMessageDialog(this, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }

  
}

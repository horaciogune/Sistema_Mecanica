
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
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    
    ArrayList<ModeloMecanico>listaModeloMecanicos = new ArrayList<>();
    MecanicoController mecanicoController = new MecanicoController();
    ModeloMecanico modeloMecanico = new ModeloMecanico();
    
    ArrayList<ModeloPecas> listaModeloPecas = new ArrayList<>();
    PecasController pecasController = new PecasController();
    ModeloPecas modeloPecas = new ModeloPecas();
    
    
    public CriarOrdemServico() {
        initComponents();
        dataHora();
        btnAdicionar.setEnabled(false);
        cboProdutos.setEnabled(false);
        CarregarClientesNaComboBox();
        CarregarMatriculasNaComboBox();
        CarregarMecanicosNaComboBox();
        CarregarProdutosNaComboBox();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cboMecanico = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboMatricula = new javax.swing.JComboBox();
        cboPecas = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cboStatus = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtVeiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtValorPago = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dataSaida = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtServico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtProblema = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        spinerQuantidade = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        cboProdutos = new componentes.UJComboBox();
        txtPreco = new javax.swing.JTextField();

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

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Veiculo :");

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

        cboPecas.setBackground(new java.awt.Color(0, 102, 204));
        cboPecas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboPecas.setForeground(new java.awt.Color(255, 255, 255));
        cboPecas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "Sim", "Nao" }));
        cboPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPecasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Incluir Pecas:");

        cboStatus.setBackground(new java.awt.Color(0, 102, 204));
        cboStatus.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboStatus.setForeground(new java.awt.Color(255, 255, 255));
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "Aberto", "Fechado", "EM Andamento" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Status:");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMecanico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPecas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cboMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTOS", "PRECO UNIDADE", "QUANTIDADE", "PRECO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setResizable(false);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(1).setResizable(false);
            jtProdutos.getColumnModel().getColumn(2).setResizable(false);
            jtProdutos.getColumnModel().getColumn(3).setResizable(false);
            jtProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton2.setText("Gravar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Valor a Pagar");

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Data entrada");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Data Saida");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData)
                    .addComponent(txtValorPago)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(40, 40, 40))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Produtos:");

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

        txtProblema.setColumns(20);
        txtProblema.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtProblema.setRows(5);
        txtProblema.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descricao do Problema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N
        jScrollPane4.setViewportView(txtProblema);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Preco Unidade");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Qty:");

        spinerQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Adicionar.png"))); // NOI18N
        btnAdicionar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        cboProdutos.setBackground(new java.awt.Color(0, 102, 204));
        cboProdutos.setForeground(new java.awt.Color(255, 255, 255));
        cboProdutos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProdutosActionPerformed(evt);
            }
        });

        txtPreco.setEditable(false);
        txtPreco.setBackground(new java.awt.Color(0, 102, 204));
        txtPreco.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinerQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdicionar)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(spinerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAdicionar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
      AdicionarProdutos();
    }//GEN-LAST:event_btnAdicionarActionPerformed

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

    private void cboPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPecasActionPerformed
        IncluirPecas();
    }//GEN-LAST:event_cboPecasActionPerformed

    private void cboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdutosActionPerformed
        // TODO add your handling code here:
        PrencherPrecoPeloNome();
    }//GEN-LAST:event_cboProdutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboMatricula;
    private javax.swing.JComboBox cboMecanico;
    private javax.swing.JComboBox cboPecas;
    private componentes.UJComboBox cboProdutos;
    private javax.swing.JComboBox cboStatus;
    private com.toedter.calendar.JDateChooser dataSaida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JSpinner spinerQuantidade;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextArea txtProblema;
    private javax.swing.JTextArea txtServico;
    private javax.swing.JTextField txtValorPago;
    private javax.swing.JTextField txtVeiculo;
    // End of variables declaration//GEN-END:variables

   private void CarregarClientesNaComboBox() {
        listaModeloClientes = clienteController.getListaModeloClienteController();
        cboCliente.removeAllItems();
        cboCliente.addItem("--Selecione--");
        for(int i = 0; i < listaModeloClientes.size(); i++) {
             cboCliente.addItem(listaModeloClientes.get(i).getNome());
      } 
    }
   
    private void CarregarMatriculasNaComboBox() {
        listaModeloVeiculos = veiculoController.getListaVeiculoController();
        cboMatricula.removeAllItems();
        cboMatricula.addItem("--Selecione--");
        for(int i = 0; i < listaModeloVeiculos.size(); i++) {
             cboMatricula.addItem(listaModeloVeiculos.get(i).getMatricula());
      } 
    }
    
    private void CarregarMecanicosNaComboBox() {
        listaModeloMecanicos = mecanicoController.getListaMecanicoController();
        cboMecanico.removeAllItems();
        cboMecanico.addItem("--Selecione--");
        for(int i = 0; i < listaModeloMecanicos.size(); i++) {
             cboMecanico.addItem(listaModeloMecanicos.get(i).getNome());
      } 
    }
     private void CarregarProdutosNaComboBox() {
        listaModeloPecas = pecasController.getListaPecasController();
        cboProdutos.removeAllItems();
        cboProdutos.addItem("--Selecione--");
        for(int i = 0; i < listaModeloPecas.size(); i++) {
             cboProdutos.addItem(listaModeloPecas.get(i).getDescriacao());
      } 
    }
    
    
    
    private void PrencherMarcaDoVeiculoPelaMatricula(){
        modeloVeiculo = veiculoController.getVeiculoPelaMatriculaController(cboMatricula.getSelectedItem().toString());
        txtVeiculo.setText(modeloVeiculo.getMarca());
    }
    private void PrencherIdClientePeloNome(){
        modeloCliente = clienteController.getClienteControllerPeloNome(cboCliente.getSelectedItem().toString());
        //txtIdCliente.setText(String.valueOf(modeloCliente.getId()));
    }
     private void PrencherPrecoPeloNome(){
         modeloPecas = pecasController.getPecasPeloNomeController(cboProdutos.getSelectedItem().toString());
         txtPreco.setText(String.valueOf(modeloPecas.getPrecovenda()));
    
    }
    
    private void IncluirPecas(){
        if(cboPecas.getSelectedItem().equals("Sim")){
            btnAdicionar.setEnabled(true);
            cboProdutos.setEnabled(true);
        }else{
            btnAdicionar.setEnabled(false);
            cboProdutos.setEnabled(false);
            jtProdutos.removeAll();
        }
    }
    
private void AdicionarProdutos() {
    int quantidade = Integer.parseInt(spinerQuantidade.getValue().toString());

    if (quantidade <= 0) {
        JOptionPane.showMessageDialog(this, "QUANTIDADE INVÁLIDA, SELECIONE UMA QUANTIDADE MAIOR QUE 0.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    modeloPecas = pecasController.getPecasPeloNomeController(cboProdutos.getSelectedItem().toString());
    DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
    
    
    boolean produtoExiste = false;
    for (int i = 0; i < modelo.getRowCount(); i++) {
        if (modelo.getValueAt(i, 0).equals(modeloPecas.getId())) {
           
            int quantidadeExistente = (int) modelo.getValueAt(i, 3);
            int novaQuantidade = quantidadeExistente + quantidade;
            modelo.setValueAt(novaQuantidade, i, 3);
            modelo.setValueAt(novaQuantidade * modeloPecas.getPrecovenda(), i, 4);
            produtoExiste = true;
            break;
        }
    }

    
    if (!produtoExiste) {
        modelo.addRow(new Object[]{
            modeloPecas.getId(),
            modeloPecas.getDescriacao(),
            modeloPecas.getPrecovenda(),
            quantidade,
            quantidade * modeloPecas.getPrecovenda(),
        });
    }
}

    
    private void SalvarOrdemServico(){
       // modeloOrdemServico.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
        modeloOrdemServico.setNomeCliente(cboCliente.getSelectedItem().toString());
        modeloOrdemServico.setNomeMecanico(cboMecanico.getSelectedItem().toString());
        modeloOrdemServico.setMatriculaVeiculo(cboMatricula.getSelectedItem().toString());
        modeloOrdemServico.setMarcaVeiculo(txtVeiculo.getText());
        modeloOrdemServico.setStatus(cboStatus.getSelectedItem().toString());
        modeloOrdemServico.setProblema(txtProblema.getText());
        modeloOrdemServico.setServico(txtServico.getText());
        modeloOrdemServico.setObservacoes(txtObservacoes.getText());
        
        int cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            modeloOrdemServico.setPecas((String)jtProdutos.getValueAt(i,1));
            modeloOrdemServico.setPrecoTotal((double)jtProdutos.getValueAt(i,4) + Double.parseDouble(txtValorPago.getText()));
            
        }
        modeloOrdemServico.setDataFechamento(dataSaida.getDateFormatString().toString());
        
        if(ordemServicoController.SalvarOrdemServicocontroller(modeloOrdemServico)>0){
            JOptionPane.showMessageDialog(this, "SUCESSO");
        }else{
            JOptionPane.showMessageDialog(this, "ERRO","ERRO",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    
    public void dataHora() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date agora = new java.util.Date();
                SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat horas = new SimpleDateFormat("HH:mm:ss");
                String hora = horas.format(agora);
                String dataFormatada = data.format(agora);
                txtData.setText(dataFormatada);
               // txtHora.setText(hora);
            }
        });
        timer.start();
    }

    
}
       
   

package visao;

import Controller.ClienteController;
import Controller.ControllerFluxo;
import Controller.FaturaController;
import Controller.OrdemServicoController;
import Controller.ServicoController;
import Controller.VeiculoController;
import Modelo.ModeloFluxo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PainelCasa extends javax.swing.JPanel {

    ModeloFluxo modeloFluxo = new ModeloFluxo();
    ControllerFluxo controllerFluxo = new ControllerFluxo();
    ArrayList<ModeloFluxo> listaModeloFluxo = new ArrayList<>();

    ClienteController clienteController = new ClienteController();
    VeiculoController veiculosController = new VeiculoController();
    FaturaController faturaController = new FaturaController();
    OrdemServicoController ordemServicontroller = new OrdemServicoController();

    public PainelCasa() {
        initComponents();
        CarregarFluxo();
        TotalClientes();
        TotalVeiculos();
        TotalOrdemServico();
        TotalFaturasPagas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jFluxo = new componentes.Tabela();
        painelBorderr14 = new utilitarios.PainelBorderr1();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        painelBorderr15 = new utilitarios.PainelBorderr1();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cartao1 = new utilitarios.Cartao();
        jLabel10 = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        cartao2 = new utilitarios.Cartao();
        jLabel11 = new javax.swing.JLabel();
        lblVeiculos = new javax.swing.JLabel();
        cartao3 = new utilitarios.Cartao();
        jLabel12 = new javax.swing.JLabel();
        lblServicos = new javax.swing.JLabel();
        cartao4 = new utilitarios.Cartao();
        jLabel13 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        jFluxo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matricula", "Estado", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jFluxo);
        if (jFluxo.getColumnModel().getColumnCount() > 0) {
            jFluxo.getColumnModel().getColumn(0).setResizable(false);
            jFluxo.getColumnModel().getColumn(1).setResizable(false);
            jFluxo.getColumnModel().getColumn(2).setResizable(false);
            jFluxo.getColumnModel().getColumn(3).setResizable(false);
        }

        painelBorderr14.setBackgroundColor(new java.awt.Color(0, 102, 204));

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 102, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

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

        javax.swing.GroupLayout painelBorderr14Layout = new javax.swing.GroupLayout(painelBorderr14);
        painelBorderr14.setLayout(painelBorderr14Layout);
        painelBorderr14Layout.setHorizontalGroup(
            painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBorderr14Layout.createSequentialGroup()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBorderr15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBorderr14Layout.setVerticalGroup(
            painelBorderr14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelBorderr14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBorderr15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cartao1.setBackground(new java.awt.Color(60, 63, 63));
        cartao1.setColor1(new java.awt.Color(0, 102, 204));
        cartao1.setColor2(new java.awt.Color(0, 102, 204));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");

        lblClientes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("0");

        javax.swing.GroupLayout cartao1Layout = new javax.swing.GroupLayout(cartao1);
        cartao1.setLayout(cartao1Layout);
        cartao1Layout.setHorizontalGroup(
            cartao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartao1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClientes)
                .addContainerGap())
        );
        cartao1Layout.setVerticalGroup(
            cartao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblClientes)
                .addContainerGap())
        );

        cartao2.setColor1(new java.awt.Color(0, 123, 255));
        cartao2.setColor2(new java.awt.Color(0, 123, 255));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Veiculos");

        lblVeiculos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        lblVeiculos.setText("0");

        javax.swing.GroupLayout cartao2Layout = new javax.swing.GroupLayout(cartao2);
        cartao2.setLayout(cartao2Layout);
        cartao2Layout.setHorizontalGroup(
            cartao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartao2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVeiculos)
                .addContainerGap())
        );
        cartao2Layout.setVerticalGroup(
            cartao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblVeiculos)
                .addContainerGap())
        );

        cartao3.setColor1(new java.awt.Color(255, 193, 7));
        cartao3.setColor2(new java.awt.Color(255, 193, 7));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Servicos");

        lblServicos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblServicos.setForeground(new java.awt.Color(255, 255, 255));
        lblServicos.setText("0");

        javax.swing.GroupLayout cartao3Layout = new javax.swing.GroupLayout(cartao3);
        cartao3.setLayout(cartao3Layout);
        cartao3Layout.setHorizontalGroup(
            cartao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartao3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblServicos)
                .addContainerGap())
        );
        cartao3Layout.setVerticalGroup(
            cartao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblServicos)
                .addContainerGap())
        );

        cartao4.setColor1(new java.awt.Color(33, 136, 56));
        cartao4.setColor2(new java.awt.Color(33, 136, 56));
        cartao4.setPreferredSize(new java.awt.Dimension(146, 95));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Faturas Pagas");

        lblUsuario3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario3.setText("0");

        javax.swing.GroupLayout cartao4Layout = new javax.swing.GroupLayout(cartao4);
        cartao4.setLayout(cartao4Layout);
        cartao4Layout.setHorizontalGroup(
            cartao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartao4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario3)
                .addContainerGap())
        );
        cartao4Layout.setVerticalGroup(
            cartao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblUsuario3)
                .addContainerGap())
        );

        jCalendar1.setWeekdayForeground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Fluxo de Entradas e Saidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBorderr14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartao4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBorderr14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.removeAll();
        PainelCasa painelCasa = new PainelCasa();
        this.setLayout(new BorderLayout());
        this.add(painelCasa, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utilitarios.Cartao cartao1;
    private utilitarios.Cartao cartao2;
    private utilitarios.Cartao cartao3;
    private utilitarios.Cartao cartao4;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar1;
    private componentes.Tabela jFluxo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblServicos;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblVeiculos;
    private utilitarios.PainelBorderr1 painelBorderr14;
    private utilitarios.PainelBorderr1 painelBorderr15;
    // End of variables declaration//GEN-END:variables

    public void CarregarFluxo() {
        DefaultTableModel modelo = (DefaultTableModel) jFluxo.getModel();
        modelo.setNumRows(0);

        listaModeloFluxo = (ArrayList<ModeloFluxo>) controllerFluxo.listarTodosFluxosController();
        int cont = listaModeloFluxo.size();

        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModeloFluxo.get(i).getId(),
                listaModeloFluxo.get(i).getMatricula(),
                listaModeloFluxo.get(i).getEstado(),
                listaModeloFluxo.get(i).getData()
            });
        }

        jFluxo.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (value != null) {
                    String estado = value.toString();
                    if (estado.equalsIgnoreCase("Entrada")) {
                        c.setForeground(Color.GREEN);
                    } else if (estado.equalsIgnoreCase("Saída")) {
                        c.setForeground(Color.RED);
                    }
                }
                return c;
            }
        });
    }

    private void TotalClientes() {
        int total = clienteController.ContarClienteController();
        lblClientes.setText(String.valueOf(total));

    }

    private void TotalVeiculos() {
        int total = veiculosController.ContarVeiculoController();
        lblVeiculos.setText(String.valueOf(total));
    }

    private void TotalOrdemServico() {
        int total = ordemServicontroller.ContarOrdemServicocontroller();
        lblServicos.setText(String.valueOf(total));
    }

    public void TotalFaturasPagas() {
        int total = faturaController.ContarFaturasController();
        lblUsuario3.setText(String.valueOf(total));
    }

}

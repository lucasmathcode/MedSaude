package View;

import Controller.DAO.I5_ExcluirConsulta_DAO;
import Controller.DAO.I5_ListarConsultas_DAO;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Interface_06_tbl_consultas extends javax.swing.JDialog {

    public Interface_06_tbl_consultas(java.awt.Frame parent, boolean modal) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();
        setTitle("MedSaúde+");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\Imagens\\logoa3.jpg")));
        setResizable(false);//não permitir EXPANSÃO
        setLocationRelativeTo(null);//INICIAR CENTRALIZADO
        ListarConsultas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_consultas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btn_listar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        camp_linhasel = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Med");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("no");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Pacientes cadastrados");

        jLabel4.setText("ATUALIZAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        tbl_consultas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF paciente", "Data", "Horário", "Médico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_consultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_consultas);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Lista de Consultas");

        btn_listar.setBackground(new java.awt.Color(0, 51, 51));
        btn_listar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_listar.setForeground(new java.awt.Color(255, 255, 255));
        btn_listar.setText("LISTAR");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_limpar.setBackground(new java.awt.Color(0, 51, 51));
        btn_limpar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpar.setText("LIMPAR");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        camp_linhasel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        camp_linhasel.setForeground(new java.awt.Color(102, 102, 102));
        camp_linhasel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camp_linhasel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(camp_linhasel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel6)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_listar)
                        .addComponent(btn_limpar))
                    .addComponent(camp_linhasel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        LimparTabela();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        try {
            ListarConsultas();
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Interface_06_tbl_consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_listarActionPerformed

    private void tbl_consultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_consultasMouseClicked
        int LinhaSelecionada = tbl_consultas.getSelectedRow();
        camp_linhasel.setText("" + (LinhaSelecionada + 1));
    }//GEN-LAST:event_tbl_consultasMouseClicked

    private void LimparTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_consultas.getModel();
        modelo.setNumRows(0);
        camp_linhasel.setText("");
    }

    private void ListarConsultas() throws SQLException, ParseException {
        LimparTabela();
        DefaultTableModel modelo = (DefaultTableModel) tbl_consultas.getModel();
        I5_ListarConsultas_DAO ListConsultas = new I5_ListarConsultas_DAO();
        ArrayList<Object> TabConsultas = ListConsultas.ListaConsultas();
        for (int i = 0; i < TabConsultas.size(); i++) {
            modelo.addRow((Object[])TabConsultas.get(i));
        }
    }
    
    private String pegarcpf_tbl(){
         DefaultTableModel modelo = (DefaultTableModel) tbl_consultas.getModel();
         int Linha = Integer.parseInt(camp_linhasel.getText())-1;
         return ((String )modelo.getValueAt(Linha, 1));
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JLabel camp_linhasel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_consultas;
    // End of variables declaration//GEN-END:variables
}

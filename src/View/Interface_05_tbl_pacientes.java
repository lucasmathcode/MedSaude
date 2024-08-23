package View;

import Controller.DAO.I5_ExcluirConsulta_DAO;
import Controller.DAO.I5_ExcluirPaciente_DAO;
import Controller.DAO.I5_ListarPaciente_DAO;
import View.Interface_05_tbl_consultas;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interface_05_tbl_pacientes extends javax.swing.JDialog {

    public Interface_05_tbl_pacientes(java.awt.Frame parent, boolean modal) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();
        setTitle("MedSaúde+");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\Imagens\\logoa3.jpg")));
        setResizable(false);//não permitir EXPANSÃO
        setLocationRelativeTo(null);//INICIAR CENTRALIZADO
        ListarPacientes();
        
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
        tbl_pacientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btn_listar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
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

        tbl_pacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de nascimento", "Rua", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pacientes);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Lista de Pacientes");

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

        btn_edit.setBackground(new java.awt.Color(0, 51, 51));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("EDITAR");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(102, 0, 0));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("EXCLUIR");
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        camp_linhasel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        camp_linhasel.setForeground(new java.awt.Color(153, 153, 153));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(camp_linhasel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btn_excluir)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel6)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(camp_linhasel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_listar)
                        .addComponent(btn_limpar)
                        .addComponent(btn_edit)
                        .addComponent(btn_excluir)))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        try {
            ListarPacientes();
        } catch (SQLException ex) {
            Logger.getLogger(Interface_05_tbl_pacientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Interface_05_tbl_pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        LimparTabela();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        String PegarCPF = pegarcpf_tbl();
        try {
            Interface_EditarPessoa dialog = new Interface_EditarPessoa(new javax.swing.JFrame(), true, PegarCPF);
            dialog.setVisible(true);
            ListarPacientes();
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Interface_05_tbl_consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        String removercpf = pegarcpf_tbl();
        I5_ExcluirPaciente_DAO removerPaciente = new I5_ExcluirPaciente_DAO();
        try {
            removerPaciente.ExcluirConsult(removercpf);
            removerPaciente.ExcluirPaciente(removercpf);
            JOptionPane.showMessageDialog(null, ("Pessoa retirada do quadro de pacientes com sucesso!"), "ATENÇÃO!", JOptionPane.INFORMATION_MESSAGE);
            ListarPacientes();
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Interface_05_tbl_consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_excluirMouseClicked

    private void tbl_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pacientesMouseClicked
        int LinhaSelecionada = tbl_pacientes.getSelectedRow();
        camp_linhasel.setText("" + (LinhaSelecionada + 1));
    }//GEN-LAST:event_tbl_pacientesMouseClicked

    private void LimparTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbl_pacientes.getModel();
        modelo.setNumRows(0);
        camp_linhasel.setText("");
    }
    
    private void ListarPacientes() throws SQLException, ParseException{
        LimparTabela();
        DefaultTableModel modelo = (DefaultTableModel) tbl_pacientes.getModel();
        I5_ListarPaciente_DAO ListPaciente = new I5_ListarPaciente_DAO();
        ArrayList<Object> TabConsultas = ListPaciente.ListaPaciente();
        for (int i = 0; i < TabConsultas.size(); i++) {
            modelo.addRow((Object[])TabConsultas.get(i));
        }
    }
        
        private String pegarcpf_tbl(){
         DefaultTableModel modelo = (DefaultTableModel) tbl_pacientes.getModel();
         int Linha = Integer.parseInt(camp_linhasel.getText())-1;
         return ((String )modelo.getValueAt(Linha, 1));
    } 
        
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_excluir;
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
    private javax.swing.JTable tbl_pacientes;
    // End of variables declaration//GEN-END:variables
}

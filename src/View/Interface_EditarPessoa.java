package View;

import Controller.ValidarCPF;
import Model.Pessoa;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JOptionPane;
import Controller.DAO.I3_CadPaciente_DAO;
import Controller.DAO.I5_EditPaciente_DAO;
import Model.Consulta;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interface_EditarPessoa extends javax.swing.JDialog {

    String CPF_A;

    public Interface_EditarPessoa(java.awt.Frame parent, boolean modal, String CPF) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();

        setTitle("MedSaúde+");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\Imagens\\logoa3.jpg")));
        setResizable(false);//não permitir EXPANSÃO
        setLocationRelativeTo(null);//INICIAR CENTRALIZADO
        this.CPF_A = CPF;

        I5_EditPaciente_DAO EditarPaciente = new I5_EditPaciente_DAO();
        Object[] DadosPaciente = EditarPaciente.Pegar_uma_Pessoa(CPF_A);
        Camp_Nome.setText("" + DadosPaciente[0]);
        Camp_Dia.setText("" + DadosPaciente[1]);
        Camp_Mes.setText("" + DadosPaciente[2]);
        Camp_Ano.setText("" + DadosPaciente[3]);
        Camp_CPF.setText(CPF_A);
        camp_tel.setText("" + DadosPaciente[4]);
        camp_rua.setText("" + DadosPaciente[5]);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Camp_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Camp_Dia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Camp_Mes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Camp_Ano = new javax.swing.JTextField();
        Camp_CPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        camp_tel = new javax.swing.JTextField();
        camp_rua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        bot_continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Alteração de dados");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logoa3.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nome");

        Camp_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_NomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Data de Nascimento");

        Camp_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_DiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("/");

        Camp_Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_MesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("/");

        Camp_Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_AnoActionPerformed(evt);
            }
        });

        Camp_CPF.setToolTipText("");
        Camp_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_CPFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CPF");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Telefone");

        camp_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_telActionPerformed(evt);
            }
        });

        camp_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_ruaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Rua");

        bot_continuar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bot_continuar.setForeground(new java.awt.Color(0, 102, 102));
        bot_continuar.setText("ALTERAR");
        bot_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bot_continuar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(Camp_Nome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(camp_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addGap(32, 32, 32))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Camp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel4)
                                            .addGap(6, 6, 6)
                                            .addComponent(Camp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Camp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3))
                                    .addGap(107, 107, 107)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11)
                                .addComponent(camp_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Camp_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(68, 68, 68)
                            .addComponent(jLabel6))
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator3)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Camp_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Camp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Camp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Camp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(Camp_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camp_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camp_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bot_continuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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

    private void Camp_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Camp_NomeActionPerformed

    private void Camp_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Camp_DiaActionPerformed

    private void Camp_MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Camp_MesActionPerformed

    private void Camp_AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_AnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Camp_AnoActionPerformed

    private void Camp_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_CPFActionPerformed

    }//GEN-LAST:event_Camp_CPFActionPerformed

    private void camp_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_telActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_camp_telActionPerformed

    private void camp_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_ruaActionPerformed

    private void bot_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_continuarActionPerformed

         try {
            String Nome = Camp_Nome.getText();
            String CPF_Novo = Camp_CPF.getText();
            String Dia = Camp_Dia.getText();
            String Mes = Camp_Mes.getText();
            String Ano = Camp_Ano.getText();
            String tel = camp_tel.getText();
            String rua = camp_rua.getText();
            String Data_Aniversario = Dia + "/" + Mes + "/" + Ano;

            Pessoa P = new Pessoa(Nome, CPF_Novo, Data_Aniversario, tel, rua);
            I5_EditPaciente_DAO EditarPaciente = new I5_EditPaciente_DAO();

            try {
                // Primeiro, altere o CPF se ele foi alterado
                if (!CPF_A.equals(CPF_Novo)) {
                    if (EditarPaciente.AlterarCpf(CPF_A, CPF_Novo)) {
                        // Atualize o CPF_A para o novo CPF
                        CPF_A = CPF_Novo;
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao alterar o CPF!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                // Em seguida, altere os demais dados do paciente
                if (EditarPaciente.AlterarPaciente(P)) {
                    JOptionPane.showMessageDialog(null, "Paciente Alterado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Alteração Falhou!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interface_EditarPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParseException ex) {
            Logger.getLogger(Interface_EditarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_bot_continuarActionPerformed

    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface_EditarPessoa dialog = new Interface_EditarPessoa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Camp_Ano;
    private javax.swing.JTextField Camp_CPF;
    private javax.swing.JTextField Camp_Dia;
    private javax.swing.JTextField Camp_Mes;
    private javax.swing.JTextField Camp_Nome;
    private javax.swing.JButton bot_continuar;
    private javax.swing.JTextField camp_rua;
    private javax.swing.JTextField camp_tel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

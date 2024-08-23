package View;

import Controller.DAO.I1_NewLogin_DAO;
import Controller.DAO.I1_Login_DAO;
import View.Interface_02;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Login;

public class Interface_01 extends javax.swing.JFrame {

    public Interface_01() {
        initComponents();

        setTitle("MedSaúde+");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\Imagens\\logoa3.jpg")));
        setResizable(false);//não permitir EXPANSÃO
        setLocationRelativeTo(null);//INICIAR CENTRALIZADO

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Camp_User = new javax.swing.JTextField();
        Camp_Senha = new javax.swing.JPasswordField();
        Bot_Logar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botcadastrar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(jTree1);

        jScrollPane2.setViewportView(jEditorPane1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Usuário");

        Camp_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Camp_UserActionPerformed(evt);
            }
        });

        Bot_Logar.setBackground(new java.awt.Color(0, 51, 51));
        Bot_Logar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bot_Logar.setForeground(new java.awt.Color(255, 255, 255));
        Bot_Logar.setText("LOGAR");
        Bot_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_LogarActionPerformed(evt);
            }
        });
        Bot_Logar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Bot_LogarKeyPressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Login ");

        jSeparator1.setForeground(new java.awt.Color(131, 175, 175));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bot_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jSeparator1)
                                .addComponent(Camp_User, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(Camp_Senha))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Camp_User, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Camp_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bot_Logar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 248));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 119, 119));
        jLabel2.setText("Ainda não tem conta?");

        botcadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botcadastrar.setForeground(new java.awt.Color(0, 51, 51));
        botcadastrar.setText("Cadastre-se");
        botcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botcadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botcadastrar)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(botcadastrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Camp_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Camp_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Camp_UserActionPerformed

    private void Bot_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_LogarActionPerformed
        String usuario = Camp_User.getText();  // Pega o texto digitado no campo de usuário.
        String senha = Camp_Senha.getText();  // Pega o texto digitado no campo de senha.

// Se usuário e senha estiverem vazios...
        if (usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar o usuário e a senha.", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
            // Mostra uma mensagem de aviso se o usuário ou a senha estiverem vazios.
        } else {
            try {
                Login G = new Login(usuario, senha);  // Cria um objeto Login com o usuário e a senha fornecidos.
                I1_Login_DAO Login = new I1_Login_DAO();  // Cria um objeto da classe I1_Login_DAO para verificar o login.

                if (Login.logincheck(G)) {
                    // Se o método logincheck retornar true (login válido):
                    Interface_02 dialog = new Interface_02(new javax.swing.JFrame(), true);  // Cria um novo diálogo da Interface_02.
                    dialog.setVisible(true);  // Torna o diálogo visível.
                } else {
                    // Se o método logincheck retornar false (login inválido):
                    JOptionPane.showMessageDialog(null, "Usuário não cadastrado no sistema. Aperte no botão CADASTRE-SE\ne leia as instruções.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                    // Mostra uma mensagem de erro indicando que o usuário não está cadastrado.
                }

                Camp_User.setText("");  // Limpa o campo de usuário.
                Camp_Senha.setText("");  // Limpa o campo de senha.
            } catch (SQLException ex) {
                Logger.getLogger(Interface_01.class.getName()).log(Level.SEVERE, null, ex);  // Registra o erro no log em caso de exceção SQL.
            }
        }
    }//GEN-LAST:event_Bot_LogarActionPerformed

    private void Bot_LogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bot_LogarKeyPressed
        String usuario = Camp_User.getText();
        String senha = Camp_Senha.getText();
        //Se usuário e senha estiverem vazios...
        if (usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar o usuário e a senha.", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Login G = new Login(usuario, senha);
                I1_Login_DAO Login = new I1_Login_DAO();
                if (Login.logincheck(G)) {
                    Interface_02 dialog = new Interface_02(new javax.swing.JFrame(), true);
                    dialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não cadastrado no sistema. Aperte no botão CADASTRE-SE\ne leia as instruções.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

                }
                Camp_User.setText("");
                Camp_Senha.setText("");
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Interface_01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Bot_LogarKeyPressed

    private void botcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botcadastrarActionPerformed
        try {
            Cadastrar();
        } catch (SQLException ex) {
            Logger.getLogger(Interface_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botcadastrarActionPerformed

    private void Cadastrar() throws SQLException {
        String usuario = Camp_User.getText();  // Pega o texto digitado no campo de usuário.
        String senha = Camp_Senha.getText();  // Pega o texto digitado no campo de senha.

        if (usuario.isEmpty() || senha.isEmpty()) {
            // Se usuário ou senha estiverem vazios, mostra uma mensagem com instruções para se cadastrar.
            JOptionPane.showMessageDialog(null, "Se você não é cadastrado em nosso sistema, não se preocupe.\nPara se cadastrar é só seguir a sequência de passos a seguir:\n1- Defina um usuário;\n2- Defina uma senha;\n3- Clique no botão CADASTRE-SE.", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Se os campos não estiverem vazios, realiza o cadastro do usuário.
            I1_NewLogin_DAO cadastro = new I1_NewLogin_DAO();  // Cria um objeto da classe I1_NewLogin_DAO.
            cadastro.addadm(usuario, senha);  // Chama o método para adicionar o novo usuário e senha no banco de dados.
            JOptionPane.showMessageDialog(null, "Usuário e senha cadastrados\ncom sucesso!", "ATENÇÃO!", JOptionPane.INFORMATION_MESSAGE);
            // Mostra uma mensagem informando que o cadastro foi realizado com sucesso.
        }

        Camp_User.setText("");  // Limpa o campo de usuário.
        Camp_Senha.setText("");  // Limpa o campo de senha.

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_Logar;
    private javax.swing.JPasswordField Camp_Senha;
    private javax.swing.JTextField Camp_User;
    private javax.swing.JButton botcadastrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}

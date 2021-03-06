/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhz.sistemas.view.usuarios;

import br.com.rhz.sistemas.controller.TelaUsuarioCadastrarController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class TelaUsuarioCadastrar extends javax.swing.JInternalFrame {

    private final TelaUsuarioCadastrarController controller;
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaUsuarioCadastrar() {
        initComponents();
        controller = new TelaUsuarioCadastrarController(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jPasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuarioNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuário - Cadastrar");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonConfirmar.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 100, 40));

        jPasswordFieldConfirmaSenha.setMaximumSize(new java.awt.Dimension(180, 25));
        jPasswordFieldConfirmaSenha.setMinimumSize(new java.awt.Dimension(180, 25));
        jPasswordFieldConfirmaSenha.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(jPasswordFieldConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar Senha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jPasswordFieldSenha.setMaximumSize(new java.awt.Dimension(180, 25));
        jPasswordFieldSenha.setMinimumSize(new java.awt.Dimension(180, 25));
        jPasswordFieldSenha.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        jTextFieldUsuario.setMaximumSize(new java.awt.Dimension(180, 25));
        jTextFieldUsuario.setMinimumSize(new java.awt.Dimension(180, 25));
        jTextFieldUsuario.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 50, -1, -1));

        jTextFieldUsuarioNome.setMaximumSize(new java.awt.Dimension(180, 25));
        jTextFieldUsuarioNome.setMinimumSize(new java.awt.Dimension(180, 25));
        jTextFieldUsuarioNome.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(jTextFieldUsuarioNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 340, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        setBounds(0, 0, 522, 196);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        controller.cadastrarUsuario();
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public JPasswordField getjPasswordFieldConfirmaSenha() {
        return jPasswordFieldConfirmaSenha;
    }

    public void setjPasswordFieldConfirmaSenha(JPasswordField jPasswordFieldConfirmaSenha) {
        this.jPasswordFieldConfirmaSenha = jPasswordFieldConfirmaSenha;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }

    public JTextField getjTextFieldUsuarioNome() {
        return jTextFieldUsuarioNome;
    }

    public void setjTextFieldUsuarioNome(JTextField jTextFieldUsuarioNome) {
        this.jTextFieldUsuarioNome = jTextFieldUsuarioNome;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuarioNome;
    // End of variables declaration//GEN-END:variables
}

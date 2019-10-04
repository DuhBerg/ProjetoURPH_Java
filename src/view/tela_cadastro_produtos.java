/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.controlaProduto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class tela_cadastro_produtos extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro_produtos
     */
    private final controlaProduto ctrlProd;
    public tela_cadastro_produtos() {
        ctrlProd = new controlaProduto();
        initComponents();
    }
    
    Connection con = null; 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();
        txt_tamanho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_qnt = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("URPH STYLE");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoJava.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(661, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 120));

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Produtos");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        txt_nome.setBackground(new java.awt.Color(34, 34, 34));
        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
        jPanel3.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        txt_descricao.setBackground(new java.awt.Color(34, 34, 34));
        txt_descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descricao.setForeground(new java.awt.Color(255, 255, 255));
        txt_descricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
        jPanel3.add(txt_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, 30));

        txt_tamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G", "GG" }));
        txt_tamanho.setBorder(null);
        jPanel3.add(txt_tamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tamanho:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        txt_qnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_qnt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(txt_qnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 59, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        txt_valor.setBackground(new java.awt.Color(34, 34, 34));
        txt_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_valor.setForeground(new java.awt.Color(255, 255, 255));
        txt_valor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
        jPanel3.add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 64, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        txt_codigo.setBackground(new java.awt.Color(34, 34, 34));
        txt_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(255, 255, 255));
        txt_codigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
        jPanel3.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 90, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 90, 40));

        btn_alterar.setBackground(new java.awt.Color(255, 51, 0));
        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 90, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1110, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       boolean inseriu = false;
        try {
           try {
               inseriu = ctrlProd.insereProduto
                        (
                                (txt_nome.getText()),
                                (txt_descricao.getText()),
                                (Integer.parseInt(txt_codigo.getText())),
                                (txt_tamanho.getSelectedItem().toString()),
                                (Double.parseDouble(txt_valor.getText())),
                                (Integer.parseInt(txt_qnt.getValue().toString()))
                        );
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(tela_cadastro_produtos.class.getName()).log(Level.SEVERE, null, ex);
           }
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Erro:"+ex );
        }

       
        if(inseriu)
        {
            JOptionPane.showMessageDialog(null,"Inserido com sucesso!");
            txt_nome.setText("");
            txt_descricao.setText("");
            txt_codigo.setText("");
            txt_tamanho.setSelectedItem(0);
            txt_valor.setText("");
            txt_qnt.setValue(0);
            
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Erro, não foi possível inserir!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tela_excluir_produto excluir = new tela_excluir_produto();
        excluir.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
              boolean inseriu = false;
        try {
            inseriu = ctrlProd.alteraProduto
                (
                        (txt_nome.getText()),
                        (txt_descricao.getText()),
                        (Integer.parseInt(txt_codigo.getText())),
                        (txt_tamanho.getSelectedItem().toString()),
                        (Double.parseDouble(txt_valor.getText())),
                        (Integer.parseInt(txt_qnt.getValue().toString()))
                );
        } catch (SQLException ex) {
            Logger.getLogger(tela_cadastro_produtos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tela_cadastro_produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(inseriu)
        {
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Erro, não foi possível alterar!");
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tela_cadastro_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new tela_cadastro_produtos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JSpinner txt_qnt;
    private javax.swing.JComboBox<String> txt_tamanho;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
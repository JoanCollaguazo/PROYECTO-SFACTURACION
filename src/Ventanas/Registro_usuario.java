/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import METODOS.Metodos_sql;
import javax.swing.JOptionPane;

/**
 *
 * @author OxOrboy!
 */
public class Registro_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Registro_usuario
     */
    public Registro_usuario() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR LA VENTANA
    }
    Metodos_sql metodos = new Metodos_sql(); //INSTANCIAR LA CLASE DE METODOS 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(461, 518));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(461, 518));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, 120));

        Correo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Correo.setForeground(new java.awt.Color(0, 0, 0));
        Correo.setText("Correo electronico:");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        Contraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("Contraseña:");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REGISTRO DE USUARIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombres:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 240, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 240, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 210, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 240, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("VOLVER");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallhaven-nelr2k_642x600.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Interfaz a = new Interfaz();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //SE PONE EL NOMBRE DE LOS RECUADROS DE LA VENTANA PARA OBTENER LO SOLICITADO
        int i = metodos.guardar(txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), txtContraseña.getText());
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "SUS DATOS FUERON GUARDADOS CORRECTAMENTE");
        } else {
            JOptionPane.showMessageDialog(this, "NO SE PUEDE GUARDAR SUS DATOS CORRECTAMENTE");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Correo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
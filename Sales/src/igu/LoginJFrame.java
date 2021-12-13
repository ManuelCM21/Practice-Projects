package igu;

import entidades.Persona;
import implementacion.ImplPersona;
import javax.swing.JFrame;

public class LoginJFrame extends javax.swing.JFrame {

    public LoginJFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxf_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpsf_password = new javax.swing.JPasswordField();
        Jbt_Login = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 41));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 121, -1, -1));

        jtxf_usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(jtxf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 118, 170, 35));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 176, -1, -1));

        jpsf_password.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(jpsf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 173, 170, 34));

        Jbt_Login.setBackground(new java.awt.Color(0, 51, 204));
        Jbt_Login.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Jbt_Login.setForeground(new java.awt.Color(255, 255, 255));
        Jbt_Login.setText("Login");
        Jbt_Login.setBorder(null);
        Jbt_Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validacionLogueo(evt);
            }
        });
        jPanel1.add(Jbt_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 231, 104, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validacionLogueo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validacionLogueo

        ImplPersona ip = new ImplPersona();
        Persona p = new Persona();

        //System.out.println("estoy ´probandoooo"+jtxf_usuario.getText()+"-"+jpsf_password.getText());
        p = ip.LoginReportePersonaUnico(jtxf_usuario.getText(), jpsf_password.getText());

        System.out.println("estoy ´probandoooo: " + p.getUsuario() + "-" + p.getPassword());

        if (p.isAcceso()) {

            System.out.println("ingreso al sistema");

            MenuFrame cmf = new MenuFrame();
            cmf.show();

            LoginJFrame lf = new LoginJFrame();
            lf.show(false);
            dispose();
        } else {
            System.out.println("no ingreso al sistema");
        }
    }//GEN-LAST:event_validacionLogueo

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbt_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpsf_password;
    private javax.swing.JTextField jtxf_usuario;
    // End of variables declaration//GEN-END:variables
}

<<<<<<< HEAD
<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Tkj extends javax.swing.JFrame {

    /**
     * Creates new form Tkj
     */
    public Tkj() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHardware = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblHardware.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHardware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHardwareMouseClicked(evt);
            }
        });
        getContentPane().add(lblHardware);
        lblHardware.setBounds(370, 80, 190, 240);

        lblNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNetworkMouseClicked(evt);
            }
        });
        getContentPane().add(lblNetwork);
        lblNetwork.setBounds(82, 78, 180, 240);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jurusanimage/beck.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(5, 5, 30, 30);

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(617, 9, 25, 23);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tkjimage/background.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        new Confirm().show();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        new Jurusan().show();
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        try {
            a.network("Materi/Network.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Multimedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        dispose();
    }//GEN-LAST:event_lblNetworkMouseClicked

    private void lblHardwareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHardwareMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        try {
            a.hardware("Materi/Hardware.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Multimedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        dispose();
    }//GEN-LAST:event_lblHardwareMouseClicked

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
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tkj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHardware;
    private javax.swing.JLabel lblNetwork;
    // End of variables declaration//GEN-END:variables
}
=======
=======
>>>>>>> 81b184bd4f68a617edd94e3454d22c4e830157b2
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

/**
 *
 * @author Lenovo
 */
public class Tkj extends javax.swing.JFrame {

    /**
     * Creates new form Tkj
     */
    public Tkj() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHardware = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblHardware.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHardware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHardwareMouseClicked(evt);
            }
        });
        getContentPane().add(lblHardware);
        lblHardware.setBounds(370, 80, 190, 240);

        lblNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNetworkMouseClicked(evt);
            }
        });
        getContentPane().add(lblNetwork);
        lblNetwork.setBounds(82, 78, 180, 240);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jurusanimage/beck.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(5, 5, 30, 30);

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(617, 9, 25, 23);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tkjimage/background.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        new Confirm().show();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        new Jurusan().show();
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNetworkMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        a.network();
        a.show();
        dispose();
    }//GEN-LAST:event_lblNetworkMouseClicked

    private void lblHardwareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHardwareMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        a.hardware();
        a.show();
        dispose();
    }//GEN-LAST:event_lblHardwareMouseClicked

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
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tkj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tkj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHardware;
    private javax.swing.JLabel lblNetwork;
    // End of variables declaration//GEN-END:variables
}
<<<<<<< HEAD
>>>>>>> 81b184bd4f68a617edd94e3454d22c4e830157b2
=======
>>>>>>> 81b184bd4f68a617edd94e3454d22c4e830157b2

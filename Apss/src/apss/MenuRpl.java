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
 * @author WhatzitTooya
 */
public class MenuRpl extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuRpl
     */
    public MenuRpl() {
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

        lblClose = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDesktop = new javax.swing.JButton();
        btnWeb = new javax.swing.JButton();
        btnAndro = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(617, 9, 25, 23);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jurusanimage/beck.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(5, 5, 30, 30);

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 570, 40);

        btnDesktop.setBorder(null);
        btnDesktop.setContentAreaFilled(false);
        btnDesktop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesktopMouseClicked(evt);
            }
        });
        getContentPane().add(btnDesktop);
        btnDesktop.setBounds(50, 100, 150, 170);

        btnWeb.setBorder(null);
        btnWeb.setContentAreaFilled(false);
        btnWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWebMouseClicked(evt);
            }
        });
        getContentPane().add(btnWeb);
        btnWeb.setBounds(250, 100, 150, 170);

        btnAndro.setBorder(null);
        btnAndro.setContentAreaFilled(false);
        btnAndro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAndro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAndroMouseClicked(evt);
            }
        });
        getContentPane().add(btnAndro);
        btnAndro.setBounds(450, 100, 150, 170);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rplImage/Background_RPL.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int dragxmouse;
    int dragymouse;
    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        new Confirm().show();
        
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        new Jurusan().show();
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - dragxmouse, y - dragymouse);
//        System.out.println(x + "," +y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        dragxmouse = evt.getX();
        dragymouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void btnDesktopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesktopMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        try {
            a.desktop("Materi/Phyton.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Multimedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        dispose();
    }//GEN-LAST:event_btnDesktopMouseClicked

    private void btnWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWebMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        try {
            a.web("Materi/Web.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Multimedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        dispose();
    }//GEN-LAST:event_btnWebMouseClicked

    private void btnAndroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAndroMouseClicked
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        try {
            a.android("Materi/Android.pdf");
        } catch (IOException ex) {
            Logger.getLogger(Multimedia.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        dispose();
    }//GEN-LAST:event_btnAndroMouseClicked

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
            java.util.logging.Logger.getLogger(MenuRpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRpl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndro;
    private javax.swing.JButton btnDesktop;
    private javax.swing.JButton btnWeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

/**
 *
 * @author Asus
 */
public class Jurusan extends javax.swing.JFrame {

    /**
     * Creates new form Jurusan
     */
    public Jurusan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int dragxmouse;
    int dragymouse;
    Multimedia b = new Multimedia();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMm = new javax.swing.JLabel();
        lblRpl = new javax.swing.JLabel();
        lblTkj = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel1.setBounds(0, 0, 610, 40);

        lblMm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMmMouseClicked(evt);
            }
        });
        getContentPane().add(lblMm);
        lblMm.setBounds(461, 97, 122, 154);

        lblRpl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRplMouseClicked(evt);
            }
        });
        getContentPane().add(lblRpl);
        lblRpl.setBounds(64, 97, 122, 154);

        lblTkj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTkj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTkjMouseClicked(evt);
            }
        });
        getContentPane().add(lblTkj);
        lblTkj.setBounds(260, 97, 122, 154);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jurusanimage/bg_jurusan.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        new Confirm().show();
        
    }//GEN-LAST:event_lblCloseMouseClicked

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

    private void lblRplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRplMouseClicked
        // TODO add your handling code here:
        new MenuRpl().show();
        dispose();
    }//GEN-LAST:event_lblRplMouseClicked

    private void lblMmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMmMouseClicked
        new Multimedia().show();        
        dispose();
    }//GEN-LAST:event_lblMmMouseClicked

    private void lblTkjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTkjMouseClicked
        new Tkj().show();
        dispose();
    }//GEN-LAST:event_lblTkjMouseClicked

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
            java.util.logging.Logger.getLogger(Jurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jurusan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMm;
    private javax.swing.JLabel lblRpl;
    private javax.swing.JLabel lblTkj;
    // End of variables declaration//GEN-END:variables
}

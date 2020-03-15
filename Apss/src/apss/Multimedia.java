/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

/**
 *
 * @author pujarchmnsyh
 */
public class Multimedia extends javax.swing.JFrame {

    /**
     * Creates new form Multimedia
     */
    public Multimedia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int dragxmouse;
    int dragymouse;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        cinema = new javax.swing.JLabel();
        duaD = new javax.swing.JLabel();
        tigaD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(620, 10, 20, 20);

        cinema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cinemaMouseClicked(evt);
            }
        });
        getContentPane().add(cinema);
        cinema.setBounds(50, 110, 160, 190);

        duaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        duaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duaDMouseClicked(evt);
            }
        });
        getContentPane().add(duaD);
        duaD.setBounds(250, 110, 140, 190);

        tigaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tigaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tigaDMouseClicked(evt);
            }
        });
        getContentPane().add(tigaD);
        tigaD.setBounds(440, 110, 160, 190);

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

        mm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmimage/mm.png"))); // NOI18N
        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
        });
        getContentPane().add(mm);
        mm.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void cinemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cinemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cinemaMouseClicked

    private void duaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duaDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_duaDMouseClicked

    private void tigaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tigaDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tigaDMouseClicked

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mmMouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - dragxmouse, y - dragymouse);
        System.out.println(x + "," +y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        dragxmouse = evt.getX();
        dragymouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(Multimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multimedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cinema;
    private javax.swing.JLabel close;
    private javax.swing.JLabel duaD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mm;
    private javax.swing.JLabel tigaD;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    Connection koneksi;
    
    public HalamanUtama() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "apps");
        desktop();
    }

    public void desktop(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM table_data where jurusan = 'RPL'";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.first())
            {
                this.title.setText(rs.getString("jurusan"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    
    private void descMateri(java.awt.event.MouseEvent evt) {                                       
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMateri = new javax.swing.JLabel();
        lblBar = new javax.swing.JLabel();
        btnChat = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Deskripsi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descMateri = new javax.swing.JTextArea();
        inpChat = new javax.swing.JTextField();
        formChat = new javax.swing.JInternalFrame();
        bgChat = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblMateri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/Materi.png"))); // NOI18N
        getContentPane().add(lblMateri);
        lblMateri.setBounds(760, 70, 570, 430);

        lblBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/NavMateri.png"))); // NOI18N
        getContentPane().add(lblBar);
        lblBar.setBounds(760, 30, 570, 50);

        btnChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/enter chat.png"))); // NOI18N
        getContentPane().add(btnChat);
        btnChat.setBounds(500, 680, 60, 60);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/lblTitle_1.png"))); // NOI18N
        title.setLabelFor(title);
        title.setText("hai");
        getContentPane().add(title);
        title.setBounds(30, 34, 540, 90);

        Deskripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/lblDeskripsi_1.png"))); // NOI18N
        getContentPane().add(Deskripsi);
        Deskripsi.setBounds(760, 510, 280, 50);

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        descMateri.setEditable(false);
        descMateri.setColumns(20);
        descMateri.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        descMateri.setForeground(new java.awt.Color(102, 102, 102));
        descMateri.setRows(5);
        descMateri.setText("Pertemuan 1 - Introduction\nMateri Pengenalan terhadap Pemrograman Dekstop.");
        descMateri.setBorder(null);
        jScrollPane1.setViewportView(descMateri);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(760, 570, 590, 160);

        inpChat.setBackground(new java.awt.Color(188, 188, 188));
        inpChat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inpChat.setBorder(null);
        inpChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpChatActionPerformed(evt);
            }
        });
        getContentPane().add(inpChat);
        inpChat.setBounds(50, 690, 420, 40);

        formChat.setVisible(true);
        getContentPane().add(formChat);
        formChat.setBounds(30, 150, 550, 350);

        bgChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/input chat.png"))); // NOI18N
        getContentPane().add(bgChat);
        bgChat.setBounds(30, 690, 470, 40);

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/bground.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inpChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpChatActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deskripsi;
    private javax.swing.JLabel bgChat;
    private javax.swing.JLabel btnChat;
    private javax.swing.JTextArea descMateri;
    private javax.swing.JInternalFrame formChat;
    private javax.swing.JTextField inpChat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBar;
    private javax.swing.JLabel lblMateri;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

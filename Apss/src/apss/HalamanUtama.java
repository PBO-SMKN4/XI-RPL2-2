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
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setVisible(true);
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "apss");
        desktop();
        web();
        android();
        network();
        hardware();
        cinema();
        duaD();
        tigaD();
    }

    public void desktop(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_rpl.judul_materi FROM table_data, data_rpl WHERE table_data.jurusan = data_rpl.jurusan AND id_rpl = 1";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void web(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_rpl.judul_materi FROM table_data, data_rpl WHERE table_data.jurusan = data_rpl.jurusan AND id_rpl = 2";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void android(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_rpl.judul_materi FROM table_data, data_rpl WHERE table_data.jurusan = data_rpl.jurusan AND id_rpl = 3";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void network(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_tkj.judul_materi FROM table_data, data_tkj WHERE table_data.jurusan = data_tkj.jurusan AND id_tkj = 1";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void hardware(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_tkj.judul_materi FROM table_data, data_tkj WHERE table_data.jurusan = data_tkj.jurusan AND id_tkj = 2";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cinema(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_mm.judul_materi FROM table_data, data_mm WHERE table_data.jurusan = data_mm.jurusan AND id_mm = 1";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void duaD(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_mm.judul_materi FROM table_data, data_mm WHERE table_data.jurusan = data_mm.jurusan AND id_mm = 2";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void tigaD(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_mm.judul_materi FROM table_data, data_mm WHERE table_data.jurusan = data_mm.jurusan AND id_mm = 3";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                namaMateri.setText(rs.getString("judul_materi"));
                deskripsi.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    
    //private void descMateri(java.awt.event.MouseEvent evt) {                                       
        
    //}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMateri = new javax.swing.JLabel();
        lblBar = new javax.swing.JLabel();
        btnChat = new javax.swing.JLabel();
        garis = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Deskripsi = new javax.swing.JLabel();
        namaMateri = new javax.swing.JLabel();
        simbol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JLabel();
        inpChat = new javax.swing.JTextField();
        formChat = new javax.swing.JInternalFrame();
        bgChat = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblMateri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/Materi.png"))); // NOI18N
        lblMateri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMateriMouseClicked(evt);
            }
        });
        getContentPane().add(lblMateri);
        lblMateri.setBounds(760, 70, 570, 430);

        lblBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/NavMateri.png"))); // NOI18N
        getContentPane().add(lblBar);
        lblBar.setBounds(760, 30, 570, 50);

        btnChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/enter chat.png"))); // NOI18N
        getContentPane().add(btnChat);
        btnChat.setBounds(500, 680, 60, 60);

        garis.setLabelFor(garis);
        getContentPane().add(garis);
        garis.setBounds(40, 90, 525, 12);

        title.setFont(new java.awt.Font("Agency FB", 0, 50)); // NOI18N
        title.setForeground(new java.awt.Color(14, 179, 233));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("TITLE");
        getContentPane().add(title);
        title.setBounds(190, 30, 80, 60);

        Deskripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/lblDeskripsi_1.png"))); // NOI18N
        getContentPane().add(Deskripsi);
        Deskripsi.setBounds(760, 510, 280, 50);

        namaMateri.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        namaMateri.setForeground(new java.awt.Color(14, 179, 233));
        namaMateri.setText("Materi");
        getContentPane().add(namaMateri);
        namaMateri.setBounds(270, 50, 270, 30);

        simbol.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        simbol.setForeground(new java.awt.Color(14, 179, 233));
        simbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simbol.setText("SIMBOL");
        getContentPane().add(simbol);
        simbol.setBounds(60, 30, 110, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        deskripsi.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        deskripsi.setForeground(new java.awt.Color(102, 102, 102));
        deskripsi.setText("Ini adalah modul pembelajaran");
        deskripsi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(deskripsi);

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

    private void lblMateriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMateriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMateriMouseClicked

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
            @Override
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deskripsi;
    private javax.swing.JLabel bgChat;
    private javax.swing.JLabel btnChat;
    private javax.swing.JLabel deskripsi;
    private javax.swing.JInternalFrame formChat;
    private javax.swing.JLabel garis;
    private javax.swing.JTextField inpChat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBar;
    private javax.swing.JLabel lblMateri;
    private javax.swing.JLabel namaMateri;
    private javax.swing.JLabel simbol;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

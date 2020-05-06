/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.SQLException;
import javafx.animation.Animation;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class HalamanUtama extends javax.swing.JFrame {
    static ServerSocket ss; 
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    /**
     * Creates new form HalamanUtama
     */
    Connection koneksi;
    
    public HalamanUtama() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //JFrame frame = new JFrame();
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
        //sideBar();
    }

    public void desktop(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT table_data.title, table_data.deskripsi, table_data.simbol, data_rpl.judul_materi FROM table_data, data_rpl WHERE table_data.jurusan = data_rpl.jurusan AND id_rpl = 1";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                title.setText(rs.getString("title"));
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
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
                divisi.setText(rs.getString("judul_materi"));
                deskripsii.setText(rs.getString("deskripsi"));
            }
       }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //public void sideBar(){
    //    materi.setVisible(true);
    //    materi.setEnabled(true);
        
    //    judulMateri.setVisible(false);
    //    judulMateri.setEnabled(false);
    //}
    
    @SuppressWarnings("unchecked")
    
    //private void descMateri(java.awt.event.MouseEvent evt) {                                       
        
    //}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg_send = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnMm = new javax.swing.JPanel();
        lblSideMM = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblHomePage = new javax.swing.JLabel();
        btnRpl = new javax.swing.JPanel();
        lblSideRpl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnTkj = new javax.swing.JPanel();
        lblSideTkj = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSMK = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        msg_text = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblBawahTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        divisi = new javax.swing.JLabel();
        lblInputText = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblSidebarButton = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNavmateri = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        judulMateri = new javax.swing.JScrollPane();
        namaMateri = new javax.swing.JList();
        materi = new javax.swing.JLabel();
        lblDeskripsi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deskripsii = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        msg_send.setText("send");
        msg_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_sendActionPerformed(evt);
            }
        });
        getContentPane().add(msg_send);
        msg_send.setBounds(730, 715, 70, 30);

        jPanel1.setBackground(new java.awt.Color(38, 42, 51));

        btnMm.setBackground(new java.awt.Color(38, 42, 51));
        btnMm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMmMouseClicked(evt);
            }
        });

        lblSideMM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/mm.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MM");

        javax.swing.GroupLayout btnMmLayout = new javax.swing.GroupLayout(btnMm);
        btnMm.setLayout(btnMmLayout);
        btnMmLayout.setHorizontalGroup(
            btnMmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMmLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblSideMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        btnMmLayout.setVerticalGroup(
            btnMmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMmLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(btnMmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lblSideMM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHome.setBackground(new java.awt.Color(162, 162, 162));
        btnHome.setForeground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Homepage");

        lblHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/homee.png"))); // NOI18N

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(219, 219, 219))
        );

        btnRpl.setBackground(new java.awt.Color(38, 42, 51));
        btnRpl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRplMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRplMouseEntered(evt);
            }
        });

        lblSideRpl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/rpl.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("RPL");

        javax.swing.GroupLayout btnRplLayout = new javax.swing.GroupLayout(btnRpl);
        btnRpl.setLayout(btnRplLayout);
        btnRplLayout.setHorizontalGroup(
            btnRplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRplLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblSideRpl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRplLayout.setVerticalGroup(
            btnRplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRplLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnRplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSideRpl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(148, 148, 148))
        );

        btnTkj.setBackground(new java.awt.Color(38, 42, 51));
        btnTkj.setForeground(new java.awt.Color(51, 51, 51));
        btnTkj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTkj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTkjMouseClicked(evt);
            }
        });

        lblSideTkj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/tkje.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TKJ");

        javax.swing.GroupLayout btnTkjLayout = new javax.swing.GroupLayout(btnTkj);
        btnTkj.setLayout(btnTkjLayout);
        btnTkjLayout.setHorizontalGroup(
            btnTkjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTkjLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblSideTkj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnTkjLayout.setVerticalGroup(
            btnTkjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTkjLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnTkjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSideTkj, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(82, 82, 82))
        );

        lblSMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/smk4(1).png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(38, 42, 51));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/logout.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logout");

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(162, 162, 162));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRpl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTkj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblSMK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblSMK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRpl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTkj, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 240, 770);

        msg_text.setBackground(new java.awt.Color(188, 188, 188));
        msg_text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        msg_text.setBorder(null);
        msg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_textActionPerformed(evt);
            }
        });
        getContentPane().add(msg_text);
        msg_text.setBounds(280, 720, 420, 20);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lblBawahTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/lblTitle_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 179, 233));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIMBOL");

        title.setFont(new java.awt.Font("Agency FB", 0, 50)); // NOI18N
        title.setForeground(new java.awt.Color(14, 179, 233));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TITLE");

        divisi.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        divisi.setForeground(new java.awt.Color(14, 179, 233));
        divisi.setText("Divisi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblBawahTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBawahTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(240, 0, 490, 130);

        lblInputText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/input chat.png"))); // NOI18N
        getContentPane().add(lblInputText);
        lblInputText.setBounds(260, 710, 460, 41);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane2.setViewportView(msg_area);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(240, 140, 550, 570);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/sidebar.png"))); // NOI18N
        lblSidebarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSidebarButtonMouseClicked(evt);
            }
        });
        jPanel3.add(lblSidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 27, 27));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 30));

        lblNavmateri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/NavMateri.png"))); // NOI18N
        jPanel3.add(lblNavmateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 30));

        jPanel4.setBackground(new java.awt.Color(162, 162, 162));

        judulMateri.setBackground(new java.awt.Color(38, 42, 51));

        namaMateri.setBackground(new java.awt.Color(38, 42, 51));
        namaMateri.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        namaMateri.setForeground(new java.awt.Color(255, 255, 255));
        namaMateri.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Materi 1", "Materi 2", "Materi 3", "Materi 4", "Materi 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        namaMateri.setSelectionBackground(new java.awt.Color(162, 162, 162));
        judulMateri.setViewportView(namaMateri);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(judulMateri, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulMateri, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 410));
        jPanel3.add(materi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, 410));

        lblDeskripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/lblDeskripsi_1.png"))); // NOI18N
        jPanel3.add(lblDeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 269, 50));

        deskripsii.setBackground(new java.awt.Color(255, 255, 255));
        deskripsii.setFont(new java.awt.Font("Agency FB", 0, 25)); // NOI18N
        deskripsii.setForeground(new java.awt.Color(153, 153, 153));
        deskripsii.setText("Ini adalah modul pembelajaran");
        deskripsii.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        deskripsii.setOpaque(true);
        jScrollPane3.setViewportView(deskripsii);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 540, 150));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(810, 88, 560, 680);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/closed.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1290, 10, 50, 50);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/minimem.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(1239, 10, 45, 50);

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halamanutamaimages/bground.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRplMouseClicked
        // TODO add your handling code here:
        new MenuRpl().show();
        dispose();
    }//GEN-LAST:event_btnRplMouseClicked

    private void btnTkjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTkjMouseClicked
        // TODO add your handling code here:
        new Tkj().show();
        dispose();
    }//GEN-LAST:event_btnTkjMouseClicked

    private void btnMmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMmMouseClicked
        // TODO add your handling code here:
        new Multimedia().show();
        dispose();
    }//GEN-LAST:event_btnMmMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnRplMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRplMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRplMouseEntered
    int x = 110;
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
            if(x == 110){
            jPanel4.setSize(110, 410);
            Thread th = new Thread() {
            @Override
            public void run(){
                try{
                    for (int i = 110; i >= 0; i--){
                        Thread.sleep(1);
                        jPanel4.setSize(i, 410);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                }
        }; th.start();
        x=0;
        }
        
        //materi.setVisible(true);
        //materi.setEnabled(true);
        
        //judulMateri.setVisible(false);
        //judulMateri.setEnabled(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    
    private void lblSidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSidebarButtonMouseClicked
        // TODO add your handling code here:
        if(x == 0){
            jPanel4.show();
            jPanel4.setSize(x, 410);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for (int i = 0; i <= x; i++){
                            Thread.sleep(1);
                            jPanel4.setSize(i, 410);
                        }
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }; th.start();
            x = 110;
        }
        
        //judulMateri.setVisible(true);
        //judulMateri.setEnabled(true);
    }//GEN-LAST:event_lblSidebarButtonMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new Confirm().show();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void msg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msg_textActionPerformed

    private void msg_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_sendActionPerformed
        // TODO add your handling code here:
        try {
            String msg="";
            msg=msg_text.getText();
            dout.writeUTF(msg);
            msg_text.setText("");
            
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_msg_sendActionPerformed

    
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
                if ("Windows".equals(info.getName())) {
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
        
               try {
            String msgin="";
            ss=new ServerSocket(1200);
            s=ss.accept();
            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            while(!msgin.equals("exit")){
                msgin = dis.readUTF();
                msg_area.setText(msg_area.getText() + "\n client : " + msgin );
            }
            
            
            
        } catch (Exception e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnMm;
    private javax.swing.JPanel btnRpl;
    private javax.swing.JPanel btnTkj;
    private javax.swing.JLabel close;
    private javax.swing.JLabel deskripsii;
    private javax.swing.JLabel divisi;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane judulMateri;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBawahTitle;
    private javax.swing.JLabel lblDeskripsi;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblInputText;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNavmateri;
    private javax.swing.JLabel lblSMK;
    private javax.swing.JLabel lblSideMM;
    private javax.swing.JLabel lblSideRpl;
    private javax.swing.JLabel lblSideTkj;
    private javax.swing.JLabel lblSidebarButton;
    private javax.swing.JLabel materi;
    private javax.swing.JLabel minimize;
    private static javax.swing.JTextArea msg_area;
    private javax.swing.JButton msg_send;
    private javax.swing.JTextField msg_text;
    private javax.swing.JList namaMateri;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

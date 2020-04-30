/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apss;

import java.sql.*;
/**
 *
 * @author HP
 */
public class Koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String[] args) {
        try {
            String url ="jdbc:mysql://localhost/tutorial";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi gagal" + e.getMessage());
        }
    }
}

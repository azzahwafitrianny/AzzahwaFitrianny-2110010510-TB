/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.koneksi;

/**
 *
 * @author za
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabasePC {
  Connection koneksi;
  public static Connection SewaKoneksi(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/penyewaan_pc", "root", "");
          return koneksi;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
  
}

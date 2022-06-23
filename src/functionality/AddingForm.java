/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ihorg
 */
public class AddingForm {
    
    //VARIABLES
    private static Connection conn;
    private static Statement stmt;
    
    public void addRecord(String s) {
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/airport","Lishnyak","123");
            stmt = conn.createStatement();
            stmt.executeUpdate(s);
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //CHECK CUSTOMER EXISTENCE
    public Integer isChecked(JTextField tf1, JTextField tf2, JLabel label1, JLabel label2) {
        Integer value = 1;
        try {
            String check1 = "select * from clients where id="+tf1.getText()+"";
            String check2 = "select * from flights where id="+tf2.getText()+"";
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/airport","Lishnyak","123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(check1);
            if(!rs.next()) {
                label1.setText("Такого користувача не існує!!!");
                label2.setText("");
                value = 0;
            }
            rs = stmt.executeQuery(check2);
            if(!rs.next()) {
               label2.setText("Такого польоту не існує!!!");
               label1.setText("");
               value = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
} 

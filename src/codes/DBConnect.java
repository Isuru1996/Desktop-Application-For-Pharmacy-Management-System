/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.sql.Connection;
import interfaces.waitingBarr;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru Gayan
 */
public class DBConnect {
    
    public static Connection dbconnect()
    {
        Connection conn=null;
        try {
            Class.forName("java.sql.Connection");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project5", "root", "");
            System.out.println("Connection successss");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    }
    
   
    
  
}

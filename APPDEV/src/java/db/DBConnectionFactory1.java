/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deathman28
 */
public class DBConnectionFactory1 extends DBConnectionFactory {
           
            
            
   @Override
    public Connection getConnection() {
        try {
            Class.forName(getDriverName());
            Connection conn = 
                    DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnectionFactory1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnectionFactory1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
    
}
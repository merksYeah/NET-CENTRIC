/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author PogiMerks
 */
public class ItemDB {
    
    public void inputItem(Item item){
        System.out.println(item.getItemType()+" "+item.getStatus()+" "+item.getDescription());
        try {
            String query = "insert into item(item_id, item_type, status, description) values (null, ?,?,?) ";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, item.getItemType());
            pstmt.setString(2, item.getStatus());
            pstmt.setString(3, item.getDescription());
            pstmt.executeUpdate();
            System.out.println("success");
            DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removePost(Item item)
    {
        try {
            String query ="update item set status= ? where item_id= ? ";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, "R");
            pstmt.setString(2, item.getItemType().toString()); //MALE ID DAPAT  
        } catch (SQLException ex) {
            Logger.getLogger(ItemDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public ArrayList<User> getList(User oneUser){
        ResultSet rs = null;
        ArrayList<User> searches = new ArrayList<>();
        try {   
            //DBConnectionFactory db = new DBConnectionFactory1();
             String query = "select * from users where name = ? and password = ?";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, oneUser.getName());
            pstmt.setString(2, oneUser.getPassword());
            rs = pstmt.executeQuery();
            while(rs.next()){
                User two = new User();
                two.setName(rs.getString("name"));
                two.setPassword(rs.getString("password"));
                searches.add(two);
            }
            
           DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return searches;
    }*/
  
}



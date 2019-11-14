package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connector {
    public Connection conn;
    private static Connector _instance;

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Connector get_instance(){
        if(_instance == null){
            _instance = new Connector();
        }
        return _instance;
    }
    public ResultSet getQuery(String sql){
        try {
            PreparedStatement prstm = conn.prepareStatement(sql);
            return prstm.executeQuery();
        }catch (Exception e){

        }
        return null;
    }
    public boolean updateQuery(String sql){
        try {
            PreparedStatement prstm = conn.prepareStatement(sql);
            if(prstm.executeUpdate() >0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }
    public void close(){
        try {
            conn.close();
        }catch (Exception e){

        }
    }
}

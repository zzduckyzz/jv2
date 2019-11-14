package jv2_session5;

import Connector.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);

            Statement stm = conn.createStatement();
//            Connector connector = new Connector();
//            ResultSet rs = connector.getQuery(sql);

            String ins_sql = "INSERT INTO student(name,age,mark) VALUES('Ngo Van Duy',18,4);";
            stm.executeUpdate(ins_sql);


            String sql = "SELECT * FROM student";

            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));
            }
            System.out.println(rs);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

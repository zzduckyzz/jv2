package jv2_labs5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AddStudent {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submit(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/t1904a";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO student (student_name,age,mark) VALUES(?,?,?)";
            PreparedStatement prstm = conn.prepareStatement(sql);
            String student_name = txtName.getText();
            String age = txtAge.getText();
            String mark = txtMark.getText();

            prstm.setString(1,student_name);
            prstm.setString(2,age);
            prstm.setString(3,mark);
            prstm.execute();

            conn.close();

            Parent table = FXMLLoader.load(getClass().getResource("table.fxml"));
            Main.mainStage.getScene().setRoot(table);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

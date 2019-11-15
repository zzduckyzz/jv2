package jv2_labs5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class ListStudent implements Initializable {
    public TableView<Student> tbView = new TableView<>();
    public TableColumn<Student, Integer> colId = new TableColumn<>();
    public TableColumn<Student, String> colName = new TableColumn<>();
    public TableColumn<Student, Integer> colAge = new TableColumn<>();
    public TableColumn<Student, Integer> colMark = new TableColumn<>();

    public TextField txtName = new TextField();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("student_name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colMark.setCellValueFactory(new PropertyValueFactory<>("mark"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/t1904a";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<Student> list = FXCollections.observableArrayList();

            while (rs.next()) {
                //list.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
                Integer id = rs.getInt("id");
                String name = rs.getString("student_name");
                Integer age = rs.getInt("age");
                Integer mark = rs.getInt("mark");
                Student s = new Student(id, name, age, mark);

                list.add(s);
            }
            tbView.setItems(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void search() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:8889/t1904a";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            String search = txtName.getText();
            String sql = "SELECT * FROM student WHERE student_name LIKE '%" + search + "%'";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<Student> list = FXCollections.observableArrayList();

            while (rs.next()) {
                list.add(new Student(rs.getInt("id"), rs.getString("student_name"),
                        rs.getInt("age"), rs.getInt("mark")));
            }
            tbView.setItems(list);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void newStudent() {
        try {
            Parent form = FXMLLoader.load(getClass().getResource("add.fxml"));
            Main.mainStage.getScene().setRoot(form);
        } catch (Exception e) {

        }
    }
}

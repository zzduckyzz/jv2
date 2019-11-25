package jv2_as2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ListStudents implements Initializable {
    public TableView<Student> tbView = new TableView<>();
    public TableColumn<Student,String> colName = new TableColumn<>();
    public TableColumn<Student,Integer> colAge = new TableColumn<>();
    public TableColumn<Student,Double> colMark = new TableColumn<>();

    public static ObservableList<Student> list1 = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colMark.setCellValueFactory(new PropertyValueFactory<>("mark"));

//        list1.add(new Student("Duy",21,9.8));
//        list1.add(new Student("Son",15,9.5));
//        list1.add(new Student("Hoang",19,6.8));

        tbView.setItems(list1);
    }

    public void addStudent(){
        try{
            Parent addStudent = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
            Main.mainStage.getScene().setRoot(addStudent);
            Main.mainStage.setTitle("Add student");
        }
        catch (Exception e){
        }

    }
}
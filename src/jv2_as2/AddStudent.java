package jv2_as2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class AddStudent {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void saveStudent(){
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double mark = Double.parseDouble(txtMark.getText());
        for(Student st: ListStudents.list1){
            if (st.getName().equals(name)|| name.equals("")){
                return;
            }
        }
        ListStudents.list1.add(new Student(name,age,mark));
        try {
            Parent listStudent = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
            Main.mainStage.getScene().setRoot(listStudent);
            Main.mainStage.setTitle("List Students");
        }
        catch (Exception ignored){

        }
    }
}
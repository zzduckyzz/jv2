package jv2_labs6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage mainStage;

    public static Parent root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        try {
            if(root==null){
                root = FXMLLoader.load(getClass().getResource("contact.fxml"));
            }
            ContactList.render();
            primaryStage.setTitle("Contact");
            primaryStage.setScene(new Scene(root,300,400));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

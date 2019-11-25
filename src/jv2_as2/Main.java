package jv2_as2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage){
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
            primaryStage.setTitle("List Students");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }
        catch (Exception e){

        }
    }
}
package jv2_session9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoxMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage boxStage;

    @Override
    public void start(Stage primaryStage){
        boxStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("box.fxml"));
            primaryStage.setTitle("multiple languages");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){

        }

    }
}

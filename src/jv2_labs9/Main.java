package jv2_labs9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.stream.ImageInputStream;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage){
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("dky.fxml"));
            primaryStage.setTitle("register");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){

        }

    }
}

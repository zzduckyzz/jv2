package jv2_labs6;

import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ContactList implements Initializable {
    public static Parent view;

    public ListView<Contact> listView = new ListView<>();

    public static Contact detail;

    private static ContactList instance;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(instance == null){
            instance = this;
        }

    }

    public void viewContact(){
        detail = listView.getSelectionModel().getSelectedItem();
        try {
            if(view == null){
                view = FXMLLoader.load(getClass().getResource("detail.fxml"));
            }
            ContactDetail.render();
            Main.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void render(){
        try {
            Connector connector = Connector.get_instance();
            String sql = "SELECT * FROM contact";
            ResultSet rs = connector.getQuery(sql);

            ObservableList<Contact> list  = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String contact_name = rs.getString("contact_name");
                String company = rs.getString("company");
                String address = rs.getString("address");
                Contact c = new Contact(id,contact_name,company,address);
                list.add(c);
            }
            instance.listView.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

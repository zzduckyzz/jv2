package jv2_labs9;


import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import jv2_session9.BoxMain;

import java.util.Locale;
import java.util.ResourceBundle;


public class MainController {
    public Text title = new Text();
    public RadioButton rbEN = new RadioButton();
    public RadioButton rbVN = new RadioButton();
    public TextField txtname = new TextField();
    public TextField txtemail = new TextField();
    public TextField txtpw = new TextField();
    public TextField txtcpw = new TextField();

    public void changeLanguage(){
        ResourceBundle bundle = ResourceBundle.getBundle("jv2_labs9.Messages");
        Main.mainStage.setTitle(bundle.getString("stage_title"));
        title.setText(bundle.getString("title"));
        rbEN.setText(bundle.getString("eng"));
        rbVN.setText(bundle.getString("vn"));
    }

    public void unselectedButton(){
        rbEN.setSelected(false);
        rbVN.setSelected(false);
    }

    public void langEN(){
        Locale.setDefault(Locale.US);
        this.unselectedButton();
        rbEN.setSelected(true);
        this.changeLanguage();
    }

    public void langVN(){
        Locale.setDefault(new Locale("vi","VN"));
        this.unselectedButton();
        rbVN.setSelected(true);
        this.changeLanguage();
    }


}

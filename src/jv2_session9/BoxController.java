package jv2_session9;

import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

import java.util.Locale;
import java.util.ResourceBundle;

public class BoxController {
    public Text title = new Text();
    public RadioButton rbEN = new RadioButton();
    public RadioButton rbVN = new RadioButton();
    public RadioButton rbDE = new RadioButton();

    public void changeLanguage(){
        ResourceBundle bundle = ResourceBundle.getBundle("jv2_session9.Messages");
        BoxMain.boxStage.setTitle(bundle.getString("stage_title"));
        title.setText(bundle.getString("title"));
        rbEN.setText(bundle.getString("eng"));
        rbVN.setText(bundle.getString("vn"));
        rbDE.setText(bundle.getString("de"));
    }

    public void unselectedButton(){
        rbEN.setSelected(false);
        rbVN.setSelected(false);
        rbDE.setSelected(false);
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

    public void langDE(){
        Locale.setDefault(Locale.GERMANY);
        this.unselectedButton();
        rbDE.setSelected(true);
        this.changeLanguage();
    }
}
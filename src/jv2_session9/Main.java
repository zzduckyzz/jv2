package jv2_session9;

import sun.misc.resources.Messages;
import sun.plugin2.message.Message;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale vn = new Locale("vi","VN");
        Locale.setDefault(vn);
        ResourceBundle bundle = ResourceBundle.getBundle("jv2_session9.Messages");
        System.out.println(bundle.getString("hello"));
    }
}

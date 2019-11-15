package jv2_labs4;

public class BankDemo {
    public static void main(String args[]){
        BankAccount b = new BankAccount();
        new Thread(()->{
            b.lamTheATM();
        }).start();
        new Thread(()->{
            b.doiMatKhau();
        }).start();
        new Thread(()->{
            b.napTien();
        }).start();
        new Thread(()->{
            b.moTaiKhoan();
        }).start();
    }
}

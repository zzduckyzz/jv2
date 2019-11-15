package jv2_labs4;

public class Main {
    public static void main(String args[]){
        SoNguyenTo s = new SoNguyenTo();
        new Thread(()->{
            for (int i =0;i<100;i++){
                s.soNguyenToTiepTheo();
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        }).start();
        new Thread(()->{
            for (int i =0;i<100;i++){
                s.binhPhuong();
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        }).start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                s.soNguyenToTiepTheo();
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
    }
}

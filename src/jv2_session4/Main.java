package jv2_session4;

public class Main {
    public static void main(String args[]){
        Number n = new Number();

        Runnable r1 = ()->{
            for (int i=0;i<100;i++){
                //synchronized (n){
                n.upCount();
                // n.showCount();
                //  }
                try {
                    Thread.sleep(100);
                }catch (Exception e){}
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}

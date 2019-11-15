package jv2_session4;

public class Number {
    public int count = 0;
    public int count2 = 0;

    public synchronized void upCount(){
        count++;
        count2++;
        showCount();
    }

    public synchronized void showCount(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(count);
        System.out.println(count2);

    }
}

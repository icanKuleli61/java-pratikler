package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.List;

public class ThreadlerinYarisi implements Runnable {
    List<Integer> sayilar;
    public  List<Integer> teksayilar = new ArrayList<>();
    public  List<Integer> ciftsayilar = new ArrayList<>();
    public static final Object  Lock =  new Object();

    public ThreadlerinYarisi(List<Integer> sayilar) {
        this.sayilar = sayilar;
    }


    @Override
    public void run() {
        synchronized (Lock){
            for (Integer integer : sayilar) {
                if (integer % 2 == 0){
                    ciftsayilar.add(integer);
                }else  {
                    teksayilar.add(integer);
                }
            }
        }
    }
}

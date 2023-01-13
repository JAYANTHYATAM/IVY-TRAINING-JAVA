import java.util.*;
class Se implements Runnable
{
    @Override
    public void run() {
        for (int i = 0;i<=5;i++){
            System.out.println(i);
        }
    }
}

public class SingleThreadRunnable {
    public static void main(String[] args){
        Se s = new Se();
        Thread t = new Thread(s);
        t.start();
    }
}

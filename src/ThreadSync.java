class Example{
    void display(){
        Thread thread = Thread.currentThread();
        int[] numbers = {5,20,25,40,2,55} ;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <=6 ; i++ ) {
            if (numbers[i] > max)
                max = numbers[i];

            if (numbers[i] < min)
                min = numbers[i] ;
        }
        System.out.println(min);
        System.out.println(max);


            /*try{
                Thread.sleep(1000);
                System.out.println(thread.getName() + " number " + i );
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }*/

    }
}

class T extends Thread{
    Example e;
    T (Example e){
        this.e = e;
    }
    public void run(){
        e.display();
    }
}

public class ThreadSync {
    public static void main(String[] args){
        Example ex = new Example();
        T t1 = new T (ex);
        T t2 = new T (ex);
        T t3 = new T (ex);
        t1.start();
        t2.start();
        t3.start();
    }
}

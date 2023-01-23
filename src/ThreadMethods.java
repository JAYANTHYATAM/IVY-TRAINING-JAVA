class Th extends Thread{
    void display(){
        System.out.println("Thread **");
    }
}
public class ThreadMethods {
    public static void main(String[] args) {


        Th th = new Th();
        th.display();

    }
}
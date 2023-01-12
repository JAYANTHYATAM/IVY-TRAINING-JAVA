import java.io.*;
public class StaticEg {
    static int a = 40;
    int b = 30;

    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static void staticDisplay()
    {
        System.out.println(a);
    }
    public static void main(String[] args){
        StaticEg obj = new StaticEg();
        obj.simpleDisplay();
    }
}

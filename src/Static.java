import java .util.*;
public class Static {
    static int a = 3;
    int b = 8;
    void simpleDisplay(){
        System.out.println(a);
        System.out.println(b);
    }
    static void staticDisplay(){
        System.out.println(a);
    }
    public static void main(String[] args){
        Static obj = new Static();
        obj.simpleDisplay();
    }
}

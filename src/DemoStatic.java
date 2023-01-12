class Demo{ static int a = 10;
    static void display()
    {
        System.out.println("Static Method");
    }
}
public class DemoStatic {
    public static void main(String[] args){
        System.out.println(Demo.a);
        Demo.display();
    }
}

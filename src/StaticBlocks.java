class EG{
    static int a = 10;
    static void display()
    {
        System.out.println("Static Metod");
    }
    static {
        System.out.println("Static Block");
    }
}

public class StaticBlocks {
    public static void main(String[] args){
        System.out.println("Main Method");
        System.out.println(EG.a);

    }
}

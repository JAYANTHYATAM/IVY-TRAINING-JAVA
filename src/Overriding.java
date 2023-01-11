class Entain{
    void display()
    {
        System.out.println("Parent method");
    }
}
class Ivy extends Entain{
    void display()
    {
        System.out.println("Child Method");
    }
}


public class Overriding {
    public static void main(String[] args){
        Ivy obj = new Ivy();
        obj.display();
    }
}

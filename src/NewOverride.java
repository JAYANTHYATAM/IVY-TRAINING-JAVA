class Country{
     public void Display(){
        System.out.println("India");
    }
}
class State extends Country{
    public void Display(){
        System.out.println("Ap");
    }
}
public class NewOverride {
    public static void main(String[] args) {


        State obj = new State();
        obj.Display();
    }
}
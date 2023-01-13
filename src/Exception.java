class Excep {
    void display() {
        try {
            int a = 22 / 9;

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

public class Exception {
    public static void main(String[] args){
        Excep obj = new Excep();
        obj.display();
    }
}

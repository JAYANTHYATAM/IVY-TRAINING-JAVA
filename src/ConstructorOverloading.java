class B
{
    B(){
        System.out.println("Constructor with out arguments");
    }
    B(int B){
        System.out.println("Constructor with arguments");
    }

}
public class ConstructorOverloading {
    public static void main(String[] arg) {


        B obj = new B();
        B obj 1 = new B(10);

    }
}

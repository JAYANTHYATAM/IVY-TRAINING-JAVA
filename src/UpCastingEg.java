class  P{
    void display() {
        System.out.println("method of parent class");
    }
}

class C extends Parent {
    void show() {
        System.out.println("method of child class");
    }
}
public class UpCastingEg {
    public static void main(String args[]) {

        Parent obj1 = (Parent) new C();
        Parent obj2 = (Parent) new C();
        obj2.show();
    }
}


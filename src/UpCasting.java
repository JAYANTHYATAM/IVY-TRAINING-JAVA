class Parent{
    void show(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    void show() {
        System.out.println("Child Method");
    }
}
public class UpCasting {
    public static void main(String[] args){
        Parent obj = new Child();
        obj.show();
    }
}

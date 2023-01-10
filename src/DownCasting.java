class Vehicle{
    String name;
    void showMessage()
    {
        System.out.println("Parent method is called");
    }
}
class Car extends Vehicle {
    int age;
    void showMessage()
    {
        System.out.println("Child method is called");
    }
}
public class DownCasting {
    public static void main(String[] args)
    {
        Vehicle p = new Car();
        p.name = "Jayanth";
        Car c = (Car)p;

        c.age = 21;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }
}


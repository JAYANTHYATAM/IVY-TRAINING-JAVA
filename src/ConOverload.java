class O{
    O()

    {
        System.out.println("Constructor arguments");
    }
    O (int a)
    {
        System.out.println("Constructor arguments");
    }
}

public class ConOverload {
    public static void main(String[] args){
        O obj = new O();
        O obj1 = new O(10);
    }
}

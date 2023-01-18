import java.util.concurrent.Callable;

class M
{
    public void start()
    {
        System.out.println("Machine started");
    }
}
class P extends M
{
    public void start()
    {
        System.out.println("Camera Started");
    }
    public void snap(){
        System.out.println("Photo taken");
    }
}

public class ReDownCasting {
    public static void main(String[] args){

        M machine1 = new M();
        P camera1 = new P();

        M machine3 = new P();
        P camera2 = new P();
        camera2.start();
        camera2.snap();

    }
}






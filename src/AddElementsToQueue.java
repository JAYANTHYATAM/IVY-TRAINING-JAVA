import java.util.*;

public class AddElementsToQueue {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Java");
        pq.add("For");
        pq.add("Android");

        System.out.println(pq);
    }
}


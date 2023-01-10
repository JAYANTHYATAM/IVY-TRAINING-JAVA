import java.util.*;

public class RemoveElementsQueue {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Java");
        pq.add("For");
        pq.add("Android");

        System.out.println("Initial Queue " + pq);

        pq.remove("Java");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }
}



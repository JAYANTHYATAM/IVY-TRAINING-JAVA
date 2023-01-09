import java.util.Scanner;

public class PerformanceReview {
    public static void main(String[] args) {
        int maxMarks = 100;
        int passmark = 35;
        int result = 78;
        if (result >= passmark) {
            System.out.println("Pass");
        }
        if (result == maxMarks) {
            System.out.println("Topper");
        }
        else if(result <= passmark) {
            System.out.println("Fail");
        }
    }
}

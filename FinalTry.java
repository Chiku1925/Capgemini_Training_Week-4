import java.util.*;

public class FinalTry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println("Result: " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Error in division");
        } finally {
            System.out.println("Operation completed");
        }
    }
}

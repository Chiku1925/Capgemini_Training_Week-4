import java.util.*;

public class QuickCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("Enter valid numbers");
        }
    }
}

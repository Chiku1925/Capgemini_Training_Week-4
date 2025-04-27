public class NestedSafe {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int index = 2;
        int div = 0;
        try {
            try {
                int val = a[index];
                System.out.println("Result: " + (val / div));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

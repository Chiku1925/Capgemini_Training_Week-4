public class ArrayFetch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int idx = 5;
        try {
            System.out.println("Value: " + a[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

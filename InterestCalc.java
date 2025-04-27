public class InterestCalc {
    static double calc(double a, double r, int y) throws IllegalArgumentException {
        if (a < 0 || r < 0) throw new IllegalArgumentException();
        return a * r * y / 100;
    }

    public static void main(String[] args) {
        try {
            double res = calc(1000, 5, 2);
            System.out.println("Interest: " + res);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

public class ValidateLicense {
    public static void main(String[] args) {
        String plate = "AB1234";
        boolean isValid = plate.matches("^[A-Z]{2}\\d{4}$");
        System.out.println(isValid);
    }
}

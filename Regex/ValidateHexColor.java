public class ValidateHexColor {
    public static void main(String[] args) {
        String color = "#FFA500";
        boolean isValid = color.matches("^#[0-9a-fA-F]{6}$");
        System.out.println(isValid);
    }
}

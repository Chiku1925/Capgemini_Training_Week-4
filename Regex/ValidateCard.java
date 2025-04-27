public class ValidateCard {
    public static void main(String[] args) {
        String card = "4123456789012345";
        boolean isVisa = card.matches("^4\\d{15}$");
        boolean isMaster = card.matches("^5\\d{15}$");
        System.out.println(isVisa || isMaster);
    }
}

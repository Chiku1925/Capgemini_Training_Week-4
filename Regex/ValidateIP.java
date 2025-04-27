public class ValidateIP {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        boolean isValid = ip.matches("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$");
        System.out.println(isValid);
    }
}

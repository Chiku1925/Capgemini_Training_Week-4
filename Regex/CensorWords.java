public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String result = text.replaceAll("(?i)\\bdamn|stupid\\b", "****");
        System.out.println(result);
    }
}

import java.util.*;

class AgeBlock extends Exception {
    AgeBlock(String m) { super(m); }
}

public class AgeCheck {
    static void validateAge(int a) throws AgeBlock {
        if (a < 18) throw new AgeBlock("Age must be 18 or above");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = s.nextInt();
            validateAge(a);
            System.out.println("Access granted!");
        } catch (AgeBlock e) {
            System.out.println(e.getMessage());
        }
    }
}

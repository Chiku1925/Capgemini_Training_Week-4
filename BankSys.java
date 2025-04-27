class NoBalance extends Exception {
    NoBalance(String m) { super(m); }
}

class Wallet {
    double bal = 5000;
    void withdraw(double a) throws NoBalance {
        if (a < 0) throw new IllegalArgumentException();
        if (a > bal) throw new NoBalance("Insufficient balance!");
        bal -= a;
        System.out.println("Withdrawal successful, new balance: " + bal);
    }
}

public class BankSys {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        try {
            w.withdraw(6000);
        } catch (NoBalance e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}

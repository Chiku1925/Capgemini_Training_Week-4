import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void testDepositAndBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(40);
        assertEquals(60, account.getBalance());
    }

    @Test
    void testWithdrawFail() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
    }
}

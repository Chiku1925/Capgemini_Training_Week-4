import java.util.*;

class BankingSystem {
    private Map<String, Double> accounts; // Stores customer accounts (AccountNumber -> Balance)
    private Map<String, Double> sortedAccounts; // Sorts customers by balance
    private Queue<String> withdrawalQueue; // Queue to process withdrawal requests

    public BankingSystem() {
        this.accounts = new HashMap<>();
        this.sortedAccounts = new TreeMap<>(Comparator.comparingDouble(accounts::get));
        this.withdrawalQueue = new LinkedList<>();
    }

    // Add a customer account
    public void addCustomerAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(accountNumber, initialBalance);
    }

    // Make a deposit to an account
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(accountNumber, newBalance);
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Make a withdrawal
    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                sortedAccounts.put(accountNumber, accounts.get(accountNumber));
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance in account " + accountNumber);
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Process withdrawal requests from the queue
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            // Assume we process a fixed amount for the sake of simplicity
            double withdrawalAmount = 100.0;
            withdraw(accountNumber, withdrawalAmount);
        }
    }

    // Add a withdrawal request to the queue
    public void addWithdrawalRequest(String accountNumber) {
        withdrawalQueue.offer(accountNumber);
        System.out.println("Withdrawal request added for account " + accountNumber);
    }

    // Display all customers sorted by their balances
    public void displaySortedAccounts() {
        System.out.println("Customers Sorted by Balance:");
        for (Map.Entry<String, Double> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " Balance: $" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add customers with initial balances
        bank.addCustomerAccount("12345", 500.00);
        bank.addCustomerAccount("67890", 300.00);
        bank.addCustomerAccount("11223", 700.00);

        // Display customers sorted by balance
        bank.displaySortedAccounts();

        // Make some deposits and withdrawals
        bank.deposit("12345", 200.00);
        bank.deposit("67890", 50.00);
        bank.withdraw("11223", 200.00);

        // Add withdrawal requests to the queue
        bank.addWithdrawalRequest("12345");
        bank.addWithdrawalRequest("67890");

        // Process all withdrawal requests
        bank.processWithdrawals();

        // Display updated customer balances
        bank.displaySortedAccounts();
    }
}

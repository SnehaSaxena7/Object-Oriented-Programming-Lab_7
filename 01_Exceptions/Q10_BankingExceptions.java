/** User-defined checked exception. */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds. Balance: " + balance + ", requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Remaining balance: " + balance);
    }
}

/** Q10: Banking example - user-defined + built-in exceptions. */
public class Q10_BankingExceptions {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);

        try {
            acc.withdraw(2000);   // OK
            acc.withdraw(-500);   // IllegalArgumentException
        } catch (InsufficientFundsException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Built-in exception: " + e.getMessage());
        }

        try {
            acc.withdraw(10000);  // InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Built-in exception: " + e.getMessage());
        }
    }
}

import java.util.Scanner;

/** User-defined (custom) checked exception. */
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

/** Q7: Throw InvalidPasswordException if password has fewer than 6 characters. */
public class Q07_CustomException {

    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }
        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
        sc.close();
    }
}

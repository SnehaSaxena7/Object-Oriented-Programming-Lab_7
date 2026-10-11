import java.util.Scanner;

/** Q8: Using the throws keyword. */
public class Q08_ThrowsKeyword {

    // Declares that this method may throw NumberFormatException
    static int readNumber(Scanner sc) throws NumberFormatException {
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        return Integer.parseInt(input.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = readNumber(sc);
            System.out.println("You entered: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
        sc.close();
    }
}

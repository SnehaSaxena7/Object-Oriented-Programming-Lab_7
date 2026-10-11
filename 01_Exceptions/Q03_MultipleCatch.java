import java.util.Scanner;

/** Q3: Multiple catch blocks - NumberFormatException and ArithmeticException. */
public class Q03_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String s1 = sc.next();
        System.out.print("Enter second number: ");
        String s2 = sc.next();

        try {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            System.out.println("Result = " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer. (" + e.getMessage() + ")");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. (" + e.getMessage() + ")");
        }
        sc.close();
    }
}

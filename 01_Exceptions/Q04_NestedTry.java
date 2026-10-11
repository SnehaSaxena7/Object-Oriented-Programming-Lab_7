import java.util.InputMismatchException;
import java.util.Scanner;

/** Q4: Nested try. Inner try -> array access, Outer try -> division. */
public class Q04_NestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        try { // OUTER try: division
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            try { // INNER try: array element access
                System.out.print("Enter array index (0-4): ");
                int idx = sc.nextInt();
                System.out.println("arr[" + idx + "] = " + arr[idx]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index. (" + e.getMessage() + ")");
            }

            System.out.println("Division result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Outer catch: Please enter integers only.");
        }
        sc.close();
    }
}

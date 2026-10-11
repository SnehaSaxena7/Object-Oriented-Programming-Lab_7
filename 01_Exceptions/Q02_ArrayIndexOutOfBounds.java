import java.util.Scanner;

/** Q2: Array of 5 elements, handle invalid index. */
public class Q02_ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an index (0 to 4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Valid range is 0 to " + (arr.length - 1));
            System.out.println("Details: " + e.getMessage());
        }
        sc.close();
    }
}

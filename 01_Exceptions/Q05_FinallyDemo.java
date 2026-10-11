/** Q5: finally block always runs - with and without exception. */
public class Q05_FinallyDemo {

    static void useResource(boolean causeError) {
        try {
            System.out.println("File opened");
            System.out.println("Performing operation...");
            if (causeError) {
                int x = 10 / 0; // throws ArithmeticException
                System.out.println(x);
            }
            System.out.println("Operation completed successfully.");
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Resource closed");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Run 1: No exception ---");
        useResource(false);

        System.out.println("\n--- Run 2: With exception ---");
        useResource(true);
    }
}

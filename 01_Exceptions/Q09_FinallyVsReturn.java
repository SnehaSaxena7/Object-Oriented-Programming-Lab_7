/**
 * Q9: Finally vs Return.
 *
 * Explanation: When a try block executes "return", the return value is
 * computed first and saved, BUT the finally block still runs BEFORE the
 * method actually returns control to the caller. So the output order is:
 *   1. "Inside try block"
 *   2. "Inside finally block"   <-- finally runs before method exits
 *   3. "Returned value: 10"     <-- caller receives the value last
 */
public class Q09_FinallyVsReturn {

    static int test() {
        try {
            System.out.println("Inside try block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void main(String[] args) {
        int value = test();
        System.out.println("Returned value: " + value);
    }
}

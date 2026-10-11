/** Q6: Using the throw keyword. */
public class Q06_ThrowKeyword {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age " + age + " is not allowed. Must be 18 or above.");
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(15); // throws exception
            checkAge(30); // never reached
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main(): " + e.getMessage());
        }
    }
}

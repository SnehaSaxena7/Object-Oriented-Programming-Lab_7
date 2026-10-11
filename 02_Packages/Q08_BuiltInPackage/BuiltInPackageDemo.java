import java.util.ArrayList;
import java.util.Scanner;

public class BuiltInPackageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nNames stored in ArrayList:");
        for (String s : names) {
            System.out.println(" - " + s);
        }
        System.out.println("Total names: " + names.size());
        sc.close();
    }
}

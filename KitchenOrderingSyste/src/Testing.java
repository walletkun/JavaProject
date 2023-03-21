import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your email address: ");
        String input = scanner.nextLine();
        // Prompt the user to enter the file path
        System.out.print("Please enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        // Call the search method from SearchInFile class
        Customers.search(input ,phoneNumber);
        scanner.close();
    }
}

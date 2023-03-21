import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Customers {
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    private static int orderPoints;

    public static void search(String customerEmail, String phoneNumber) throws FileNotFoundException {
        File file = new File("output.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            //Search for the input in the fle
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                if (line.contains(customerEmail) || line.contains(phoneNumber)) {
                    orderPoints++;
                    System.out.println("Thank you for your purchase +" +orderPoints + " point");
                }
                else{
                    System.out.println("Please double check your input: Email Address/Phone number");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
    }

    public Customers(String phoneNumber, String customerEmail){

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

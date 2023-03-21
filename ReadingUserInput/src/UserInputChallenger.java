import java.util.Scanner;

public class UserInputChallenger {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;
        while (counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }
            catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of 5 numbers = " +sum);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch(NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }
    public static String getInputFromConsole(int currentYear){
        int yearNow = 2022;

        String yearOfBirth = System.console().readLine("I'll guess the year you are born, " +
                "please input your age ");
        int calculateYear = currentYear - Integer.parseInt(yearOfBirth);

        return "I guessed the year is " + calculateYear;
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born?");

        boolean validDob = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            }
            catch (NumberFormatException badUserData){
                System.out.println("Characters Not Allowed!!! Try Again.");
            }
        }while(!validDob);

        return "So you are " + age + " years old";

    }

    public static int checkData (int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;


        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}

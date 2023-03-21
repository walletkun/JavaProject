import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        double sum = 0;
        double avg = 0;
        int counter = 0;

        Scanner newNum = new Scanner(System.in);
        while(true){
            if(newNum.hasNextInt()){
                counter++;
                sum += newNum.nextInt();
                avg = sum / counter;
            }
            else{
                break;
            }
        }
        System.out.println("SUM = " + Math.round(sum) + " AVG = " +Math.round(avg));
        newNum.close();
    }
}

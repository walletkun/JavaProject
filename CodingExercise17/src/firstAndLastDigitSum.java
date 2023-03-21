//Almost by myself needed help

public class firstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(35));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 0;
        }
        int sum = number % 10;
        while(number >= 10){
            number /= 10;
        }
        sum += number;
        return sum;
    }
}

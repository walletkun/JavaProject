//Not by me STUDY WHILE LOOP!


public class evenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int remainder;
        while(number != 0){
            remainder = number % 10;
            if(remainder % 2 == 0){
                sum = sum + remainder;
            }
            number = number / 10;
        }
        return sum;
    }
}

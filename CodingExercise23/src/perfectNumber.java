public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(1));
    }
    public static boolean isPerfectNumber (int number){
        if(number < 1 ){
            return false;
        }
        else{
            int divisors = 0;
            int sum = 0;
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    divisors = i;
                    sum += divisors;
                }
            }
           return (sum == number);
        }
    }
}

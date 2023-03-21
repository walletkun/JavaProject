
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        int remainder = 0;
        int counter = 0;
        for(int i = 2; i <= number;){
            if(number % i == 0){
                remainder = i;
                number /= i;
                i--;
            }
            i++;
        }
        return remainder;
    }
}



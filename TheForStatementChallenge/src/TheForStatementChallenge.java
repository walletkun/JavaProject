public class TheForStatementChallenge {
    public static void main(String[] args) {

//        System.out.println("O is" +(isPrime(0) ? " " : " Not ")  + "a prime number");
//        System.out.println("1 is" +(isPrime(1) ? " " : " Not ")  + "a prime number");
//        System.out.println("2 is" +(isPrime(2) ? " " : " Not ")  + "a prime number");
//        System.out.println("3 is" +(isPrime(3) ? " " : " Not ")  + "a prime number");
//
//        System.out.println("8 is" +(isPrime(8) ? " " : " Not ")  + "a prime number");
//        System.out.println("17 is" +(isPrime(17) ? " " : " Not ")  + "a prime number");


        int counter = 0;
        int rangeOfNumbers = 1000;
            for(int i = 0; i <= rangeOfNumbers; i++){
                if(isPrime(i)){
                    counter++;
                    System.out.println(i+ " is" +(isPrime(i) ? " " : " Not ")  + "a prime number");
                    System.out.println("Prime Number count " +counter);
                    if(counter == 3){
                        System.out.println("Found " +counter+ " prime number");
                        break;
                    }
                }else{
                    System.out.println(i+ " is" +(isPrime(i) ? " " : " Not ")  + "a prime number");
                }
            }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++){
                if(wholeNumber % divisor == 0){
                    return false;
                }
        }
            return true;
        }
}

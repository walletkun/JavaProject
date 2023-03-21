public class numberToWords {
    public static void main(String[] args) {
      numberToWords(14500);
    }

    public static void numberToWords(int number) {
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int lastDigit = reverse(number);

            for(int i = 0; i < getDigitCount(number); i++){
                switch (lastDigit % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                lastDigit /= 10;
            }
            System.out.println();
         System.out.println(getDigitCount(lastDigit));
    }
    public static int reverse(int number){
        int remainder = 0;
        while(number != 0){
            int lastDigit = number % 10;
            remainder =   (remainder * 10) + lastDigit;
            number /= 10;
        }
        return remainder;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int counter = 1;
        while(number > 9){
            int remainder = number % 10;
            number /= 10;
            counter++;
        }
        return counter;
    }
}

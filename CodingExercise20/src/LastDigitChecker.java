public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(9));
        System.out.println(hasSameLastDigit(9, 22, 72));
    }
    public static boolean hasSameLastDigit(int a, int b , int c ){
        int lastDigit1 = a % 10;
        int lastDigit2 = b % 10;
        int lastDigit3 = c % 10;
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
       if(lastDigit1 == lastDigit2){
            return true;
        }
        else if(lastDigit1 == lastDigit3){
            return true;
        }
        else if(lastDigit2 == lastDigit3){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isValid(int num) {
        if(num < 10 || num > 1000){
            return false;
        }
        else{
            return true;
        }
    }
}

//NOT BY ME!

public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int reverse = 0;
        int palindrome_number = number;
        while( palindrome_number > 0){
            int lastDigit = palindrome_number % 10;
            reverse = (reverse * 10) + lastDigit;
            palindrome_number = palindrome_number / 10;
        }
        if(number == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}

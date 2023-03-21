public class ShareDigit {
    public static void main(String[] args) {
            System.out.println(hasSharedDigit(9 ,9));
    }
    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x >99 || y < 10 || y > 99){
            return false;
        }

        int lastNum1 = x % 10, lastNum2 = y % 10;
        int firstNum1 = x / 10,  firstNum2 = y / 10;
        if(lastNum1 == lastNum2) {
            return true;
        } else if (firstNum1 == firstNum2) {
            return true;

        } else if (lastNum1 == firstNum1) {
            return true;
        }
        else if(lastNum1 == firstNum2){
            return true;
        }
        else if(lastNum2 == firstNum1){
            return true;
        }
        else if(lastNum2 == firstNum2){
            return true;
        }
        else{
            return false;
        }
    }
}

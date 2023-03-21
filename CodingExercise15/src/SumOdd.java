public class SumOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(sumOdd(-4,6));
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else if(number % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > end){
            return -1;
        }
        if(start == end) {
            if(isOdd(start) && isOdd(end)){
                return start;
            }
            return 0;
        }
        if(start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        else{
            return -1;
        }
        return sum;
    }
}

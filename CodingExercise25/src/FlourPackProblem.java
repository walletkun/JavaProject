//Not by me


public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0 , 5));
    }
    public static boolean canPack(int bigCount , int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int sumOfCounts = (bigCount * 5) + (smallCount);
        if(sumOfCounts >= goal && (goal % 5) <= smallCount){
            return true;
        }
        else {
            return false;
        }
    }
}

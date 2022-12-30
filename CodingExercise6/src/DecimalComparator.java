//Not Answered by me!


public class DecimalComparator {
    public static void main(String[] args) {
            System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        return (int) (x * 1000) == (int) (y * 1000);
    }

}

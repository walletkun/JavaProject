public class SpeedConverter{
    public static void main(String[] args) {
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            kilometersPerHour = (kilometersPerHour/1.609);
            return Math.round(kilometersPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h ");
        }
           else if(kilometersPerHour < 0){
                System.out.println("Invalid Value");
            }
    }
}

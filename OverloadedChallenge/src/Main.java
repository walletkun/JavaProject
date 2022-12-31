public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " +convertToCentimeter(5,8)+ "cm");
        System.out.println("68in = " +convertToCentimeter(68)+ "cm");
    }
    public static double convertToCentimeter(int heightInInches){
        return heightInInches * 2.54;

    }
    public static double convertToCentimeter(int heightInFeet, int heightInInches){
       heightInFeet = heightInFeet * 12;
       heightInInches = heightInFeet + heightInInches;
        return convertToCentimeter(heightInInches);

    }
}

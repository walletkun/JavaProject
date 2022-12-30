public class Hello {
    public static void main(String[] args){
        System.out.println("Hello Fei");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }


        if((topScore > 90)||(secondTopScore <= 90)){
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is TRUE");
        }
        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not suppose to happen");
        }

        String makeofCar = "Volkswagon";
        boolean isDomestic = makeofCar == "Volkswagon" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double value1 = 20.00d;
        double value2 = 80.00d;
        double sumofTwoValues = (value1 + value2) * 100;
        double resultofTwoValues = sumofTwoValues % 40.00d;
        boolean testValue = resultofTwoValues == 0 ? false : true;
        if(testValue){
            System.out.println("Got some remainder");
        }
    }
}

// RE-READ THE QUESTION

public class DiagnoalStar {
    public static void main(String[] args) {
        printSquareStar(1);
    }
    public static void printSquareStar(int number){
            if(number < 5){
                System.out.print("Invalid Value");
            }
            else{
                for(int row = 1; row <= number; row++){
                    for(int column = 1; column <= number; column++){
                        if(row == 1 || row == number || column == 1 || column == number || column == row ||
                            column == (number - row + 1)){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }


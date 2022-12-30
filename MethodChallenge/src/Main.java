public class Main {
    public static void main(String[] args) {
        System.out.println(displayHighScorePosition("Tim",1500));
        System.out.println(displayHighScorePosition("David",1000));
        System.out.println(displayHighScorePosition("Blake",500));
        System.out.println(displayHighScorePosition("Eric",100));
        System.out.println(displayHighScorePosition("Kevin",25));

    }
    public static String displayHighScorePosition(String name, int PlayerPosition){
        PlayerPosition = calculateHighScorePosition(PlayerPosition);
        return name + " managed to get into position " +PlayerPosition+ " on the high score list";
    }
    public static int calculateHighScorePosition(int highScore){
        int position = 4;
        if(highScore >= 1000) {
             position -= 3;
        }
        else if (highScore >= 500) {
             position -= 2;
        }
         else if (highScore >= 100) {
             position -= 1;
         }
         return position;
    }
}


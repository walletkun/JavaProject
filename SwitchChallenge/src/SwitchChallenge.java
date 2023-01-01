public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(NATO('X'));
    }
    public static String NATO(char alphabets){
        switch(alphabets){
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default :
                return "Not found";
        }
    }
}

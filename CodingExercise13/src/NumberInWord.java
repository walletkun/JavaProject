public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
    }
    public static void printNumberInWord(int num){
        String name;
        switch(num){
            case 0:
                name = "ZERO";
                break;
            case 1:
                name = "ONE";
                break;
            case 2:
                name = "TWO";
                break;
            case 3:
                name = "THREE";
                break;
            case 4:
                name = "FOUR";
                break;
            case 5:
                name = "FIVE";
                break;
            case 6:
                name = "SIX";
                break;
            case 7:
                name = "SEVEN";
                break;
            case 8:
                name = "EIGHT";
                break;
            case 9:
                name = "NINE";
                break;
            default:
                name = "OTHER";
                break;
        }
        System.out.println(name);
    }
}

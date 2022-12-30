public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int x, int y, int z) {
        if (x >= 13 && x <= 19) {
            return true;
        }
        else if (y >= 13 && y <= 19) {
            return true;
        }
        else if (z >= 13 && z <= 19) {
            return true;
        }
        else{
            return false;
        }
    }
    public  static boolean isTeen(int x1){
            if(x1 >= 13 && x1<=19){
                return true;
            }
            else{
                return false;
            }
    }
}

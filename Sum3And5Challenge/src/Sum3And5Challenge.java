public class Sum3And5Challenge {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter+=1;
                sum += i;
                System.out.println("Found matches = " +i);
                if(counter == 5){
                    break;
                }
            }
        }
        System.out.println("Sum = " +sum);
    }
}

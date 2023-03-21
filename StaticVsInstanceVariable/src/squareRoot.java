public class squareRoot {
    public static double findSqrt(double x){
        if(x < 2)
            return x;

        double y = x;
        double z = (y + (x/y))/2;

        while(Math.abs(y - z ) >= 0.0001){
            y = z;
            z = (y + (x/y))/2;
        }
        return Math.floor(z);
    }

    public static void main(String[] args) {

        double answer = myPow(2, 10);
        System.out.println(answer);
    }

    public static double myPow(double x, int n){
        if(n == 1){
            return x;
        }
        else if(n == 0){
            return 1;
        }
        int i = 0;
        while(i < n){
            i++;
            x = x * x;
            if(i == n)
                break;
        }

        return x;
    }
}

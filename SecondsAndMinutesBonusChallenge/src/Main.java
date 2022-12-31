public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(7200));
        System.out.println(getDurationString(50, 59));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Input (" + seconds + "), must be a positive integer.";
        }
        return getDurationString(seconds /60, seconds%60);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        if (minutes < 0) {
            return "Invalid Input (" + minutes + "),must be a positive Integer";
        }
        else if (seconds < 0 || seconds > 59) {
            return "Invalid Input (" + seconds + "),must be an integer between 0 and 59";
        }
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}


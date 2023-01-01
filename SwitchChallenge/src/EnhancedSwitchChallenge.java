public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(printWeekDay(0));
        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));
    }


    public static String printWeekDay(int day){
        String dayofWeek = "Invalid Day";
            if(day == 0){
                dayofWeek =  "Sunday";
            }
            else if(day == 1){
                dayofWeek =  "Monday";
            }
            else if(day == 2){
                dayofWeek =  "Tuesday";
            }
            else if(day == 3){
                dayofWeek =  "Wednesday";
            }
            else if(day == 4){
                dayofWeek =  "Thursday";
            }
            else if(day == 5){
                dayofWeek = "Friday";
            }
            else if(day == 6){
                dayofWeek = "Saturday";
            }
            else{
                return day + " stands for " +dayofWeek;
            }
        return day+ " stands for " +dayofWeek;

    }
    public static void printDayOfWeek(int day) {
        String dayofWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield "Invalid Value";
            }
        };
        System.out.println(day+ " stands for " +dayofWeek);
    }
}

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(5,2020));
    }
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                }else{
                    return true;
                }
            } else{
                return false;
            }
        }
        else{
            return false;
        }
        return false;
    }
    public static int getDaysInMonth(int month , int year){
        if(month < 1 || month > 12){
            return -1;
        }
        else if(year < 1 || year > 9999){
            return -1;
        }

        int days = 28;
        switch(month){
            case 1:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return 31;
                }
            case 2:
                if(isLeapYear(year)){
                    return days += 1;
                }
                else{
                    return days;
                }
            case 3:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return days;
                }
            case 4:
                if(isLeapYear(year)){
                    return days += 1;
                }
                else{
                    return days;
                }
            case 5:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return days;
                }
            case 6:
                if(isLeapYear(year)){
                    return days += 1;
                }
                else{
                    return days;
                }
            case 7:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return days;
                }
            case 8:
                if(isLeapYear(year)){
                return days += 1;
            }
                else{
                return days;
            }
            case 9:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return days;
                }
            case 10:
                if(isLeapYear(year)){
                    return days += 1;
                }
                else{
                    return days;
                }
            case 11:
                if(isLeapYear(year)){
                    return days += 3;
                }
                else{
                    return days;
                }
            case 12:
                if(isLeapYear(year)){
                    return days += 1;
                }
                else{
                    return days;
                }
            default:
                break;
        }
        return getDaysInMonth(month,year);
    }
}

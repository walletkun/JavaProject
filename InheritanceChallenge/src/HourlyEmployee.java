public class HourlyEmployee extends Employee {

    private int hourlyPayRate = 16;

    private final int workTime = 40;

    private double hours;


    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hours) {
        super(name, birthDate, hireDate);
        this.hours = hours;
    }

    @Override
    public double collectPay() {
        double regularPay = hours * hourlyPayRate;
        if(hours > workTime)
            return getDoublePay();
        else
            return regularPay;
    }


    public double getDoublePay() {
        double regularPay = hours * hourlyPayRate;
        double overTime = 0;
        int j = 32;
        int k = 0;
        while(hours > workTime) {
            hours--;
            k++;
            overTime = j * k;
            regularPay = hours * hourlyPayRate;
        }
        return regularPay + overTime;
    }
}

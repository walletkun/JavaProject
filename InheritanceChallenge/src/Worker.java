public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        //Udemy Course Way of doing it
        //int currentYear = 2023;
        //int birthYear = Integer.parseInt(birthDate.substring(6));
        //return (currentYear - birthYear);
        //My way of doing it
        return 2023 - Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay() {

        return 0.0;
    }

    public void terminates(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}


public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary/26;
        double adjustPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int)adjustPay;
    }

    public void retired() {
        terminates("12/12/2025");
        isRetired = true;
    }
}

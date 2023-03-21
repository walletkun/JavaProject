public class Main {

    public static void main(String[] args) {

        Employee fei = new Employee("Fei Lin" , "04/23/2002",
                "11/20/2020");
        System.out.println(fei);
        System.out.println("Age = " + fei.getAge());
        System.out.println("Pay = " + fei.collectPay());

        Employee mei = new Employee("Mei Chen" , "09/15/2002", "01/25/2020");
        System.out.println(mei);


        SalariedEmployee perry = new SalariedEmployee("Perry", "03/15/1977",
                "01/25/2019",35000);
        System.out.println("Perry's paycheck = $"+ perry.collectPay());

        perry.retired();
        System.out.println("Perry's pension check = $" + perry.collectPay());


        HourlyEmployee andy = new HourlyEmployee("Andy Zheng" , "10/16/2002" , "12/15/2021" ,
                17.5);
        System.out.println(andy.collectPay());


    }
}

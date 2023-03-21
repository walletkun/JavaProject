public class Main {
    public static void main(String[] args) {
//        Dog rex = new Dog("rex"); //create instance (rex)
//        Dog fluffy = new Dog("fluffy"); //create instance (fluffy)
//        rex.printName(); //prints fluffy
//        fluffy.printName(); //prints fluffy

        //Calculator Class (static class)
        Calculator.printSum(5,10); // static methods are called as className.methodName();
        printHello();                    //or methodName(); only if in the same class, shorter than Main.printHello();
        System.out.println(Calculator.circumference(6,10));



        //Instance Class Example:
        Dog rex = new Dog();
        rex.bark();

    }
    public static void printHello(){
        System.out.println("Hello");
    }
}

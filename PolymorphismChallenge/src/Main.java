public class Main {

    public static void main(String[] args) {
        Car toyota = new Car("Camry 2020");
        runRace(toyota);

        Car ferrari = new GasPoweredCar("La Ferrari 2016", 65, 8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Tesla Model 3 " , 569, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8 , 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}

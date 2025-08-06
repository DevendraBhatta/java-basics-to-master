public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2025 Red Ferrari car 296 GTS",15.24,6);runRace(ferrari);
        runRace(ferrari);

        Car tesla = new ElectricCar("2025 Red Tesla Model 3",568,75);
        runRace(tesla);

        Car hyundaiHybrid = new HybridCar("Hyundai Creata Hybrid",76,22,8);
        runRace(hyundaiHybrid);


    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
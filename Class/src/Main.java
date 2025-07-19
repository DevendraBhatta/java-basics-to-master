public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Tesla");
        car.setModel("Carerar");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);


        System.out.println("make " + car.getMake());
        System.out.println("model " + car.getModel());
        car.describeCar();
    }
}

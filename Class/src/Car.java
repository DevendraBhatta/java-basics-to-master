public class Car {
    // fields or state
    private String make = "Tesla";
    private String model = "Model x";
    private String color = "Gray";
    private int doors = 2;
    private boolean isConvertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    // method or behaviour or function
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " Color " +
                model + " Model " +
                make + " Make" +
                (isConvertible ? " Convertible" : " Not Convertible"));
    }

}

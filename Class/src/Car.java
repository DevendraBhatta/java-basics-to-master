public class Car {
    // fields or state
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isConvertible;

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
        if (make == null) {
            make = "Unknown";
        }
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = lowerCaseMake;
            default -> {
                this.make = "Unsupported";
            }
        }
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

public class Item {

    private String type;
    private String name;
    private Double price;
    private String size = "MEDIUM";

    public Item(String type, String name, Double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }


    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public Double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 50;
            case "LARGE" -> getBasePrice() + 50;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }


    public String getType() {
        return type;
    }


    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f %n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }


}

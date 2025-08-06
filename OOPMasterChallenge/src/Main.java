public class Main {
    public static void main(String[] args) {

        Order regularOrder = new Order();
        regularOrder.printItemizedList();

        Order seconOrder = new Order("turkey","7-Up","chili");
        seconOrder.addBurgerToppings("Lettuce","cheese","Mayo");
        seconOrder.setDrinkSize("small");
        seconOrder.printItemizedList();

    }
}

public class Main {
    public static void main(String[] args) {
        Order orderMeal = new Order("deluxe", "7-up", "chili");
        orderMeal.addBurgerToppings("avocado", "bacon", "lettuce", "cheese", "mayo");
        orderMeal.setDrinkSize("small");
        orderMeal.printItemizedList();
    }
}

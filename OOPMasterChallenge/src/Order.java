public class Order {

    private Burger burger;
    private Item drink;
    private Item sideItem;

    public Order() {
        this("regular", "coke", "fries");
    }

    public Order(String burger, String drinkType, String sideType) {
        this.burger = new Burger("Regular Burger", 200.0);
        this.drink = new Drink("Coke", drinkType, 100.0);
        this.sideItem = new SideItem("side", sideType, 50.0);
    }


    public double getTotalPrice() {
        return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addTopping(extra1, extra2, extra3);

    }

    public void setDrinkSize(String size) {

        drink.setSize(size);
    }

    public void printBill() {
        String[] itemName = new String[]{burger.getName(), drink.getName(), sideItem.getName()};
        // int[] qty = {burger.getQty(), drink.getQty(), sideItem.getQty()};
        Double[] price = {burger.getAdjustedPrice(), drink.getAdjustedPrice(), sideItem.getAdjustedPrice()};

        double total = 0;

        System.out.println("==================================");
        System.out.println("           SuperMart Bill      ");
        System.out.println("==================================");
        System.out.printf("%-15s %-5s %-12s%n", "Item", "Qty", "Price");

        for (int i = 0; i < itemName.length; i++) {
            // double itemTotal = qty[i] * price[i];
            //total = total + itemTotal;
            //System.out.printf("%-15s %-5d %-9.2f%n", itemName[i], qty[i], price[i]);
        }
        System.out.println("----------------------------------");
        System.out.printf("%-21s:%-9.2f %n", "Total", total);
        System.out.println("==================================");

    }

}

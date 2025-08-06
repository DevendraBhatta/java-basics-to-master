public class DeluxeBurger extends Burger{


    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, Double price, Item deluxe1, Item deluxe2) {
        super(name, price);
        this.deluxe1 = deluxe1;
        this.deluxe2 = deluxe2;
    }


    @Override
    public void addTopping(String extra1, String extra2, String extra3) {
        super.addTopping(extra1, extra2, extra3);
    }
}

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator icebox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        icebox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {
        brewMaster.setHasToDoWork(coffeeFlag);
        icebox.setHasTODoWork(fridgeFlag);
        dishWasher.setHasToDoWork(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();

    }
}

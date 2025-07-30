public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasToDoWork(true);
//        kitchen.getIcebox().setHasTODoWork(true);
//        kitchen.getBrewMaster().setHasToDoWork(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIcebox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

    }
}

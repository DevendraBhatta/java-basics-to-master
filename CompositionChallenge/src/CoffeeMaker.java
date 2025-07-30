public class CoffeeMaker {

    private boolean hasToDoWork;



    public void setHasToDoWork(boolean hasToDoWork) {
        this.hasToDoWork = hasToDoWork;
    }

    public void brewCoffee() {
        if (hasToDoWork) {
            System.out.println("Brewing Coffee...");
            hasToDoWork = false;
        }
    }

}

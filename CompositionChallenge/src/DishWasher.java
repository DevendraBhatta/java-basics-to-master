public class DishWasher {

    private boolean hasToDoWork;

    public void setHasToDoWork(boolean hasToDoWork) {
        this.hasToDoWork = hasToDoWork;
    }


    public void doDishes() {

        if (hasToDoWork) {
            System.out.println("Washing Dishes..");
            hasToDoWork = false;
        }
    }
}

public class Refrigerator {

    private boolean hasTODoWork;

    public void setHasTODoWork(boolean hasTODoWork) {
        this.hasTODoWork = hasTODoWork;
    }


    public void orderFood() {
        if (hasTODoWork) {
            System.out.println("Ordering Food");
            hasTODoWork = false;
        }
    }
}

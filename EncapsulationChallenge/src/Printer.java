public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        if (tonerLevel <= 0) {
            this.tonerLevel = 0;
        } else if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount < 0 || tempAmount > 100) {
            return -1;
        }
        tonerLevel = tonerLevel + tonerAmount;
        return tonerLevel;
    }


    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted = pagesPrinted + jobPages;
        tonerLevel = (duplex) ? (int) (tonerLevel - 2 * 0.5) : (int) (tonerLevel - pages * 0.5);
        return jobPages;
    }
}

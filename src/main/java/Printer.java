public class Printer {
    private int paper;
    private int toner;

    public Printer() {
        this.paper = 0;
        this.toner = 0;
    }

    public int getToner() {
        return toner;
    }
    // set toner makes creating test easier
    public void setToner(int numToner) {
        this.toner = numToner;
    }
    public void addsToner(int addedToner) {
        this.toner = this.toner + addedToner;
    }

    public int getPaper() {
        return paper;
    }
    //set paper added to make setting up the test easier.
    public void setPaper(int numPaper) {
        paper = numPaper;
    }
    public void addsPaper(int paperAdded) {
        paper = paper + paperAdded;
    }


//created a string return as in the 'real' world some kind of return is likely to be needed.
    public String print(int numPages, int numCopies) {
        int pagesToPrint = numPages * numCopies;
        if (pagesToPrint <= paper && pagesToPrint <= toner) {
            paper = paper - pagesToPrint;
            toner = toner - pagesToPrint;
            return "Print Complete";
        } else { return "Not enough Resources";}
    }



}

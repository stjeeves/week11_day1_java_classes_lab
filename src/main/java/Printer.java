public class Printer {

    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int totalPaper() {
        return this.paper;
    }

    public int print(int numPages, int numCopies) {
        if (this.paper >= (numPages * numCopies)) this.paper -= (numPages * numCopies);
        return this.paper;
    }
}

public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = 1500;
    }

    public int getPaper(){
        return this.sheetsOfPaper;
    }

    public void print(int pages, int copies){
        int totalSheetsRequired = pages * copies;
        if (this.sheetsOfPaper >= totalSheetsRequired && this.tonerVolume >= totalSheetsRequired){
            this.tonerVolume -= totalSheetsRequired;
            this.sheetsOfPaper -= totalSheetsRequired;
        }
    }

    public void refillPaper(){
        this.sheetsOfPaper = 100;
    }

    public int getToner(){
        return this.tonerVolume;
    }
}

public class Printer {

    private int sheetsOfPaper;
    private int toner;

    public Printer(int sheetsOfPaper, int toner){
        this.sheetsOfPaper = sheetsOfPaper;
        this.toner = toner;
    }

    public int getSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public int tonerVolume(){
      return this.toner;
    }

    public void print(int pages,int copies){
        if(pages * copies <= sheetsOfPaper){
            this.sheetsOfPaper -= pages * copies;
            this.toner -= pages * copies;
        }
    }
}

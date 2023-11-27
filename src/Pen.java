public class Pen {
    private String inkColour;
    private int numPensPurchased, purchasePricePerPen,
            salePricePerPen, numPensSold;

    public Pen(String inkColour, int purchasePricePerPen, int salePricePerPen) {
        this.inkColour = inkColour;
        this.purchasePricePerPen = purchasePricePerPen;
        this.salePricePerPen = salePricePerPen;
        this.numPensPurchased = 0 ;
        this.numPensSold = 0 ;
    }

    public Pen(String inkColour, int numPensPurchased, int purchasePricePerPen, int salePricePerPen) {
        this.inkColour = inkColour;
        this.numPensPurchased = numPensPurchased;
        this.purchasePricePerPen = purchasePricePerPen;
        this.salePricePerPen = salePricePerPen;
        this.numPensSold = 0 ;
    }

    public void purchasePens(int numPens)
    {
        numPensPurchased += numPens;
    }

    public void sellPens(int numPens)
    {
        numPensSold += numPens;
    }

    public int calculateProfit()
    {
        return numPensSold * (salePricePerPen - purchasePricePerPen);
    }

    public void printDetails()
    {
        System.out.println("\nPen: "+inkColour+"\t"+"Copies: "+numPensPurchased+"\t");
        System.out.println("Bought by: "+purchasePricePerPen+"$\t");
        System.out.println("Sold Copies: "+numPensSold+"\t"+"price: " + salePricePerPen+"$\t");
        System.out.println("Profit is: "+calculateProfit());
    }



}



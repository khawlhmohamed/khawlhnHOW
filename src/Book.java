public class Book {
    private String title;
    private int numCopiesPurchased, purchasePricePerCopy,
            salePricePerCopy, numCopiesSold;

    public Book(String title, int purchasePricePerCopy, int salePricePerCopy) {
        this.title = title;
        this.purchasePricePerCopy = purchasePricePerCopy;
        this.salePricePerCopy = salePricePerCopy;
        this.numCopiesPurchased = 0 ;
        this.numCopiesSold = 0 ;
    }

    public Book(String title, int numCopiesPurchased, int purchasePricePerCopy, int salePricePerCopy) {
        this.title = title;
        this.numCopiesPurchased = numCopiesPurchased;
        this.purchasePricePerCopy = purchasePricePerCopy;
        this.salePricePerCopy = salePricePerCopy;
        this.numCopiesSold = 0 ;
    }

    public void purchaseCopies(int numPens)
    {
        numCopiesPurchased += numPens;
    }

    public void sellCopies(int numPens)
    {
        numCopiesSold += numPens;
    }

    public int calculateProfit()
    {
        return numCopiesSold * (salePricePerCopy - purchasePricePerCopy);
    }

    public void printDetails()
    {

        System.out.println("\nBook: "+title+"\t"+"Copies: "+numCopiesPurchased+"\t");
        System.out.println("Bought by: "+purchasePricePerCopy+"$\t");
        System.out.println("Sold Copies: "+numCopiesSold+"\t"+"price:" + salePricePerCopy+"$\t");
        System.out.println("Profit is: "+calculateProfit());
    }
}

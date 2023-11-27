public class Shop {
    public static void main(String[] args) {
        Book book1 = new Book("Pigs may fly", 100, 120);
        Book book2 = new Book("Pigs can't fly", 75, 100);
        Book book3 = new Book("Pigs must not fly", 10, 75, 100);

        Pen pen1, pen2;
        pen1 = new Pen("Black", 10, 10, 15);
        pen2 = new Pen("Blue", 10, 15);

        book1.purchaseCopies(10);
        book2.purchaseCopies(10);
        pen2.purchasePens(10);

        book1.sellCopies(5);
        book2.sellCopies(2);
        book3.sellCopies(1);

        pen1.sellPens(10);
        pen2.sellPens(3);

        //print a report
        System.out.println("Books Report");
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        System.out.println("====================================");

        System.out.println("Pens Report");
        pen1.printDetails();
        pen2.printDetails();
        System.out.println("====================================");

        System.out.print("\nTotal profit: ");
        int sum = book1.calculateProfit();
        sum += book2.calculateProfit();
        sum += book3.calculateProfit();
        sum += pen1.calculateProfit();
        sum += pen2.calculateProfit();
        System.out.println(sum + "$");


    }
}

public class Flower {

    //هذا السؤال رقم 17

    private String customer;
    private String bank;
    private int Limit;
    private double balance;
    public  Flower(String customer, String bank, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        Limit = limit;
        this.balance = balance;
    }

    public boolean charge(double price){
        if (price+balance>Limit){
            return false;
        }
        balance+=price;
        return true;
    }
    public void makePayment(double amount){
        if (amount>0){
            balance-=amount;
        }
    }


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        CreditCard2[] wallet = new CreditCard2[3];
        wallet[0] = new CreditCard2("john Bowman ","Californai Federal",3445,898.9);
        wallet[1] = new CreditCard2("john Bowman ", "Californai Federal", 98709, 670.9);
        wallet[2] = new CreditCard2("john Bowman ", "Californai Fenace", 54878, 5000.0);

        for (int i = 1; i <= 16; i++) {
            wallet[0].charge(3 * i);
            wallet[1].charge(2 * i);
            wallet[0].charge(i);
        }

        for (CreditCard2 card2 : wallet) {
            System.out.println(card2);
            while (card2.getBalance()> 200) {
                card2.makePayment(200);
                System.out.println("New balance = " + card2.getBalance());

            }
        }
    }
}


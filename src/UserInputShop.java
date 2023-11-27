import java.util.Scanner ;
public class UserInputShop {
    public static void main(String[] args) {
        Scanner userIntInput = new Scanner(System.in) ;
        Scanner userStringInput = new Scanner(System.in) ;

        while (true){
            System.out.println("Welcome to Books & Pens Shop !");
            System.out.println("==============================");
            System.out.println("please enter 1 to add book or 2 to add pen:");

            int userChoice = userIntInput.nextInt();

            if (userChoice == 1){
                System.out.println("please enter the following data: ");

                System.out.print("enter book title: ");
                String title = userIntInput.next();

                System.out.print("enter number copies purchase: ");
                int numCopiesPurchase = userIntInput.nextInt();

                System.out.print("enter purchase price per copy: ");
                int purchasePricePerCopy = userIntInput.nextInt();

                System.out.print("enter sale price per copy: ");
                int salePricePerCopy = userIntInput.nextInt();

                Book book = new Book(title,numCopiesPurchase,purchasePricePerCopy,salePricePerCopy) ;
                System.out.println("Book added successfully !");
                break;
            }

            else if (userChoice == 2) {

                System.out.println("please enter the following data: ");

                System.out.print("enter pen color: ");
                String color = userIntInput.next();

                System.out.print("enter number pens purchase: ");
                int numPensPurchase = userIntInput.nextInt();

                System.out.print("enter purchase price per pen: ");
                int purchasePricePerPen = userIntInput.nextInt();

                System.out.print("enter sale price per pen: ");
                int salePricePerPen = userIntInput.nextInt();

                Pen pen = new Pen(color,numPensPurchase,purchasePricePerPen,salePricePerPen) ;
                System.out.println("Pen added successfully !");
                break;


            }

            else {
                System.out.println("please enter a valid number \'1\' or \'2\' ");
                continue;

            }
        }


    }
}

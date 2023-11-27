import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an integer :");

        int intValue = scanner.nextInt();


        System.out.println("Enter a boolean true or false :");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter a character :");
        char charValue = scanner.next().charAt(0);

        System.out.println("Enter a double :");
        double doubleValue = scanner.nextDouble();


        System.out.println("Enter an integer :" + intValue);
        System.out.println("Enter a boolean true or false :" + booleanValue);
        System.out.println("Enter a character :" + charValue);
        System.out.println("Enter a double :" + doubleValue);

    }
}

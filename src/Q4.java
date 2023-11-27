import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int x []=new  int[5];
        Scanner input =new Scanner(System.in);
        for (int i = 0; i < x.length ; i++){
            x[i]=input.nextInt();

        }
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }
}

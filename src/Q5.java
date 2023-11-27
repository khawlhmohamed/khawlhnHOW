import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[] num = {45, 80, 87, 90};
        print(num);
        input(num);
        print(num);
    }

    public static void print(int x[]) {
    }

    public static void input(int x[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
        }
    }
}







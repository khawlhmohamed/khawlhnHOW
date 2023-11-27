public class Q12 {

    public static void main(String[] args) {
        int n = 10;
        int sum =getSum(n);
        System.out.println("The sum of all positive integers less  than or equal to " +  n  + " is : " + sum );
    }
    public static int getSum(int n ){
        int sum=0;
        for (int i =1;i<=n; i++){
            sum+=i;
        }
        return sum;
    }

}



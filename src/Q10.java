public class Q10 {

        public static boolean isMultiple(long n ,long m) {
            if (m == 0) {
                    return false;
                }

                return n %m==0;
            }

            public static void main(String[] args) {
                long n=10;
                long m = 5;
                boolean isNMultipleOfM=isMultiple(n,m);
                System.out.println(" Is " + n +" a multiple of " + m +" isNMultiple " + isNMultipleOfM );
            }
        }


public class Q11 {

    public static boolean isEven(int i) {
        if ((i & 1) == 0) {
            return true;
        } else
            return false;
    }

    public static void main (String[]args){
        int i = 10;
        boolean isEvenNumber = isEven(i);
        System.out.println("Is " + i + " an even number ? " + isEvenNumber);

    }
}



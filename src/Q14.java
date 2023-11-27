public class Q14 {

    public static String removePunctuation(String s){
        StringBuilder sb= new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)||Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence="let's try,Mike!";
        String result= removePunctuation(sentence);
        System.out.println(result);
    }
}



public class Q13 {

    public static int countVowels(String input){
        int count=0;
        String vowels="aeiouAEIOU";
        for (int i=0;i<input.length();i++){
            if (vowels.contains(String.valueOf(input.charAt(i))))
            {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input="Hello, World! ";
        // String input="aeiouAEIOU ";

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels : " + vowelCount);
    }
}



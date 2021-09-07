import java.util.Arrays;

public class App {

    public static String proper_case(String sentence) {
        String[] words = sentence.split(" ");
        // C
        for (String word : words) {
            // Check if all uppercase
            String new_word = "";
            boolean all_upper_case = true;
            for(int i=0;i < word.length();i++) {
                char character = word.charAt(i);
            }
            if(all_upper_case) {
                continue;
            }
            // If word length > 3, capitalize first lower case rest
            if (word.length() > 3) {
                for(int i=0;i < word.length();i++) {
                    char character = word.charAt(i);
                    if(i == 0) {
                        character = Character.toUpperCase(character);
                    }
                    if(i > 0) {
                        character = Character.toLowerCase(character);
                    }
                    new_word = new_word + character;
                }
            }
            // If word length < 3, lowercase all
            if (word.length() < 3) {
                for(int i=0;i < word.length();i++) {
                    char character = word.charAt(i);
                    character = Character.toLowerCase(character);
                    new_word = new_word + character;
                }
            }
            word = new_word;
        }
        return System.out.println(Arrays.toString(words));
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

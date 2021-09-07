import javax.swing.text.html.HTML;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class MainVowels {

    public static String getVowels(String str) {
        String res = "";
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'æ', 'ø' , 'å'));
        char[] charr =  str.toCharArray();

        Set<Character> chset = new HashSet<>();
        for (char c: charr) {
            //System.out.println(c);
            boolean b = vowels.contains(c);
            if (b) {
                //res += c;
                chset.add(c);
            }
        }
        res = chset.toString();
        return res;
    }

    public static void main(String[] args) {
        String vw = getVowels("Jeg er en hårdtarbejdende studerende");
        System.out.println(vw);

        vw = getVowels("Jeg er høne");
        System.out.println(vw);

        vw = getVowels("Jeg er hund");
        System.out.println(vw);



    }
}

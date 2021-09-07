import javax.swing.text.html.HTML;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Main {


    public static Map<String, Integer> readUrl(String url) throws Exception {
        URL dr = new URL("https://www.dr.dk/");
        BufferedReader br = new BufferedReader(new InputStreamReader(dr.openStream()));
        //InputStreamReader inp =  new InputStreamReader(dr.openStream());
        String afg = "Afghanistan";
        String h1 = "h1";
        String urlstr = "";
        int sum = 0;

        Map<String, Integer> mpord = new HashMap<>();
        mpord.put(afg, 0);
        mpord.put(h1,0);

        while (urlstr != null) {
            int ii = urlstr.indexOf(h1);
            if (ii > 0) {
                Integer i2 = mpord.get(h1);
                i2++;
                mpord.put(h1,i2);
            }
            int ii3 = urlstr.indexOf(afg);
            if (ii3 > 0) {
                Integer i22 = mpord.get(afg);
                i22++;
                mpord.put(afg,i22);
            }
            //System.out.println(urlstr);
            urlstr = br.readLine();
        }
        br.close();
        System.out.println("sum = " + sum);

        return mpord;
    }


    public static void main(String[] args) throws Exception {


        Map<String, Integer> mapo = readUrl("hej");

        Set<String> sset = mapo.keySet();
        for (String s: sset) {
            int n = mapo.get(s);
            String sn = "der står " + s + " " + n + " gange";
            System.out.println(sn);
        }

        System.exit(1);

        Map<String, HTMLTag> map = new HashMap<>();
        PTag p1 = new PTag("p1", "jeg er p1");
        PTag p2 = new PTag("p2", "jeg er p2");

        map.put(p1.getId(), p1);
        map.put(p2.getId(), p2);

        HTMLTag ht1 = map.get("p1");
        ht1.print();


    }
}

import javax.swing.text.html.HTML;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class MainSet {

    public static void main(String[] args) {

        Set<String> strset = new HashSet<>();
        strset.add("erik");
        strset.add("jon");
        System.out.println("size=" + strset.size());

        strset.add("erik");
        strset.add("jon");
        System.out.println("size=" + strset.size());

        Boolean b= strset.contains("erik");
        System.out.println(b);

        System.out.println("2".compareTo("11"));

        String s1 = "2";
        String s2 = "11";
        int b2 = s1.compareTo(s2);
        Integer i1 = Integer.parseInt(s1);
        Integer i2 = Integer.parseInt(s2);
        System.out.println(b2);
        int b3 = i1.compareTo(i2);
        System.out.println(b3);

        Set<HTMLTag> pset = new HashSet<>();
        PTag p1 = new PTag("p1", "jeg er p1");
        PTag p2 = new PTag("p2", "jeg er p2");
        pset.add(p1);
        pset.add(p2);
        PTag p3 = new PTag("p1", "jeg er p1");
        PTag p4 = new PTag("p2", "jeg er p2");
        pset.add(p3);
        pset.add(p4);

        pset.clear();

        for (int i = 0; i < 100; i++) {
            PTag pmany = new PTag("p"+i, "jeg er ptag id=p" + i);
            pset.add(pmany);
        }

        PTag ptt = new PTag("p1", "hadf");
        Boolean bb = pset.contains(ptt);

        Set<HTMLTag> sortset = new TreeSet<>(pset);

        for (HTMLTag t: sortset) {
            t.print();
        }



    }
}

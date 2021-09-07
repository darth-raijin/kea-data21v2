import javax.swing.text.html.HTML;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class MainColor {

    public static void main(String[] args) {


        PTag p1 = new PTag("p1", "jeg er p1");
        PTag p2 = new PTag("p2", "jeg er p2");
        PTag p3 = new PTag("p3", "jeg er p3");

        ArrayList<HTMLTag> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);

        int ix = lst.indexOf(p1);
        System.out.println(ix);

        PTag pt4 = new PTag("p2", "afd");
        int ix2 = lst.indexOf(pt4);
        System.out.println(ix2);

        lst.remove(0);

        for (HTMLTag ht: lst) {
            ht.print();
        }

        lst.clear();
        for (int i = 1; i<=4; i++) {
            HeaderTag ht = new HeaderTag("h" + i, "Jeg er en h" + i + " tag", i);
            ht.setColor(Style.colors.get(i-1));
            lst.add(ht);
            for (int j = 1; j<=4; j++) {
                PTag pt3 = new PTag("p" + i + j, "Jeg er en p tag");
                lst.add(pt3);
            }

        }

        System.out.println(lst.size());
        Iterator<HTMLTag> ite = lst.iterator();
        while (ite.hasNext()) {
            if (ite.next() instanceof PTag) {
                ite.remove();
            }
        }

        for (HTMLTag ht: lst) {
            ht.print();
        }

        System.exit(1);

        System.out.println("sizeeeeee = " + lst.size());
        for (int i = lst.size()-1; i>=0; i--) {
            HTMLTag ht5 = lst.get(i);
            if (ht5 instanceof PTag) {
                lst.remove(ht5);
            }
        }

        System.out.println("siz22222 = " + lst.size());

        for (HTMLTag ht: lst) {
            ht.print();
        }

    }
}

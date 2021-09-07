import javax.swing.text.html.HTML;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        HeaderTag ht1 = new HeaderTag("h1-1","Jeg er en h1 tag", 1);
        System.out.println(ht1);

        HeaderTag ht2 = new HeaderTag("h2-1","Jeg er en h2 tag", 2);

        ArrayList<HTMLTag> lst = new ArrayList();
        lst.add(ht1);
        lst.add(ht2);
        PTag pt = new PTag("p1-1", "Jeg er en ptag");
        lst.add(pt);

        System.out.println(lst.size());

        lst.clear();
        for (int i = 1; i<=4; i++) {
            HeaderTag ht = new HeaderTag("h" + i, "Jeg er en h" + i + " tag", i);
            ht.setColor(Style.colors.get(i-1));
            lst.add(ht);
            for (int j = 1; j<=2; j++) {
                PTag pt3 = new PTag("p" + i + j, "Jeg er en p tag");
                lst.add(pt3);
            }
        }


        for (HTMLTag tg: lst) {
            tg.print();
        }

        //System.out.println(ht1.getClass().getName());



    }
}

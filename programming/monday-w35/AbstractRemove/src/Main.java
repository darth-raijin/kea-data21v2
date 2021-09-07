import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        PTag pt1 = new PTag("p1", "jeg er en p1 tag");
        PTag pt2 = new PTag("p2", "jeg er en p2 tag");

        ArrayList<HTMLTag> lst = new ArrayList<>();
        lst.add(pt1);
        lst.add(pt2);

        int ix = lst.indexOf(pt1);

        System.out.println(ix);

        PTag pt3 = new PTag("p2", "jeg er en p1 tag");
        ix = lst.indexOf(pt3);
        System.out.println(ix);

        boolean b = lst.contains(pt3);
        System.out.println(b);

        System.out.println("size=" + lst.size());
        lst.remove(pt3);
        System.out.println("size=" + lst.size());

        for (int i = 1; i<= 4; i++) {
            HeaderTag ht3 = new HeaderTag("h" + i, "Jeg er en h" + i, i);
            lst.add(ht3);
            for (int j = 0; j<4; j++) {
                PTag pt4 = new PTag("p"+i*1+ + j, "jeg er en p tag " + i);
                lst.add(pt4);
            }
        }

        System.out.println("size=" + lst.size());


        Iterator<HTMLTag> ite = lst.iterator();
        while (ite.hasNext()) {
            HTMLTag tg = ite.next();
            if (tg instanceof PTag) {
                ite.remove();
            }
        }

        System.out.println("size after=" + lst.size());

        for (HTMLTag tag: lst) {
            tag.print();
        }


        System.exit(1);

        for (int i = lst.size()-1; i>=0; i--) {
            HTMLTag tag = lst.get(i);
            if (tag instanceof PTag) {
                lst.remove(i);
            }
        }
        System.out.println("size after=" + lst.size());

        for (HTMLTag tag: lst) {
            tag.print();
        }

    }
}

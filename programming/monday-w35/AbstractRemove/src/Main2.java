import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        HeaderTag ht = new HeaderTag("h1-2", "Jeg er et h1 tag", 1);

        HeaderTag ht2 = new HeaderTag("","",1);
        ht2.setId("h1-3");
        ht2.setText("Jeg er et h1 tag");
        ht2.setNumber(1);

        ht2.print();

        ArrayList<HTMLTag> lst = new ArrayList<>();
        lst.add(ht);
        lst.add(ht2);

        System.out.println("size=" + lst.size());

        PTag pt = new PTag("p1", "Jeg er en ptag");
        lst.add(pt);

        for (int i = 1; i<= 4; i++) {
            HeaderTag ht3 = new HeaderTag("h" + i, "Jeg er en h" + i, i);
            ArrayList<String> lstcol = HTMLStyle.colors;
            ht3.setColor(lstcol.get(i-1));
            lst.add(ht3);
            for (int j = 0; j<4; j++) {
                PTag pt3 = new PTag("p"+i*1+ + j, "jeg er en p tag " + i);
                lst.add(pt3);
            }
        }

        for (HTMLTag htt: lst) {
            htt.print();
        }

    }
}

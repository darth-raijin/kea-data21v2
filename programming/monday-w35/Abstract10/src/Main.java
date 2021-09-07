import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HeaderTag ht = new HeaderTag("h1-2", "Jeg er et h1 tag", 1);

        HeaderTag ht2 = new HeaderTag("","",1);
        ht2.setId("h1-3");
        ht2.setText("Jeg er et h1 tag");
        ht2.setNumber(1);

        ht2.print();

        ArrayList<HeaderTag> lst = new ArrayList<>();
        lst.add(ht);
        lst.add(ht2);

        System.out.println("size=" + lst.size());

        for (int i = 1; i<= 20; i++) {
            HeaderTag ht3 = new HeaderTag("h" + i, "Jeg er en h" + i, i);
            lst.add(ht3);
        }

        for (HeaderTag htt: lst) {
            htt.print();
        }

        ArrayList<ATag> aTags = new ArrayList<ATag>();
        for (int i = 1; i<= 20; i++) {
            ATag tag = new ATag("id" + i, "Link for " + i, "www." + i + ".com");
            aTags.add(tag);
        }
        
        for (ATag tag: aTags) {
            tag.print();
        }

    }
}

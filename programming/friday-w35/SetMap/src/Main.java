import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HeaderTag ht = new HeaderTag("h1-2", "Jeg er et h1 tag", 1);

        HeaderTag ht2 = new HeaderTag("", "", 1);
        ht2.setId("h1");
        ht2.setText("Jeg er et h1 tag");
        ht2.setNumber(1);

        ht2.print();

        Set<HTMLTag> set = new HashSet<HTMLTag>();
        ArrayList<HTMLTag> tags = new ArrayList<>();

        // Creation of HeaderTag
        for (int i = 1; i <= 20; i++) {
            HeaderTag ht3 = new HeaderTag("h" + i, "Jeg er en h" + i, i);
            tags.add(ht3);
            set.add(ht3);
        }

        for (HTMLTag htt : tags) {
            htt.print();
        }

        // Creation of ATag
        ArrayList<ATag> aTags = new ArrayList<ATag>();
        for (int i = 1; i <= 20; i++) {
            ATag tag = new ATag("id" + i, "Link for " + i, "www." + i + ".com");
            aTags.add(tag);
            set.add(tag);
        }

        for (ATag tag : aTags) {
            tag.print();
        }



        /*
         * For hver <HTMLTag> i set Hvis
         */
        Comparator<HTMLTag> comparator = new Comparator<HTMLTag>() {
            @Override
            public int compare(final HTMLTag o1, final HTMLTag o2) {

                // If both are HeaderTags
                if (o1 instanceof HeaderTag && o2 instanceof HeaderTag) {
                    return letterRemover(o1.getId()) - letterRemover(o2.getId());
                }

                if (o1 instanceof HeaderTag || o2 instanceof HeaderTag) {
                    if (o1 instanceof HeaderTag) {
                        return -1;
                    } else {
                        return 1;
                    }
                } 
                
                return letterRemover(o1.getId()) - letterRemover(o2.getId());
            }
        };

        List<HTMLTag> sortedList = new ArrayList<>(set);
        
        Collections.sort(sortedList, comparator);
        for (HTMLTag tag : sortedList) {
            System.out.println(tag.getId());
        }

    }
    public static int letterRemover(String id) {
        return Integer.parseInt(id.replaceAll("[^\\d.]", ""));
    }
}

import java.util.Objects;

public abstract class HTMLTag implements Comparable<HTMLTag> {
    private String id;
    private String text;

    public HTMLTag(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    abstract String toHTMLString();

    abstract void print();

    @Override
    public boolean equals(Object o) {
        //return true; snyder til at alle er ens, så vi får kun 1 element i vores Set
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HTMLTag htmlTag = (HTMLTag) o;
        return id.equals(htmlTag.id);
    }

    @Override
    public int hashCode() {
        //return 1; tvinger til at kalde equals uanset hvad
        //return Objects.hash(System.nanoTime()); giver nyt id hvert 1mia del sekund.
        return Objects.hash(id);
    }

    @Override
    public int compareTo(HTMLTag o) {
        //return  this.id.compareTo(o.id); problem med at "9" er større end "89"
        Integer i1 = this.hashCode();
        Integer i2 = o.hashCode();
        return i1.compareTo(i2);
    }
}

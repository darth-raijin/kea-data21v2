import java.util.Objects;

public abstract class HTMLTag {
    private String id;
    private String text;

    public HTMLTag() {
    }

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HTMLTag htmlTag = (HTMLTag) o;
        return Objects.equals(id, htmlTag.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

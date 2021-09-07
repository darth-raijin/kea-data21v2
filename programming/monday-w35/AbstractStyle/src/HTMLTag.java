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

}

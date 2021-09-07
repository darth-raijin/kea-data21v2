public class PTag extends HTMLTag {

    public PTag(String id, String text) {
        super(id, text);
    }

    @Override
    String toHTMLString() {
        //<p>jeg er en p tag 1</p>
        return "<p>" + this.getText() + "</p>";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLString());
    }
}

public class HeaderTag extends Style {

    private int number;

    public HeaderTag(String id, String text) {
        super(id, text);
    }

    public HeaderTag(String id, String text, int number) {
        super(id, text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    String toHTMLString() {
        //<h1>Jeg er en h1 tag</h1>
        //<h1 id="h1" style="color:red">Jeg er en h1</h1>
        return "<h" + this.getNumber() + " " + this.toStyleString() + ">" + this.getText() +  "</h" + this.getNumber() + ">";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLString());
    }
}


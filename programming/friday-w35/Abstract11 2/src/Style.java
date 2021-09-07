import java.util.ArrayList;

public abstract class Style extends HTMLTag {

    private String color;

    public static ArrayList<String> colors;


    public Style(String id, String text) {
        super(id, text);
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("pink");
        colors.add("green");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toStyleString() {
        //<h1 id="h1" style="color:red">Jeg er en h1</h1>
        return "style=" + '"' + "color:" + this.getColor() + '"';
    }
}

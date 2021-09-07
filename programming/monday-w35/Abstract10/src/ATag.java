import java.util.ArrayList;

public class ATag extends HTMLTag {
    String url_link;
    
    public static ArrayList<ATag> urls;

    public ATag(String id, String text, String url_link) {
        super(id, text);
        this.url_link = url_link;

        urls = new ArrayList<ATag>();

    }

    @Override
    String toHTMLString() {
        return "<a id='" + this.getId() +"' href='" + url_link + "'>" + this.getText() + "</a>";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLString());
        
    }
    
}

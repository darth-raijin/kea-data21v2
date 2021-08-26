import java.util.ArrayList;

public class App {

    public static boolean doesArrayContain(ArrayList<String> list, String check) {
        for (String s : list) {
            if (s == check) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("deez");
        // Prints true
        System.out.println(doesArrayContain(list, "deez"));

        //Prints false
        System.out.println(doesArrayContain(list, "zeed"));
    }
}

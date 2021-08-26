import java.util.Scanner;

public class App {
    
    double growth_rate = 0.8;
    double current_height;
    double max_height;
 

    public static String should_cut(double current_height, double max_height) {
        // 1st solution is used, if and only if height is greater than max height
        double days_untill = current_height / max_height;
        String result = "";

        if (days_untill > 0) {
            result = "You should have cut it " + days_untill + " days ago!";
        }

        if (days_untill < 0) {
            result = "You should cut it in " + days_untill + " days!";
        }
        
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("How tall is your grass now: ");  
        double current_height = scanner.nextDouble();    
        
        System.out.print("How tall can your grass be: ");  
        double max_height = scanner.nextDouble();     

        System.out.print(should_cut(current_height, max_height));
        


    }
}
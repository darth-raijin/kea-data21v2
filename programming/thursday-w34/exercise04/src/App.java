import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int figures = scan.nextInt();

        System.out.println("Enter a single character you would like to use!: ");
        String character = scan.next();     

        for (int i = 0; i < figures; i++) {
            for (int j = 0; j < figures; j++) {
                System.out.print(character);
            }
            System.out.println("");
        }

    }
}

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Chapter2ScannerExample {
    //declare scanner to use the console
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "";
        String age = "";
        String iCost = "";
        double cCost = 0;
        double cost = 0;
        final double DISCOUNT_PCT = .15;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextLine();
        System.out.print("Enter cost of your laptop: ");
        iCost = scanner.nextLine();
        cCost = Double.parseDouble(iCost);
        //to display discount with comas and 2 decimal positions
        System.out.println("Hello " + name + ", you are" + age + " years old.");
        System.out.println("Your laptop costs $" + cCost);
        System.out.println("You recived a $" + cCost * DISCOUNT_PCT);

        //to display discount as currency, with commas and 2 decimal positions
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("You recived a $" +
                df.format(cCost * DISCOUNT_PCT) + " discount.");

        Locale locale = new Locale("en",  "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("You recived a " +
                currencyFormatter.format(cCost * DISCOUNT_PCT) + " Discount.");

        //System.out.println();       //print a blank line
        System.out.println("\n\n\nProgram is finished, have a nice day!");
    }
}

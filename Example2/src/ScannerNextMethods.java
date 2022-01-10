import java.util.Scanner;

public class ScannerNextMethods {
    //declare Scanner to use the console
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int iQty = 0;
        double iPrice = 0;
        double cTotal = 0;
        String iName = "";

        System.out.print("Enter number of widgets: ");
        iQty = scanner.nextInt();
        System.out.print("Enter price of widget: ");
        iPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Name of widget: ");
        iName = scanner.nextLine();

        System.out.println( "The name is " + iName);
        System.out.println( "Quantity is " + iQty);
        System.out.println( "Widget price is " + iPrice);
        cTotal = iQty * iPrice;
        System.out.println( "Total is " + cTotal);

    }
}

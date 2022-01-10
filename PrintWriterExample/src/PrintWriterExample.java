import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/*
Example using the PrintWriter class for output files.
Uses the String format for fixed length fields.
*/
public class PrintWriterExample {
    static String name;
    static double amount;
    static int age;

    static Scanner scanner;
    static PrintWriter pw;

    public static void main(String[] args) {
        init();
        input();
        output();
        closing();
    }

    private static void init() {
        scanner = new Scanner(System.in);
        try {
            pw = new PrintWriter(new FileOutputStream(new File("myFile.dat"), false));
        }
        catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Error");
        }
    }

    private static void input() {
        String iData;
        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("What is your age? ");
        iData = scanner.nextLine();
        try {
            age = Integer.parseInt(iData);
        }
        catch (Exception e) {
            System.out.println("Error in age entry.  Age assigned a value of 25.");
            age = 25;
        }

        System.out.println("What is your pay rate? ");
        iData = scanner.nextLine();
        try {
            amount = Double.parseDouble(iData);
        }
        catch(Exception e) {
            System.out.println("Error in amount. Amount assigned a value of 9.99.");
            amount = 9.99;
        }
    }

    private static void output() {
        String record;
        record = String.format("%-25s", name) + String.format("%02d",age) + String.format("%05.2f", amount);
        pw.println(record);
    }

    private static void closing() {
        pw.close();
    }
}











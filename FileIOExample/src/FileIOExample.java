/*
This program shows how to read input data from a data file
and writes a report to a .prt file using PrintWriter
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FileIOExample{
    //Variable declarations
    static String iData, iFirstName, iLastName, oPay;
    static int iHours, cEmpCtr=0;
    static double iRate, cPay, cEmpPayTot=0;
    static boolean eof = false;

    static PrintWriter pw;
    static Scanner payrollScanner;

    public static void main (String[] args) {
        init();
        while(!eof) {
            calcs();
            output();
            input();
        }
        totals();
        closing();
    }

    private static void closing() {
        pw.close();
        payrollScanner.close();
    }

    private static void init() {
        //Instantiate the input file
        try {
            payrollScanner = new Scanner(new File("payroll.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Error!");
            System.exit(1);     //Ends program
        }

        //Instantiate the output file
        try{
            pw = new PrintWriter(new File("payroll_report.prt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("Output file error!");
            System.exit(1);
        }

        //write column headings
        pw.format("%-25s%5s%-25s%5s%5s%5s%5s%5s%10s%n%n", "First Name", " ",
                "Last Name", " ","Hours", " ", "Rate", " ", "Pay Amount");

        //Priming Read
        input();
    }

    private static void calcs() {
        cPay = iHours * iRate;
        cEmpCtr ++;
        cEmpPayTot += cPay;
    }

    private static void input() {
        if(payrollScanner.hasNext()) {
           String record = payrollScanner.nextLine();
           iFirstName = record.substring(0, 25);
           iLastName = record.substring(25, 50);
           iData = record.substring(50, 53);
           iHours = Integer.parseInt(iData);
           iData = record.substring(53, 58);
           iRate = Double.parseDouble(iData);
        }
        else {
            eof = true;      //Set when no more records
        }
    }

    private static void output() {
        pw.format("%-25s%5s%-25s%5s%5d%5s%5.2f%5s%10.2f%n%n", iFirstName, " ",
                iLastName, " ", iHours, " ", iRate, " ", cPay);
    }

    private static void totals() {
        DecimalFormat dfEmpCtr = new DecimalFormat("#,##0");
        DecimalFormat dfEmpPayTot = new DecimalFormat("$##,###.00");

        //format total fields
        String oEmpCtr = dfEmpCtr.format(cEmpCtr);
        String oEmpPayTot = dfEmpPayTot.format(cEmpPayTot);

        pw.format("%n%21s%5s%54s%10s%n", "Number of Employees: ", oEmpCtr,
                " ", oEmpPayTot);
    }
}
package com.company.spencer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoundExample {
    static double iCost, cTip, cTax, cTotal;
    static String iData,oTotal, oTax, oTip, oCost, iFoodName;
    static Scanner scan;
    static final double TAX_RATE = .07;
    static final double TIP_PCT = .15;
    public static void main(String[] args) {
        init();
        input();
        calcs();
        output2();
        closing();
    }

    public static void init(){
        scan = new Scanner(System.in);
    }

    public static void input(){
        System.out.print("Enter food cost: ");
        iCost = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter food name: ");
        iFoodName = scan.nextLine();
        //iData = scan.nextLine();
        //iCost = Double.parseDouble(iData);
    }

    public static void calcs(){

        cTip = TIP_PCT * iCost;
        cTip = cTip * 100.0;
        cTip = Math.round(cTip);
        cTip = cTip / 100.0;
        //cTax = iCost * TAX_RATE;
        cTax = Math.round(iCost * TAX_RATE * 100.0) / 100.0;
        cTotal = cTip + cTax + iCost;
    }
    /*
    public static void output(){
        DecimalFormat df = new DecimalFormat("$###,###.00");
        DecimalFormat df2 = new DecimalFormat("#.00");
        oTip = df.format(cTip);
        oTax = df.format(cTax);
        oCost = df.format(iCost);
        oTotal = df.format(cTotal);
        System.out.println("Cost: " + oCost);
        System.out.println("Your tip is: " + oTip);
        System.out.println("Your sales tax is: " + oTax);
        System.out.println("Total is: " + oTotal);

    }
    */

    public static void output2(){
            DecimalFormat df = new DecimalFormat("$###,###.00");

        oTip = df.format(cTip);
        oTax = df.format(cTax);
        oCost = df.format(iCost);
        oTotal = df.format(cTotal);

        //System.out.println("Cost: " + oCost);
        //System.out.println("Your tip is: " + oTip);
        //System.out.println("Your sales tax is: " + oTax);
        //System.out.println("Total is: " + oTotal);

        System.out.printf("\n%-25s%13s", "Label:", "Price");
        System.out.printf("\n%-25s%13s", "Cost:", oCost);
        System.out.printf("\n%-20s%5s%13s", "Your tip is:", " ", oTip);
        System.out.printf("\n%-20s%5s%13s", "Sales tax is:", " ", oTax);
        System.out.printf("\n%-20s%5s%13s", "Total is:", " ", oTotal);
    }

    public static void closing(){
        System.out.println("\n\nProgram ended, have a nice day.");


    }
}

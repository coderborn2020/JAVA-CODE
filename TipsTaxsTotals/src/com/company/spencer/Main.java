package com.company.spencer;

import java.text.DecimalFormat;
import java.util.Scanner;

/* pseudocode
Variables
	double iCost, cTip, cTax, cTotal
	String iData, ototal, oTax, oTip, oCost
	Object inputDevice

main
	call input
	call calcs
	call output

input
	Display "Enter the food cost."
	Get iData
	iCost = formatted (iData)

calcs
	cTip = .15 * iCost
	cTax = iCost * .07
	cTotal = cTip + cTax + iCost

output
	oTip = formatted(cTip)
	oTax = formatted(cTax)
	oTotal = formatted(cTotal)
	oCost = formatted(iCost)
	Display "Cost: " oCost
	Display "your tip is: " oTip
	Display "Sales tax is: " oTax
	Display "Total is: " oTotal
*/
public class Main {
    static double iCost, cTip, cTax, cTotal;
    static String iData,oTotal, oTax, oTip, oCost;
    static Scanner scan;
    static final double TAX_RATE = .07;
    static final double TIP_PCT = .15;
    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();
        closing();
    }

    public static void init(){
        scan = new Scanner(System.in);
    }

    public static void input(){
        String iFoodName = "";
        System.out.println("Enter food cost: ");
        iCost = scan.nextDouble();
        System.out.println("Enter food name: ");
        iFoodName = scan.nextLine();
        //iData = scan.nextLine();
        //iCost = Double.parseDouble(iData);
    }

    public static void calcs(){

        //cTip = .15 * iCost;   //15% tip
        cTip = .15 * iCost;
        //cTax = iCost * .07;   //7% tax
        cTax = iCost * .07;
        cTotal = cTip + cTax + iCost;
    }

    public static void output(){
        //System.out.println("output under construction");
        /*
        oTip = formatted(cTip)
        oTax = formatted(cTax)
        oTotal = formatted(cTotal)
        oCost = formatted(iCost)
        Display "Cost: " oCost
        Display "your tip is: " oTip
        Display "Sales tax is: " oTax
        Display "Total is: " oTotal
            */
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

    public static void closing(){
        System.out.println("Program ended, have a nice day.");
    }
}

/**
 * Program written by Spencer Baty
 * 1/21/2021
 * Last compiled 1/21/2021
 * This program prints a report of what
 * the customer owes for purchasing items
 * from Longaberger.
 */

package com.company.spencer;

import java.util.Scanner;

class LongabergerProgram
{
    static Scanner scanner = new Scanner(System.in);
    private static int hFlag;

    public static void main (String args[])
    {


        //create an instance of the Sandwich class
        BasketBuild compute = new BasketBuild();
        compute.setOrderType(order());
        compute.getOrderType();
        if (hFlag != 1) {
            compute.setiCustomerType(customer());
            compute.getiCustomerType();
            compute.setiBasketType(basket());
            compute.getiBasketType();
            compute.setiState(state());
            compute.getiState();
            compute.setAccessories(accessories());
            compute.getAccessories();
        }
        else {
            compute.getInput();
        }
        compute.calcsOutput1();
        compute.calcsOutput2();
        compute.calcsOutput3();
        compute.calcsOutput4();
        compute.calcsOutput5();
        compute.calcsOutput6();
        compute.calcsOutput7();
        compute.calcsOutput8();
        compute.calcsOutput9();
        System.out.println(compute.getOutput());
        System.out.println(compute.getOutput2());

    }



    private static int customer(){

        int iCustomerType;
        System.out.println("Please enter what type of customer you are, a 1, 2, or 3: ");
        String iData = scanner.nextLine();
        try {
            iCustomerType = Integer.parseInt(String.valueOf(iData));
            if (iCustomerType != 1 && iCustomerType != 2 && iCustomerType != 3) {
                System.out.println("Invalid customer type, set to 1.");
                iCustomerType = 1;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid customer type, set to 1.");
            iCustomerType = 1;
        }
            return iCustomerType;
    }
    private static String order(){

        String orderType;
        System.out.println("Hello, welcome to Longaberger");
        System.out.println("Please enter your order type, choose between S or C");
        String iData2 = scanner.nextLine();
        try {
            orderType = String.valueOf(iData2);
            if (!orderType.equals("S") && !orderType.equals("C")) {
                System.out.println("Invalid order type, set to C.");
                orderType = "S";
            }
        }
        catch (Exception e) {
            System.out.println("Invalid order type, set to C.");
            orderType = "S";
        }

        if (orderType.equals("S")){
            hFlag = hFlag + 1;
        }
        return orderType;
    }

    private static String basket(){
        String iBasketType;
        System.out.println("Please enter the basket type, you may choose through");
        System.out.println("‘C’, ‘W’, ‘K’, ‘M’, ‘U’ ");
        String iData3 = scanner.nextLine();
        try {
            iBasketType = String.valueOf(iData3);
            if (!iBasketType.equals("C") && !iBasketType.equals("W") && !iBasketType.equals("K") &&
                !iBasketType.equals("M") && !iBasketType.equals("U")) {
                System.out.println("Invalid basket type, set to W.");
                iBasketType = "W";
            }

        }
        catch (Exception e) {
            System.out.println("Invalid basket type, set to W.");
            iBasketType = "W";
        }

        return iBasketType;
    }

    private static String state(){
        String iState;
        System.out.println("Please enter the state information (Choose between IA, IL, MO): ");
        String iData4 = scanner.nextLine();
        try {
            iState = String.valueOf(iData4);
            if (!iState.equals("IA") && !iState.equals("IL") && !iState.equals("MO")) {
                System.out.println("State information invalid, defaulting to IA");
                iState = "IA";
            }
        }
        catch (Exception e) {
            System.out.println("Invalid state information, defaulting to IA");
            iState = "IA";
        }
        return iState;
    }



    private static String accessories(){
        String iAccessories;
        System.out.println("Please enter the accessories (Choose between A1, A2, A3, A4): ");
        String iData5 = scanner.nextLine();
        try {
            iAccessories = String.valueOf(iData5);
            if (!iAccessories.equals("A1") && !iAccessories.equals("A2") && !iAccessories.equals("A3")
                    && !iAccessories.equals("A4")) {
                System.out.println("Acccessory information invalid, defaulting to A1");
                iAccessories = "A1";
            }
        }
        catch (Exception e) {
            System.out.println("Invalid accessory information, defaulting to A1");
            iAccessories = "A1";
        }
        return iAccessories;
    }


    }



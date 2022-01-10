package com.company.spencer;

import java.text.DecimalFormat;
import java.time.*;

public class BasketBuild
{
    // the private data members

    public int iCustomerType;
    private String orderType;
    private String iBasketType;
    private String iState;
    private String iAccessories;
    private String oBasketType;
    private String oCustomerType;
    private String oBasketName;
    private String oAccessoryName;
    private String oAccessoryCost;
    private String oBasketAmountCost;
    private String oSubtotal;
    private String oTaxCalc;
    private String oTotalCost;
    private String hInput;
    private double cBasketType = 0;
    private double cAccessoryCost = 0;
    private double cTax = 0;
    private double cDiscountCustomer = 0;
    private double cBasketAmountCost = 0;
    private double cDiscount = 0;
    private double cSubtotal = 0;
    private double cTaxCalc = 0;
    private double cTotalCost = 0;

    DecimalFormat df = new DecimalFormat("$###,###.00");
    LocalDate today = LocalDate.now();

    // default constructor
    public BasketBuild(){
        iCustomerType = 1;
        orderType = "S";
        iBasketType = "U";
        iAccessories = "A4";
        iState = "IA";

    }

    public void getInput(){
        iCustomerType = 1;
        iBasketType = "U";
        iAccessories = "A4";
        iState = "IA";

    }

    // the public get and set methods

    //mutator/setter
    public void setiCustomerType(int iCustomerType) {
        this.iCustomerType = iCustomerType;

    }


    //access/getter
    public int getiCustomerType() { return iCustomerType; }


    public void setOrderType(String orderType) {
        this.orderType = orderType;

    }

    public String getOrderType() { return orderType; }


    public void setiBasketType(String basketType) {
        this.iBasketType = basketType;
    }

    public String getiBasketType() { return iBasketType;}

    public void setiState(String iState) { this.iState = iState; }

    public String getiState() {return iState;}

    public void setAccessories(String iAccessories) { this.iAccessories = iAccessories; }

    public String getAccessories() {return iAccessories;}


    public double calcsOutput1(){
        if (iBasketType.equals("C")) {
            cBasketType = cBasketType + 15.00;
            oBasketName = "Cracker";
        }
        else
            if (iBasketType.equals("W")){
                cBasketType = cBasketType + 53.25;
                oBasketName = "Wildflower";
            }
            else
                if (iBasketType.equals("K")){
                    cBasketType = cBasketType + 23.15;
                    oBasketName = "Key";
                }
                else
                    if(iBasketType.equals("M")){
                        cBasketType = cBasketType + 34.20;
                        oBasketName = "Magazine";
                    }
                    else
                        if(iBasketType.equals("U")){
                            cBasketType = cBasketType + 112.77;
                            oBasketName = "Umbrella";
                        }

        return cBasketType;
    }

    public double calcsOutput2(){
        if (iAccessories.equals("A1")){
            cAccessoryCost = cAccessoryCost + 4.75;
            oAccessoryName = "Protector";
        }
        else
            if (iAccessories.equals("A2")){
                cAccessoryCost = cAccessoryCost + 8.00;
                oAccessoryName = "Liner";
            }
            else
                if (iAccessories.equals("A3")){
                    cAccessoryCost = cAccessoryCost + 10.55;
                    oAccessoryName = "Combo";
                }
                else
                    if (iAccessories.equals("A4")){
                        cAccessoryCost = cAccessoryCost + 0;
                        oAccessoryName = "None";
                    }

                    return cAccessoryCost;

    }

    public double calcsOutput3(){
        if (iState.equals("IA")){
            cTax = cTax + 0.06;
        }
        else
            if (iState.equals("IL")){
                cTax = cTax + 0.0625;
            }
            else
                if (iState.equals("MO")){
                    cTax = cTax + 0.04225;
                }

                return cTax;
    }

    public double calcsOutput4(){
        if (iCustomerType == 1){
            cDiscountCustomer = cDiscountCustomer + .50;
            cTax = cTax * 0;
            oCustomerType = "Dealer";
        }
        else
            if (iCustomerType == 2){
                cDiscountCustomer = cDiscountCustomer + 0;
                oCustomerType = "Walk in";
            }
            else
                if (iCustomerType == 3){
                    cDiscountCustomer = cDiscountCustomer + .10;
                    oCustomerType = "Bus";
                }

        return cDiscountCustomer;
    }

    public double calcsOutput5(){
            cBasketAmountCost = cBasketType + cAccessoryCost;

            return cBasketAmountCost;
    }

    public double calcsOutput6(){
        cDiscount = cBasketAmountCost * cDiscountCustomer;

        return cDiscount;
    }

    public double calcsOutput7(){
        cSubtotal = cBasketAmountCost - cDiscount;

        return cSubtotal;
    }

    public double calcsOutput8(){
        cTaxCalc = cSubtotal * cTax;

        return cTaxCalc;
    }

    public double calcsOutput9(){
        cTotalCost = cSubtotal + cTaxCalc;

        return cTotalCost;
    }


    public String getOutput() {
        return "The Customer Type is: " + iCustomerType + " The order type is: " + orderType
                + " The basket type is: " + iBasketType + " The state is " + iState + " The accessory type is "
                + iAccessories;

    }

    public String getOutput2(){
        oBasketType = df.format(cBasketType);
        oAccessoryCost = df.format(cAccessoryCost);
        oBasketAmountCost = df.format(cBasketAmountCost);
        oSubtotal = df.format(cSubtotal);
        oTaxCalc = df.format(cTaxCalc);
        oTotalCost = df.format(cTotalCost);


        return  today + "      RECEIPT" + "\n" + "________________________________" + "\n"
                + "Customer Type: " + oCustomerType + "\n"
                + "Customer State: " + iState + "" + "\n"
                + "Basket Name: " + oBasketName + "\n"
                + "Basket Cost: " + oBasketType + "\n"
                + "Accessory Name: " + oAccessoryName + "\n"
                + "Accessory Cost: " + oAccessoryCost + "\n"
                + "Basket and Accessory Cost: " + oBasketAmountCost + "\n"
                + "Discount: %" + cDiscount + "\n"
                + "Subtotal: " + oSubtotal + "\n"
                + "Tax: " + oTaxCalc + "\n"
                + "Total Cost: " + oTotalCost + "\n"
                + "Thank you for shopping at Longaberger, have a nice day!";
    }


}



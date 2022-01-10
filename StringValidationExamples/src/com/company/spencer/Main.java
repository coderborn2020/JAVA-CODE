package com.company.spencer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String ssn = "123-44-5672";
        if (ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")){
            System.out.println("SSN is valid");
        }
        if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
            System.out.println("SSN is valid");
        }
        if (!ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
            System.out.println("SSN is invalid");
        }
    }
}

/**
 * Revisiting some coding techniques for use in the
 * Longaberger Project
 */

import java.util.Scanner;

public class LakeRathbunSiteCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        int siteNum;
        char loop;
        int electricSw;

        siteNum = inputSiteNum();
        loop = inputLoop();
        electricSw = inputElectric();
        double totalBill = calcs(siteNum, loop, electricSw);
        System.out.print ("Total Bill: " + totalBill);
    }

    private static double calcs(int siteNum, char loop, int electricSw) {
        double cRate = 0;
        final double ELECTRIC_RATE = .0369;
        switch(loop) {
            case 'A':
            case 'P':
            case 'Z':
                cRate = 19.99;
                break;
            case 'B':
            case 'R':
                cRate = 16.18;
                break;
            case 'C':
                cRate = 18.25;
        }

        double cTotalBill;
        if (electricSw == 1) {
            cTotalBill = cRate + (cRate * ELECTRIC_RATE);
            cTotalBill = Math.round(cTotalBill * 100) / 100.0;
        }
        else {
            cTotalBill = cRate;
        }

        return cTotalBill;
    }

    private static int inputElectric() {
        int electricSw;
        System.out.println("Please enter 1-Electric, 2 - Non-Electric.");
        String iData = scanner.nextLine();
        try {
            electricSw = Integer.parseInt(iData);
            if (electricSw != 1 && electricSw != 2) {
                System.out.println("Invalid value for electricity. Set to Electric.");
                electricSw = 1;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid value for electricity. Set to Electric.");
            electricSw = 1;
        }
        return electricSw;
    }


    private static char inputLoop() {
        System.out.println("Please enter your loop (A, B, C, R, P, Z)");
        char loop = scanner.nextLine().toUpperCase().charAt(0);
        switch (loop) {
            case 'A':
            case 'B':
            case 'C':
            case 'R':
            case 'P':
            case 'Z':
                break;
            default:
                System.out.println("Error in loop entry.  Loop assigned is 'C'.");
                loop = 'C';
        }
        return loop;
    }

    private static int inputSiteNum() {
        int siteNum;
        System.out.println("Please enter your site number (1-10)");
        String iData = scanner.nextLine();
        try {
            siteNum = Integer.parseInt(iData);
            if ((siteNum < 1) || (siteNum > 10)) {
                System.out.println("Site Number Error.  Assigned site = 3.");
                siteNum = 3;
            }
        }
        catch(Exception e) {
            System.out.println("Site Number Error.  Assigned site = 3.");
            siteNum = 3;
        }
        return siteNum;
    }


}

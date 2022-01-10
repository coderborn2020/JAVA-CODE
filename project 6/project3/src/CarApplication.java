/**
 * This program was written 4/08/2021 by Spencer Baty,
 * it uses a console interface and shows the user the
 * functionality of the Car, GasCar, ElectricCar classes.
 */

import java.util.Scanner;

public class CarApplication {
    static Scanner scanner = new Scanner(System.in);
    private static boolean gas;
    public static boolean electric;
    public static boolean valid;

    public static void main(String[] args) throws InvalidCar, Exception {

        Car carBuild = new Car() {
            @Override
            public double CalcCostPerFill(double pumpCost) {
                return pumpCost;
            }
        };

        ElectricCar electricBuild = new ElectricCar(){
            @Override
            public double CalcCostPerFill(double pumpCost) {
                return pumpCost;
            }
        };

        GasCar gasBuild = new GasCar() {
            @Override
            public double CalcCostPerFill(double pumpCost) {
                return pumpCost;
            }
        };






        input();
        if (gas){
            System.out.print(gasBuild.toString());
        }
        else
            if (electric){
                System.out.print(electricBuild.toString());
            }


    }



    public static void input() {
        while (!valid) {
            System.out.println("Hello, please enter 'g' for gas car or 'e' for electric car");
            String iData = scanner.nextLine();
                if (iData.equals("g")) {
                    gas = true;
                    valid = true;
                    electric = false;
                } else
                    if (iData.equals("e")) {
                    electric = true;
                    valid = true;
                    gas = false;
                }
                    else
                    {
                        System.out.println("Entry is wrong, please try again");
                    }
            }
        }


}

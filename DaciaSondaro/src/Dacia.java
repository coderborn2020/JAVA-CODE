import java.util.Scanner;

public class Dacia {
    public static String carCompany = "Top Gear";

    private String mainCar;
    private double cost;
    private double seats;
    private double tax;
    static Scanner scan;

    public Dacia(){
        mainCar = "Dacia Sondaro";
        cost = 1999.00;
        seats = 4;
        tax = 0.05;

    }

    public void setMainCar(String ingredient) { mainCar = mainCar; }


    public String getMainCar() { return mainCar; }

}

//Program written 12/6/2020 by Spencer Baty
//This program does calculations for the user
//If they enter in a certain amount of eggs,
//The program outputs how much the cost total
//Is, If the egg amount exceeds 12, it will
//Be known as a dozen.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Eggs
{
    public static void main(String[] args)
    {
        int iQty = 0;
        int iQty2 = 0;
        double cDozen = iQty * 12;
        final double cPrice1 = 3.25;
        final double cPrice2 = .45;

        String result;
        result = JOptionPane.showInputDialog("Enter number of dozens of Eggs purchased: ");
        iQty = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Enter number of loose Eggs purchased: ");
        iQty2 = Integer.parseInt(result);

        double cTotal1 = cPrice1 * iQty;
        double cTotal2 = cPrice2 * iQty2;
        double cTotal3 = cTotal1 + cTotal2;

        DecimalFormat df = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null,
                "The Amount of eggs you bought were: "+ cDozen + iQty2 + "\n" +
                        "That is: " + iQty + " dozen Eggs" + "\n" +
                        "The loose amount of eggs is  " + iQty2 + " Eggs" + "\n"
                        + "The total is $" + df.format(cTotal3) + "\n");
    }
}
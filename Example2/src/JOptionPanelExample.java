import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JOptionPanelExample
{
    public static void main(String[] args)
    {
        int iQty = 0;
        double iPrice = 0;
        double cTotal = 0;
        String iName = "";

        String result;
        result = JOptionPane.showInputDialog("Enter number of widgets: ");
        iQty = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Enter price of widgets: ");
        iPrice = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("Name of widgets: ");
        iName = result;

        DecimalFormat df = new DecimalFormat("###,###.##");
        JOptionPane.showMessageDialog(null,
                "Widget quanity: "+ iQty + "\n" +
                        "Widget price: " + iPrice + "\n" +
                        "Total: " + iQty * iPrice + "\n" +
                        "Have a great Weekend!");
//look up modulus opporator
    }
}
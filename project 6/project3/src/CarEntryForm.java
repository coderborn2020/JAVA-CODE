import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CarEntryForm extends JFrame implements ActionListener
{
    String color;
    /**
     * True if gascar
     * false if electric car
     */
    boolean cartype;

    public CarEntryForm(Car newCar, GasCar gCar, ElectricCar eCar) throws Exception {
        this.newCar = newCar;
        this.gCar = gCar;
        this.eCar = eCar;
    }

    GasCar gCar = new GasCar(){
        @Override
        public double CalcCostPerFill(double pumpCost) throws InvalidCar, Exception{
            return 0;
        }
    };

    ElectricCar eCar = new ElectricCar(){
        @Override
        public double CalcCostPerFill(double pumpCost) throws Exception, InvalidCar {
            return 0;
        }
    };

    Car newCar = new Car() {
        @Override
        public double CalcCostPerFill(double pumpCost) throws InvalidCar, Exception {
            return 0;
        }
    };

    /**
     * Creation of JLabel fields and answers
     */
    Font bigFont = new Font("Arial", Font.PLAIN, 12);
    JLabel field1 = new JLabel("Car Make: ");
    JLabel field2 = new JLabel("Car Model: ");
    JLabel field3 = new JLabel("Car Year: ");
    JLabel field4 = new JLabel("Car Weight: ");
    JLabel field5 = new JLabel("Car Color: ");
    JLabel field6 = new JLabel("Car Type: ");
    JButton button1 = new JButton("Return");
    JTextField answer = new JTextField(10);
    JTextField answer2 = new JTextField(10);
    JTextField answer3 = new JTextField(10);
    JTextField answer4 = new JTextField(10);
    JLabel field7 = new JLabel("Tank Size: ");
    JLabel field8 = new JLabel("Fuel Type: ");
    JLabel field9 = new JLabel("Battery Size: ");
    JLabel field10 = new JLabel("Battery Type: ");
    JTextField gasAnswer1 = new JTextField(10);
    JTextField gasAnswer2 = new JTextField(10);
    JTextField elecAnswer1 = new JTextField(10);
    JTextField elecAnswer2 = new JTextField(10);

    /**
     * creation of radio buttons
     */
    ButtonGroup grpColor = new ButtonGroup();
    JRadioButton red = new JRadioButton("Red", true);
    JRadioButton blue = new JRadioButton("Blue");
    JRadioButton white = new JRadioButton("White");
    JRadioButton black = new JRadioButton("Black");
    JRadioButton yellow = new JRadioButton("Yellow");
    ButtonGroup grpCar = new ButtonGroup();
    JRadioButton gas = new JRadioButton("Gas Car", true);
    JRadioButton electric = new JRadioButton("Electric Car");
    JButton submit = new JButton("Submit Information");

    public CarEntryForm() throws Exception {
        super("Car Emporium");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //fields font gets set
        field1.setFont(bigFont);
        field2.setFont(bigFont);
        field3.setFont(bigFont);
        field4.setFont(bigFont);
        field5.setFont(bigFont);
        field6.setFont(bigFont);
        field7.setFont(bigFont);
        field8.setFont(bigFont);
        field9.setFont(bigFont);
        field10.setFont(bigFont);

        //add fields and answer boxes
        add(field1);
        add(answer);
        add(field2);
        add(answer2);
        add(field3);
        add(answer3);
        add(field4);
        add(answer4);
        add(field5);

        //groups buttons together
        grpColor.add(red);
        grpColor.add(blue);
        grpColor.add(white);
        grpColor.add(black);
        grpColor.add(yellow);
        add(red);
        add(blue);
        add(white);
        add(black);
        add(yellow);

        add(field6);
        grpCar.add(gas);
        grpCar.add(electric);
        add(gas);
        add(electric);

        add(field7);
        add(gasAnswer1);
        add(field8);
        add(gasAnswer2);
        add(field9);
        add(elecAnswer1);
        add(field10);
        add(elecAnswer2);

        field9.setEnabled(false);
        elecAnswer1.setEnabled(false);
        field10.setEnabled(false);
        elecAnswer2.setEnabled(false);

        add(button1);
        add(submit);

        setSize(1920, 1080);
        button1.addActionListener(this);
        submit.addActionListener(this);
        gas.addActionListener(this);
        electric.addActionListener(this);

        cartype = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object check = e.getSource();

        if (red.isSelected()){
            color = "red";
        }
        else
        if (blue.isSelected()){
            color = "blue";
        }
        else
        if (white.isSelected()){
            color = "white";
        }
        else
        if (black.isSelected()){
            color = "black";
        }
        else
        if (yellow.isSelected()){
            color = "yellow";
        }

        if(e.getSource() == gas){
            field7.setEnabled(true);
            gasAnswer1.setEnabled(true);
            field8.setEnabled(true);
            gasAnswer2.setEnabled(true);
            field9.setEnabled(false);
            elecAnswer1.setEnabled(false);
            field10.setEnabled(false);
            elecAnswer2.setEnabled(false);
            cartype = true;
        }
        else
        if(e.getSource() == electric){
            field7.setEnabled(false);
            gasAnswer1.setEnabled(false);
            field8.setEnabled(false);
            gasAnswer2.setEnabled(false);
            field9.setEnabled(true);
            elecAnswer1.setEnabled(true);
            field10.setEnabled(true);
            elecAnswer2.setEnabled(true);
            cartype = false;
        }

        if (check.equals(button1)){
            MainForm frame = new MainForm();
            frame.setVisible(true);
            super.dispose();
        }

        if (check.equals(submit)){
            try {
                String make = answer.getText();
                String model = answer2.getText();
                String year = answer3.getText();
                String weight = answer4.getText();
                weight = weight.trim();
                newCar.setMake(make);
                newCar.setModel(model);
                newCar.setColor(color);
                newCar.setYear(Integer.parseInt(year));
                newCar.setWeight(Integer.parseInt(weight));
            }
            catch (InvalidCar invalidCar) {
                invalidCar.printStackTrace();
            }
                if(cartype){
                    try {
                        String make = answer.getText();
                        String model = answer2.getText();
                        String year = answer3.getText();
                        String weight = answer4.getText();
                        weight = weight.trim();
                        String fuelType = gasAnswer2.getText();
                        String tank = gasAnswer1.getText();
                        tank = tank.trim();
                        gCar.setTank(Double.parseDouble(tank));
                        gCar.setFuelType(fuelType);
                        gCar.setMake(make);
                        gCar.setModel(model);
                        gCar.setColor(color);
                        gCar.setYear(Integer.parseInt(year));
                        gCar.setWeight(Integer.parseInt(weight));
                        MainForm.getList().add(gCar.toString());
                    } catch (InvalidCar invalidCar) {
                        invalidCar.printStackTrace();
                    }
                }
                if(!cartype){
                    try {
                        String make = answer.getText();
                        String model = answer2.getText();
                        String year = answer3.getText();
                        String weight = answer4.getText();
                        weight = weight.trim();
                        String batteryType = elecAnswer2.getText();
                        String  kilowatts = elecAnswer1.getText();
                        kilowatts = kilowatts.trim();
                        eCar.setKilowatts(Double.parseDouble(kilowatts));
                        eCar.setBatteryType(batteryType);
                        eCar.setMake(make);
                        eCar.setModel(model);
                        eCar.setColor(color);
                        eCar.setYear(Integer.parseInt(year));
                        eCar.setWeight(Integer.parseInt(weight));
                        MainForm.getList().add(eCar.toString());
                    }
                    catch (InvalidCar invalidCar) {
                        invalidCar.printStackTrace();
                    }
                }
        }
    }
}

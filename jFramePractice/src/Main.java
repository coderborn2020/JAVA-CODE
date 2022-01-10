import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class RadioBox extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel("Test");
    JRadioButton button1 = new JRadioButton("1", false);
    JRadioButton button2 = new JRadioButton("2", false);
    JRadioButton button3 = new JRadioButton("3", false);
    public RadioBox()
    {
        super("CheckBox Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label.setFont(new Font("Arial", Font.ITALIC, 22));
        button1.addItemListener(this);
        button2.addItemListener(this);
        button3.addItemListener(this);
        add(label);
        add(button1);
        add(button2);
        add(button3);
    }
    public void itemStateChanged(ItemEvent check)
    {
        // Actions based on choice go here
    }
    public static void main(String[] arguments)
    {
        final int FRAME_WIDTH = 350;
        final int FRAME_HEIGHT = 120;
        RadioBox frame =
                new RadioBox();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}

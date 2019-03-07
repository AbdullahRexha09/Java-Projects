package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FirstClass {

public static void main(String[] args)
{
    ActionListener listener = new MyActionListener();
    JFrame frame = new JFrame("MIRE SE VINI");
    frame.setForeground(Color.BLACK);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocation(new Point(10,50));
    frame.setSize(new Dimension(300,120));
    //frame.setTitle("A frame");
    JButton b1 = new JButton();
    b1.setText("HAShimi");
    b1.setBackground(Color.RED);
    b1.addActionListener(listener);
    frame.add(b1);
    JButton b2 = new JButton();
    b2.setText("Enveri");
    b2.setBackground(Color.BLUE);
    frame.add(b2);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);


}

}

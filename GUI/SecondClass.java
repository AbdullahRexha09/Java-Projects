package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SecondClass {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(320,75));
        frame.setTitle("Welcome!");
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Type your Zip Code: "));
        frame.add(new JTextField(5));
        frame.add(new JButton("Submit"));
        frame.setVisible(true);
    }
}


package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    public GridLayout()
    {
    JFrame frame = new JFrame("Welcome");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(300,120));
    frame.setSize(300,300);
    frame.setLayout(new java.awt.GridLayout(2,3));
    for(int i = 1;i<=6;i++)
    {
        JButton b = new JButton();
        b.setText("Button "+ i);
        frame.add(b);

    }
    frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        GridLayout g1 = new GridLayout();
    }

}

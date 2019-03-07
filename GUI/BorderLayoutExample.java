package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public BorderLayoutExample()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(210, 200));
        frame.setTitle("Run for the border");

        frame.setLayout(new BorderLayout());
        frame.add(new JButton("north"), BorderLayout.NORTH);
        frame.add(new JButton("south"), BorderLayout.SOUTH);
        frame.add(new JButton("west"), BorderLayout.WEST);
        frame.add(new JButton("east"), BorderLayout.EAST);
        frame.add(new JButton("center"),
                BorderLayout.CENTER);


        frame.setVisible(true);

    }
    public static void main(String[] args)
    {
        BorderLayoutExample b1 = new BorderLayoutExample();
    }
}

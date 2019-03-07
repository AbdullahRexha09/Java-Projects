package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Panels {

    public static void main(String[] args)
    {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(200,250));
      frame.setTitle("Telephone");

      frame.setLayout(new BorderLayout());

      JPanel panel = new JPanel(new GridLayout(4,3));
      for(int i =0;i<=9;i++)
      {
          panel.add(new JButton(""+i));
      }
      frame.add(panel,BorderLayout.CENTER);

      JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JLabel("Number to dial"));
        southPanel.add(new JTextField(10));
        frame.add(southPanel,BorderLayout.SOUTH);

      frame.setVisible(true);



    }
}

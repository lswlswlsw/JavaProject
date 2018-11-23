package RogLike;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.ButtonUI;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RogLike extends JFrame {
   public RogLike() {

      setTitle("용사 키우기");
      setSize(960, 1000);
      setVisible(true);
      setResizable(false);
      getContentPane().setLayout(new GridLayout(2, 1, 10, 10));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel1 = new JPanel();
      panel1.setLayout(null);
      panel1.setBackground(Color.ORANGE);
      panel1.setSize(960, 535);
      JPanel panel2 = new JPanel();
      panel2.setLayout(null);
      panel2.setSize(960, 455);
      panel2.setBackground(Color.PINK);

      getContentPane().add(panel1);
      getContentPane().add(panel2);

      
   }

   public static void main(String arg[]) {
      RogLike Frame = new RogLike();
   }
}

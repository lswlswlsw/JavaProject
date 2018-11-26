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
      
      JLabel ENEMY = new JLabel("");
      ENEMY.setIcon(new ImageIcon("C:\\201732032\\ExpertProject\\src\\ProjectFile\\LEVEL1.png"));
      ENEMY.setBounds(545, 12, 319, 233);
      panel2.add(ENEMY);
      
      JLabel EnemyHP = new JLabel("HP :");
      EnemyHP.setBounds(451, 87, 62, 18);
      panel2.add(EnemyHP);
      
      JLabel EnemyATK = new JLabel("ATK :");
      EnemyATK.setBounds(451, 128, 62, 18);
      panel2.add(EnemyATK);
      
      JLabel EnemyLevel = new JLabel("LEVEL :");
      EnemyLevel.setBounds(451, 170, 62, 18);
      panel2.add(EnemyLevel);
      
      JLabel MainUnit2 = new JLabel("MainUnit");
      MainUnit2.setBounds(81, 379, 62, 18);
      panel2.add(MainUnit2);
      
      JLabel MainUnitHp = new JLabel("HP : ");
      MainUnitHp.setBounds(322, 284, 62, 18);
      panel2.add(MainUnitHp);
      
      JLabel MainUnitAtk = new JLabel("ATK : ");
      MainUnitAtk.setBounds(322, 314, 62, 18);
      panel2.add(MainUnitAtk);
      
      JLabel MainUnitLevel = new JLabel("LEVEL : ");
      MainUnitLevel.setBounds(322, 344, 62, 18);
      panel2.add(MainUnitLevel);
      
      JLabel MainUnitEXP = new JLabel("EXP : ");
      MainUnitEXP.setBounds(322, 379, 62, 18);
      panel2.add(MainUnitEXP);
      
      JButton ATK = new JButton("ATTACK");
      ATK.setBounds(553, 284, 294, 144);
      panel2.add(ATK);

      JLabel MainUnit = new JLabel("");
      MainUnit.setIcon(new ImageIcon("C:\\201732032\\ExpertProject\\src\\ProjectFile\\Red.png"));
      MainUnit.setBounds(73, 391, 52, 77);
      panel1.add(MainUnit);

      JLabel Heal = new JLabel("Heal");
      Heal.setIcon(new ImageIcon("C:\\201732032\\ExpertProject\\src\\ProjectFile\\Heal.png"));
      Heal.setBounds(419, 391, 71, 86);
      panel1.add(Heal);

      JLabel Boss = new JLabel("");
      Boss.setBounds(685, 255, 165, 166);
      panel1.add(Boss);
      Boss.setIcon(new ImageIcon("C:\\201732032\\ExpertProject\\src\\ProjectFile\\BOss3.gif"));

   }

   public static void main(String arg[]) {
      RogLike Frame = new RogLike();
   }
}
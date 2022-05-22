import javax.swing.*;
import java.awt.event.*;
 
 
public class TopJavaClass {
 
public static void main(String args[]) {
 
    
        JFrame frame = new JFrame("maxika");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 500, 300);
        frame.setLayout(null);
 
        JButton jButton1 = new JButton();
        jButton1.setText("Button1");
        jButton1.setBounds(10,10,100,25);
        //jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Сообщение", " Заголовок", JOptionPane.PLAIN_MESSAGE);
          }
        });
        

        frame.add(jButton1);
 
        frame.setVisible(true);
  }
}
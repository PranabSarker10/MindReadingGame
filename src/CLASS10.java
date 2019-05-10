import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS10 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS10()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\10.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
				JOptionPane.showMessageDialog(null," Dear friend, I can talk with your favorite number.\n Do you want to watch ??","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Ok, Here are some conditions which you have to follow.\n   1.Number must have to be organized with two separate digits.\n   2.Reversing can't change the total digits of that number\n(Example: You have to wrtie 08, if I tell you to reverse the number 80)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," NOW START...","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Take a number of two separate digits","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Reverse it","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now find the difference(positive) of the main number and reverse number","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now add : difference and the reverse of that difference","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," your favorite number telling me that the last output is : 99\n Ha HA!!!","Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

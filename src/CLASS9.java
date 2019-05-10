import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS9 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS9()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\9.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
		
				JOptionPane.showMessageDialog(null," Think a number of 3 digits","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now,Write the same number before the previous number which will give you a number of 6 digits.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now,divide the number of 6 digits by 13(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Again, divide the previous result by 11(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," At last, divide the previous result by 7(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Isn't the result you have thought first ??\n HA HA HA HA !!!!!","Box",JOptionPane.INFORMATION_MESSAGE);	
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS29 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS29()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\29.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				JOptionPane.showMessageDialog(null," Dear friend, kindly take a number. \n I will show you a great magic","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Multiply the number by 2 and then add 15 with that.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Again multiply the number by 3 and then add 33 with that.(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now, divide the previous result by 6(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," At last,subtract the number you have taken at first form the previous result.(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Isn't the result 13 !!!!! \n It will show 13 for any taken number. \n If you don't believe me, try it again. \n And watch the magic of Mathematics.","Box",JOptionPane.INFORMATION_MESSAGE);	
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS14 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS14()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\14.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

		    	JOptionPane.showMessageDialog(null," Take a number of 2 digits","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Multiply 10 with the 1st digit and then add(+) 2nd digit with that.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now subtract 4 from the previous result and then add 8.","Box",JOptionPane.INFORMATION_MESSAGE);
				int x,y,res,rem;
				String s;
				s=JOptionPane.showInputDialog(null,"Enter the last output : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				x = (int)Double.parseDouble(s);
				y=x-4;
				res=y/10;
				rem=y%10;
				JOptionPane.showMessageDialog(null," Two digits of your taken number are :  "+res+" & "+rem+"\nMAGIC!!!","Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

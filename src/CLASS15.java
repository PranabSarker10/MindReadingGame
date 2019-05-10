import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS15 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS15()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\15.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

		    	int res,hid;
				String s;
				JOptionPane.showMessageDialog(null,"MY FRIEND, HIDE A NUMBER FROM 1 TO 9","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," NOW ADD ALL NUMBERS FROM 1 TO 9","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," NOW SUBTRUCT THE HIDDEN NUMBER FROM THE PREVIOUS ADDITION","Box",JOptionPane.INFORMATION_MESSAGE);
				s=JOptionPane.showInputDialog(null,"Enter the last output : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				hid = (int)Double.parseDouble(s);
				res=45-hid;
				JOptionPane.showMessageDialog(null," YOUR HIDDEN NUMBER IS : "+res,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

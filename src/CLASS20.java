import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS20 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS20()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\20.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				String s1,s2;
				JOptionPane.showMessageDialog(null,"Take your favorite two things in your two Hands.\n I will show which thing in your which Hand.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s1=JOptionPane.showInputDialog(null,"Input one of your favorite things:","Input Box",JOptionPane.INFORMATION_MESSAGE);	
				s2=JOptionPane.showInputDialog(null,"Input another of your favorite things:","Input Box",JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null,"Take an even number in which hand "+s1+" is present.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Take an odd number in which hand "+s2+" is present.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, multiply the right hand's number by the number which can be divided by 2 without any remainder\n(Remember)","Input Box",JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null,"Now, multiply the left hand's number by the number which can not be divided by 2 and creates remainder\n(Remember)","Input Box",JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null,"Now add the previous two multiplications.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, divide the final result by two.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				
				if(JOptionPane.showConfirmDialog(null,"Have you find any remainder ??","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null," "+s1+" is present in right hand and "+s2+" is present in left hand.","Box",JOptionPane.INFORMATION_MESSAGE);
				}	
				else
				{
					JOptionPane.showMessageDialog(null," "+s2+" is present in right hand and "+s1+" is present in left hand.","Box",JOptionPane.INFORMATION_MESSAGE);
				}    
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

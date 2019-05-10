import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS16 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS16()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\16.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int res,age,year;
				String s;
				JOptionPane.showMessageDialog(null,"I can show you your age and birth year","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Multiply 5 with the 1st digit of the age","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Then add 2 with it","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Again, multiply 2 with that","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, add 2nd digit with the previous result","Box",JOptionPane.INFORMATION_MESSAGE);
				s=JOptionPane.showInputDialog(null,"Enter the last output : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				res = (int)Double.parseDouble(s);
				age=res-4;
				JOptionPane.showMessageDialog(null," The age is : "+age,"Box",JOptionPane.INFORMATION_MESSAGE);
				
				if(JOptionPane.showConfirmDialog(null,"Did your birthday pass already(in this year)","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
				    year=2016-age;	
				    JOptionPane.showMessageDialog(null," The birth_year is : "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
				}	
				else
				{
				    year=2015-age;	
				    JOptionPane.showMessageDialog(null," The birth_year is : "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
			    }
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

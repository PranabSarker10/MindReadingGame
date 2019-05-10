import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS4 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS4()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\4.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
         ActionListener listen1;
        listen1 = (ActionEvent e) -> {

				JOptionPane.showMessageDialog(null,"Take a number of 3 digits","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now subtract reverse of the taken number from that taken number(Example: if number is 231 then 132-232)\n (Use calculator)\n Remeber this number","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now add the difference(if negative than take positive) and the reverse number of that difference\n (Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				if(JOptionPane.showConfirmDialog(null,"Is your output :1089 ??","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null," I guess it","Box",JOptionPane.INFORMATION_MESSAGE);
				}	
				else
				{
					if(JOptionPane.showConfirmDialog(null,"Is first subtraction :99 or -99 ??","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null," Your output is : 198.","Box",JOptionPane.INFORMATION_MESSAGE);
						if(JOptionPane.showConfirmDialog(null,"Is the 1st digit of your taken number : 1 ??","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		    			{
							int x;
							String s;
							s=JOptionPane.showInputDialog(null,"Enter the 2nd digit of your taken number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
							x = (int)Double.parseDouble(s);
							JOptionPane.showMessageDialog(null," Your taken number is: "+(100+(x*10+2)),"Box",JOptionPane.INFORMATION_MESSAGE);
		    				
		    			}
						else
						{
							if(JOptionPane.showConfirmDialog(null,"If your 1st subtraction is 99 press YES else if your 1st subtraction is -99 press NO.","BOX",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		        			{
								int y,z;
								String st1,st2;
								st1=JOptionPane.showInputDialog(null,"Enter the 1st digit of your taken number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
								st2=JOptionPane.showInputDialog(null,"Enter the 2nd digit of your taken number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
								
								y = (int)Double.parseDouble(st1);
								z = (int)Double.parseDouble(st2);
								
								JOptionPane.showMessageDialog(null," Your taken number is: "+(y*100+(z*10+(y-1))),"Box",JOptionPane.INFORMATION_MESSAGE);
		        			}
							else
							{
								int y,z;
								String st1,st2;
								st1=JOptionPane.showInputDialog(null,"Enter the 1st digit of your taken number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
								st2=JOptionPane.showInputDialog(null,"Enter the 2nd digit of your taken number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
								
								y = (int)Double.parseDouble(st1);
								z = (int)Double.parseDouble(st2);
								
								JOptionPane.showMessageDialog(null," Your taken number is: "+(y*100+(z*10+(y+1))),"Box",JOptionPane.INFORMATION_MESSAGE);
		        			       						
							}
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null," Your output is : 0.","Box",JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null," And the 1st & 3rd digits of your taken number are SAME!!!","Box",JOptionPane.INFORMATION_MESSAGE);
					}
		        }
        };
		        ok.addActionListener(listen1);
		        
		        setSize(1365,770);
   }
}

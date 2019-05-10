import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS21 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS21()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\21.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int RES,result,position;
				String s;
				JOptionPane.showMessageDialog(null,"Dear friend, here I will give you 5 positions \n Kindly choice one of them.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"1.Army \n 2.Boxer \n 3.Doctor \n 4.Officer \n 5.Engineer \n Which you wanted to be ?? \n May be  you don't like any of them but as it is game so please, play it.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Count your wanted position's total alphabet's number","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Multiply 10 with the previous number and then add 12 with that.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, again multiply 5 with the previous number and then add 64 with that","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s=JOptionPane.showInputDialog(null,"Tell me the last output:","Input Box",JOptionPane.INFORMATION_MESSAGE);
				RES = (int)Double.parseDouble(s);
				result=RES%7;
				position=result+2;
				
				if(position==4)
				{
					JOptionPane.showMessageDialog(null,"You wanted to be an ARMY.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				}
				else if(position==5)
				{
					JOptionPane.showMessageDialog(null,"You wanted to be a BOXER.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				}
				else if(position==6)
				{
					JOptionPane.showMessageDialog(null,"You wanted to be a DOCTOR.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				}
				else if(position==7)
				{
					JOptionPane.showMessageDialog(null,"You wanted to be an OFFICER.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				}  
				else if(position==8)
				{
					JOptionPane.showMessageDialog(null,"You wanted to be an ENGINEER.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				}  
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

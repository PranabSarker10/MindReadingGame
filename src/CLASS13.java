import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS13 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS13()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\13.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
		    	int output,sum=0,num,i,j=1,k=1,hidden_number;
				String s;
				int [] ch1 = new int[50];
				int [] ch2 = new int[50];
				
				JOptionPane.showMessageDialog(null," Take a number greater than 19.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now subtract the addition of all digits of your taken number from the taken number.\n (Example: If you taken 678 then the addition of all digits is : 6+7+8=21. And sutration is : 678-21=657.)","Box",JOptionPane.INFORMATION_MESSAGE);
		   		s=JOptionPane.showInputDialog(null," Now hide one digit from your last output and input other digit(s) without giving any space. \n (Example: If your last output is: 657 and your hide number is 5 then input is 67.)","Box",JOptionPane.INFORMATION_MESSAGE);
		   		i = (int)Double.parseDouble(s);
				if(i>9)
				{
			   		while(i>0)
			        {
			        	ch2[k]=i%10;
			        	i/=10;
			        	ch1[j]=ch2[k];
			        	sum=sum+ch1[j];
			        	j++;
			        	k++;
			        }    
			        output=sum-9;
			        while(output>9)
			        {
			        	output=output-9;
			        }
				}
				else
				{
					output=i;
				}
			    
		        hidden_number=9-output;
				JOptionPane.showMessageDialog(null," Your hidden_number is : "+hidden_number,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

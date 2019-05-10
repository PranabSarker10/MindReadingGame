import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS26 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS26()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\26.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int RES,Result,out1,month,year;
				String s;
				JOptionPane.showMessageDialog(null,"Dear friend, take your birth year in imagination.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, multiply 20 with the year and then add 69.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, multiply 5 with the previous result.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"At last, add the number of your birth month with the last output. \n( Birth month: January = 1,February=2,..........,December=12).","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s=JOptionPane.showInputDialog(null,"Enter the final output :","Input Box",JOptionPane.INFORMATION_MESSAGE);
				RES = (int)Double.parseDouble(s);
				Result = RES-345;
				out1=Result/100;
				month=Result-(out1*100);
				year=out1;
				if(month==1)
					 {
						 JOptionPane.showMessageDialog(null,"Month = January \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==2)
					 {
						 JOptionPane.showMessageDialog(null,"Month = February \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==3)
					 {
						 JOptionPane.showMessageDialog(null,"Month = March \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==4)
					 {
						 JOptionPane.showMessageDialog(null,"Month = April \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==5)
					 {
						 JOptionPane.showMessageDialog(null,"Month = May \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==6)
					 {
						 JOptionPane.showMessageDialog(null,"Month = June \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==7)
					 {
						 JOptionPane.showMessageDialog(null,"Month = July \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==8)
					 {
						 JOptionPane.showMessageDialog(null,"Month = August \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==9)
					 {
						 JOptionPane.showMessageDialog(null,"Month = September \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==10)
					 {
						 JOptionPane.showMessageDialog(null,"Month = October \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==11)
					 {
						 JOptionPane.showMessageDialog(null,"Month = November \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }
					 else if(month==12)
					 {
						 JOptionPane.showMessageDialog(null,"Month = December \n Birth_Year = "+year,"Box",JOptionPane.INFORMATION_MESSAGE);
					 }	
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

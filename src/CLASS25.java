import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS25 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS25()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\25.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int one,two,three,four,five,six,FR;
				String s1,s2,s3,s4,s5,s6;
				JOptionPane.showMessageDialog(null,"Dear friend, my game is applicable for those whose ages are between 1 to 63.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"I will show you 6 tables. And You have to Input the table number if age is present in that table.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s1=JOptionPane.showInputDialog(null,"          (1)           \n 1 3 5 7 9 11 13 15 \n 17 19 21 23 25 27 29 31 \n 33 35 37 39 41 43 45 47 \n 49 51 53 55 57 59 61 63 \n Is your age present on that table??(If yes press 1, else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				one = (int)Double.parseDouble(s1);
				if(one == 1)
				{
					one=1;
				}
				else
				{
					one=0;
				}
				s2=JOptionPane.showInputDialog(null,"          (2)           \n 2 3 6 7 10 11 13 15 \n 18 19 22 23 26 27 30 31 \n 34 35 38 39 42 43 46 47 \n 50 51 54 55 58 59 62 63 \n Is your age present on that table??(If yes press 1 else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				two = (int)Double.parseDouble(s2);
				if(two == 1)
				{
					two=2;
				}
				else
				{
					two=0;
				}
				s3=JOptionPane.showInputDialog(null,"          (3)           \n 4 5 6 7 12 13 14 15 \n 20 21 22 23 28 29 30 31 \n 36 37 38 39 44 45 46 47 \n 52 53 54 55 60 61 62 63 \n Is your age present on that table??(If yes press 1 else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				
				three = (int)Double.parseDouble(s3);
				if(three == 1)
				{
					three=4;
				}
				else
				{
					three=0;
				}
				
				s4=JOptionPane.showInputDialog(null,"          (4)           \n 8 9 10 11 12 13 14 15 \n 24 25 26 27 28 29 30 31 \n 40 41 42 43 44 45 46 47 \n 56 57 58 59 60 61 62 63 \n Is your age present on that table??(If yes press 1 else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				four = (int)Double.parseDouble(s4);
				if(four == 1)
				{
					four=8;
				}
				else
				{
					four=0;
				}
				
				s5=JOptionPane.showInputDialog(null,"          (5)           \n 16 17 18 19 20 21 22 23 \n 24 25 26 27 28 29 30 31 \n 48 49 50 51 52 53 54 55 \n 56 57 58 59 60 61 62 63 \n Is your age present on that table??(If yes press 1 else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				five = (int)Double.parseDouble(s5);
				if(five == 1)
				{
					five=16;
				}
				else
				{
					five=0;
				}
				
				s6=JOptionPane.showInputDialog(null,"          (6)           \n 32 33 34 35 36 37 38 39 \n 40 41 42 43 44 45 46 47 \n 48 49 50 51 52 53 54 55 \n 56 57 58 59 60 61 62 63 \n Is your age present on that table??(If yes press 1 else press 0)","Input Box",JOptionPane.INFORMATION_MESSAGE);
				six = (int)Double.parseDouble(s6);
				if(six == 1)
				{
					six=32;
				}
				else
				{
					six=0;
				}
				
				FR=one+two+three+four+five+six;
				JOptionPane.showMessageDialog(null," Your age is : "+FR,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

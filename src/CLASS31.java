import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS31 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS31()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\31.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int res,age,year;
				String s;
				JOptionPane.showMessageDialog(null,"All like to read newspaper(much or less) \n Some of us read it more than one.(Suppose, reading news of play in the morning,reading news of magazine in the noon,reading news of editorial at night.....)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, I will find out your age from the number of your daily reading newspaper. \n But to play this game your age must be in the range of (10<=age<=99)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, multiply 2 with the number of reading daily newspaper and then add 5 (Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Again, multiply 50 with the previous result and then add 7 (Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, If your birthdate has come, then add the year of POLASHI_WAR(1757) with the previous result.(Use calculator) \n Now, Else if your birthdate has not come then add the next year of POLASHI_WAR(1758) with the previous result.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Now, subtract your birth year from the last output.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Look at the final output! \n Here last two digits indicate your age. \n And the other digit indicates the number of your reading newspaper.","Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

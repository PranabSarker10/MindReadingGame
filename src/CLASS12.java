import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS12 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS12()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\12.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
				JOptionPane.showMessageDialog(null," Again I have come to show you the repeation of your favorite number","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," This time it will show you more than before.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Among 1 to 9,  8 is my favourite number.\n So, I have kept it.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now (except 8) take one of your favourite number from 1 to 9.\n Multiply 9 with that.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now (except 8) set all the numbers from 1 to 9 serially.\n This creates a number of 7 digits.\n Multiply this with previous result of multiplication","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," You are watching your favourite number for 9 times..","Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

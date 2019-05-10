import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS7 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS7()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\7.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
                listen1 = (ActionEvent e) -> {

		    	JOptionPane.showMessageDialog(null," THINK A NUMBER(Remember it)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," NOW,multiply 3, then add 1 and again multiply 3(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," At last, add the number you have thought with the final result(use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now, the last digit of your output is : 3","Box",JOptionPane.INFORMATION_MESSAGE);	
				JOptionPane.showMessageDialog(null," And the number except the 3 is the number you have thought\n MAGIC!!!","Box",JOptionPane.INFORMATION_MESSAGE);	
           };
                
                ok.addActionListener(listen1);

                setSize(1365,770);
           }
      }

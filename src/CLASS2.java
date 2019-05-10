import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS2 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS2()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\2.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
         ActionListener listen1;
        listen1 = (ActionEvent e) -> {
		        JOptionPane.showMessageDialog(null,"Do you like to watch your favorite things more than one ?","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null," I will show you","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"Listen, as I am studing CSE, binary numbers( 0 & 1) are my favorite numbers.\n So, (Except 0 & 1 ) Guess any of your favorite number from 2-9 and kindly follow my instructions.","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"You will show your favourite number for five times!!!","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"Now take your favorite number from 2 to 9","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"Multiply 271 with that(USE CALCULATOR)","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"Again multiply 41 with the previous result(USE CALCULATOR)  and \nLOOK!!!!","Box",JOptionPane.INFORMATION_MESSAGE);
			    JOptionPane.showMessageDialog(null,"HA HA HA !!!!\n Mathematics can show us this kind of MAGIC!!!","Box",JOptionPane.INFORMATION_MESSAGE);
        };
        
        ok.addActionListener(listen1);
        
        setSize(1365,770);
   }
}

import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS3 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS3()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\3.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
         ActionListener listen1;
        listen1 = (ActionEvent e) -> {

				double father,mother,add,sub_main,mult_main,add_main;
				String sub,mult;
				JOptionPane.showMessageDialog(null,"Now let's play an easy mind reading game.\n Hope you can easily identify the trick.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Give me the Subtruction and Multiplication of your father's and mother's age.\n I will tell you the age of your father and the age of your mother","Box",JOptionPane.INFORMATION_MESSAGE);
				sub=JOptionPane.showInputDialog(null,"Enter the Subtraction : ","Input Box",JOptionPane.INFORMATION_MESSAGE);    		
			    mult=JOptionPane.showInputDialog(null,"Enter Multiplication : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				sub_main = (double)Double.parseDouble(sub);
				mult_main = (double)Double.parseDouble(mult);
				add=(sub_main*sub_main)+(4*mult_main);
				add_main=Math.sqrt(add);
				father=(add_main+sub_main)/2;
				mother=father-sub_main;
		        JOptionPane.showMessageDialog(null,"Age of your father:"+father,"Output Box",JOptionPane.INFORMATION_MESSAGE);
		        JOptionPane.showMessageDialog(null,"Age of your mother:"+mother,"Output Box",JOptionPane.INFORMATION_MESSAGE);	
        };
        
        ok.addActionListener(listen1);
        
        setSize(1365,770);
   }
}

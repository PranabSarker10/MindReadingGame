import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS24 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS24()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\24.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
			
				int RES,Eating_curry;
				String s;
				JOptionPane.showMessageDialog(null,"Suppose, you have eaten rice with some curries/curry(<7) \n Remember the number of curry.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now kindly eat same number of curries/curry agian. \n And count the total number of eating curry","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, multiply the previous result by 4.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, continuously subtract 7 from the previous result before the result is going under 0.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s=JOptionPane.showInputDialog(null,"How many time/times you become able to subtruct 7 :","Input Box",JOptionPane.INFORMATION_MESSAGE);
				RES = (int)Double.parseDouble(s);
				Eating_curry=(RES*8)-(RES*7);
				JOptionPane.showMessageDialog(null," Your total eaten curry number is : "+(Eating_curry*2),"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

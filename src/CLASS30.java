import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS30 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS30()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\30.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				double Pocket_money;
				String s;
				JOptionPane.showMessageDialog(null,"Hello my friend! \n I can show you the total amount of money present in your pocket. \n Just kindly follow my instruction(s).","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Calculate your total Taka(s) present in your pocket.\n And count the extras(Smaller than 1 Taka) separately as paisas.(If you have any)","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"First multiply the total amount of taka by 2 and then add 5","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Again, multiply the previous result by 50 and then add total paisa(s)(must be smaller 100 paisa(s)) \n As 1 taka =100 paisa(s). \n And taka is counted before.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, multiply the previous result by 4.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, subtract 1000 from the previous result.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s=JOptionPane.showInputDialog(null,"Enter the last output:","Input Box",JOptionPane.INFORMATION_MESSAGE);
				Pocket_money = (double)Double.parseDouble(s);
				JOptionPane.showMessageDialog(null," You have now in total = "+(Pocket_money/400)+" Taka(s)","Box",JOptionPane.INFORMATION_MESSAGE);           	    
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

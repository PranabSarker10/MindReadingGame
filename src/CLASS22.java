import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS22 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS22()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\22.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				JOptionPane.showMessageDialog(null,"Buy some Areca(In_bangla_shupari) by one taka","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, cut every Areca into 4 pieces.\n And count total pieces","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, give these pieces to the people who like that. \n You must have to give 1 piece to one human.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, take 2 Areca's from each of those people whom you have given 1 piece of Areca","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"At last, sell the total Arecas with the buying prize \n I mean, the number of Areca you have bought by 1 taka, sell the same number of Areca by 1 taka ","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Magic of Mathematics is telling me that you have earned 8 Taka(s)","Box",JOptionPane.INFORMATION_MESSAGE);        			
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

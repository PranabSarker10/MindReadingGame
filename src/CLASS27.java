import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS27 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS27()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\27.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int r,Res,First,Last,Second;
				String s;
				JOptionPane.showMessageDialog(null,"My friend, if your age is greater than 10, you can play it.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Multiply your age by 10./n(Remember this 1st multiplication.)","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now take the name of your favourite person.(You must take a nick name) \n (I mean, name must be smaller than 10)).","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"Now, multiply 9 with the digit number of your favourite person.\n(Remember this 2nd multiplication.)","Box",JOptionPane.INFORMATION_MESSAGE);        		
				JOptionPane.showMessageDialog(null,"At last, subtract 2nd multiplication from the 1st multiplication.","Box",JOptionPane.INFORMATION_MESSAGE);        		
				s=JOptionPane.showInputDialog(null,"Now enter the last output:","Box",JOptionPane.INFORMATION_MESSAGE);        		
				r=(int)Double.parseDouble(s);
				Res=r/10;
				Second=r-(Res*10);
				First=Res;
				Last=First+Second;
				JOptionPane.showMessageDialog(null,"Your age is = "+Last,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

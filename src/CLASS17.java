import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS17 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS17()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\17.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

			    long out,R=123456789,res,result;
				String s;
				JOptionPane.showMessageDialog(null," A gravitational field has negative energy.\n Matter has positive energy. \n The two values cancel out provided the universe is completely flat. \n In that case, the universe has zero(0) energy and can theoretically last forever. \n My this game is also with the universe of zero(0) energy.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"There are 10 digits in mathematics. \n As zero(0) is the energy of the universe, so (without 0) keep the other digits serially.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," It creates the number 123456789.","Box",JOptionPane.INFORMATION_MESSAGE);
				s=JOptionPane.showInputDialog(null,"Enter your favourite digit from that number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				res = (long)Double.parseDouble(s);
				result=res*9;
				JOptionPane.showMessageDialog(null," Now, multiply "+result+" with the 9 digits number(123456789)","Box",JOptionPane.INFORMATION_MESSAGE);
				out=R*result;
			    JOptionPane.showMessageDialog(null," Isn't your output : "+out+" ?? \n The universe of zero(0) energy(before last digit) with your favourite creations(repeated favourite number) !!!.","Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

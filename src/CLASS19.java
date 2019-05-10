import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS19 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS19()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\19.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
				int RES,R,out1,out2,out3,Word,Row,Page;
				String s;
				JOptionPane.showMessageDialog(null,"Take a book:","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"Take a Page number(As your wish). \n Take a  Row of that Page(<10). \n Take a Word of that Row(<10) \n (REMEMBER THESE THREE NUMBERS).","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, multiply 10 with the page number and then add 25.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, add the Row number with the previous result and then multiply 10.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, at last add the word number.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				s=JOptionPane.showInputDialog(null,"Enter the last output : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				R = (int)Double.parseDouble(s);        		
				RES=R-250;
				out1=RES/10;
				Word=RES-(out1*10);
				out2=out1/10;
				Row=out1-(out2*10);
				Page=out2;
				JOptionPane.showMessageDialog(null,"Your taken Page number is = "+Page+", Row number is = "+Row+", Word number is = "+Word,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

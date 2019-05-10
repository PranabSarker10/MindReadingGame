import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS1 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS1()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\1.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
         ActionListener listen1;
        listen1 = (ActionEvent e) -> {
        	 int qutient,remainder,FR,guess;
				String s;
				JOptionPane.showMessageDialog(null,"Take your total brothers/brother number: ","Box",JOptionPane.INFORMATION_MESSAGE);
		        JOptionPane.showMessageDialog(null,"Now kindly add 1;then multiply 2;then add 3 and then multiply 5  (use calculator): ","Box",JOptionPane.INFORMATION_MESSAGE);
		        JOptionPane.showMessageDialog(null,"At last add your total sisters/sister number: ","Input Box",JOptionPane.INFORMATION_MESSAGE);
		        
		        s=JOptionPane.showInputDialog(null,"Enter the FINAL_RESULT and I will show how many brothers and sisters you have : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
		        FR = (int)Double.parseDouble(s);
		        guess=FR-25;
		               
		        if(guess>=0 && guess<100)
		        {
	                qutient=guess/10;
	                remainder=guess%10;
	                JOptionPane.showMessageDialog(null,"Total brother:"+qutient,"Output Box",JOptionPane.INFORMATION_MESSAGE);
	                JOptionPane.showMessageDialog(null,"Total sister:"+remainder,"Output Box",JOptionPane.INFORMATION_MESSAGE);
	            }
		        else if(guess<0 || guess>=100)
		        {
		            JOptionPane.showMessageDialog(null,"YOU ARE TELLING LIE!!!!!!         OR          YOUR FAMILY HAVE NOT MAINTAIN FAMILY PLANNING : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
	            }
            
        };
         
         ok.addActionListener(listen1);
         
	setSize(1365,770);
    }
}

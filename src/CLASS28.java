import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS28 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS28()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\28.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int RES,R,out1,out2,out3,Sister,Best_friend,Brother;
				String s;
				JOptionPane.showMessageDialog(null,"If your best friend(s) and sister(s) both are smaller than 10, then this game is for you.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"At first, take your total brother(s) number.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, multiply 2 with the number and then add 3.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, multiply 5 with the previous result and then add your best friend(s) number with that.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"NOW, again multiply 10 with the previous result and then add your sister(s) number with that.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"At last, add 125 with the last output.(Use calculator)","Box",JOptionPane.INFORMATION_MESSAGE);
				s=JOptionPane.showInputDialog(null,"Enter the final result : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				R = (int)Double.parseDouble(s);        		
				RES=R-275;
				out1=RES/10;
				Sister=RES-(out1*10);
				out2=out1/10;
				Best_friend=out1-(out2*10);
				Brother=out2;
				JOptionPane.showMessageDialog(null,"Your brother(s) = "+Brother+", Best_friend(s) = "+Best_friend+", Sister(s) = "+Sister,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
           
           ok.addActionListener(listen1);

           setSize(1365,770);
      }
 }

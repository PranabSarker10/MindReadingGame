import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS5 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS5()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\5.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
                listen1 = (ActionEvent e) -> {
				JOptionPane.showMessageDialog(null," It's very tough to resist us from eating chocolates!!!!","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Yes,friends!!! \nThis game is about eating chocolates but ......","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," IN IMAGINATION...","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," LET's PLAY.\n Take some chocolates in imagination","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Take same number of chocolate/chocolates from your best friend for stocking and add it to the previous chocolate/chocolates.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," I also want to give you some chocolates. \n Add it.","Box",JOptionPane.INFORMATION_MESSAGE);
			    double x;
				String s;
				s=JOptionPane.showInputDialog(null,"How much you want to take from me ?? : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				x = (double)Double.parseDouble(s);
				x=x/2;
				JOptionPane.showMessageDialog(null," Now add it to the previous chocolates","Box",JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(null," Now give half of your total chocolates to a poor boy who likes it much.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," As your best friend also like chocolates so give his/her chocolate/chocolates that he/she had given to you for stock.","Box",JOptionPane.INFORMATION_MESSAGE);
		
				JOptionPane.showMessageDialog(null," Now, you have : "+x,"Box",JOptionPane.INFORMATION_MESSAGE);
				if(x!=0)
				{
					JOptionPane.showMessageDialog(null," Now eat!!!","Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null," As you have not taken chocolates from me so you have no chocolate available for eating","Box",JOptionPane.INFORMATION_MESSAGE);
				}
        	
           };
    
           ok.addActionListener(listen1);
    
           setSize(1365,770);
     }
}

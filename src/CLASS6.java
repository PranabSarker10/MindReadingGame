import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS6 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS6()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\6.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
                listen1 = (ActionEvent e) -> {
				int i,p,x,num1,Except_1st,length,my_guess_value,my_value,output;
				String s,st1,st,s_new="9";
				s=JOptionPane.showInputDialog(null,"FRIEND, How many odd amount of numbers you want to add(REMEMBER: Digits of every number have to be same) ?? : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				x = (int)Double.parseDouble(s);
				st1=JOptionPane.showInputDialog(null,"Enter your 1st number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
			    num1 = (int)Double.parseDouble(st1);
				length = (int)Math.log10(num1)+1;
				//JOptionPane.showMessageDialog(null," Length of each number : "+length,"Box",JOptionPane.INFORMATION_MESSAGE);
		        String repeated = new String(new char[length]).replace("\0",s_new);
		        my_guess_value = (int)Double.parseDouble(repeated);
		        //JOptionPane.showMessageDialog(null," My value : "+my_guess_value,"Box",JOptionPane.INFORMATION_MESSAGE);
		        Except_1st=(x-1)*my_guess_value;
		        output=Except_1st+num1;
		        JOptionPane.showMessageDialog(null," Now, the next "+(x-1)+" numbers will be inputed equally by us","Box",JOptionPane.INFORMATION_MESSAGE);
				
		        JOptionPane.showMessageDialog(null," But before, I am telling you that the output will be : "+output,"Box",JOptionPane.INFORMATION_MESSAGE);
		        
				for(i=0;i<=(x-2);i=i+2)
				{
				    st=JOptionPane.showInputDialog(null,"Enter your number no : "+(i+2),"Input Box",JOptionPane.INFORMATION_MESSAGE);
				    p = (int)Double.parseDouble(st);
					
				    my_value=my_guess_value-p;
				    JOptionPane.showMessageDialog(null," My value no "+(i+3)+" is : "+my_value,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				JOptionPane.showMessageDialog(null," Now, the addition of this "+(x)+" odd numbers are :"+output+"\n If you want to prove, use calculator.","Box",JOptionPane.INFORMATION_MESSAGE);
          };
    
          ok.addActionListener(listen1);

          setSize(1365,770);
     }
}

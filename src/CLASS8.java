import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS8 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS8()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\8.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {
		    	int x,number,last_3,first,last_1,out;
				String s;
				s=JOptionPane.showInputDialog(null,"FRIEND, Input the cube of a 2 digits number : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				x = (int)Double.parseDouble(s);
				first=x/1000;
				last_3=x-(first*1000);
				out=last_3/10;
				last_1=last_3-(out*10);
				//if(last_1 == 0)
				//{
			//		last_1=0;
			//	}
			//	else if(last_1 == 1)
			//	{
			//		last_1=1;
			//	}
				else if(last_1 == 2)
				{
					last_1=10-2;
				}
				else if(last_1 == 3)
				{
					last_1=10-3;
				}
			//	else if(last_1 == 4)
			//	{
			//		last_1=4;
			//	}
			//	else if(last_1 == 5)
			//	{
			//		last_1=5;
			//	}
			//	else if(last_1 == 6)
			//	{
			//		last_1=6;
			//	}
				else if(last_1 == 7)
				{
					last_1=10-7;
				}
				else if(last_1 == 8)
				{
					last_1=10-8;
				}
			//	else if(last_1 == 9)
			//	{
			//		last_1=9;
			//	}
				JOptionPane.showMessageDialog(null," Here I have applied a different process to show you the number you have cubed","Box",JOptionPane.INFORMATION_MESSAGE);
				if(0<=first && first<1)
				{
					first=0;
				}
				else if(1<=first && first<8)
				{
					first=1;
				}
				else if(8<=first && first<27)
				{
					first=2;
				}
				else if(27<=first && first<64)
				{
					first=3;
				}
				else if(64<=first && first<125)
				{
					first=4;
				}
				else if(125<=first && first<216)
				{
					first=5;
				}
				else if(216<=first && first<343)
				{
					first=6;
				}
				else if(343<=first && first<512)
				{
					first=7;
				}
				else if(512<=first && first<729)
				{
					first=8;
				}
				else if(first>729)
				{
					first=9;
				}
		        number=(first*10)+last_1;
				JOptionPane.showMessageDialog(null,"The number you have cubed is = "+number,"Box",JOptionPane.INFORMATION_MESSAGE);
           };
                
                ok.addActionListener(listen1);

                setSize(1365,770);
           }
      }

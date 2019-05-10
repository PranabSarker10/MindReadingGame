import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS18 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS18()
    {
        setTitle("");
	setSize(720,720);
	
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\MIND READING GAME\\PROJECT IMAGES\\18.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

				int res;
				String x,y,z,A,B,C,pencil;
				JOptionPane.showMessageDialog(null," Dear friend, to play this game, call your two other friends. \n Because in this interesting game, I need in total 3 persons.","Box",JOptionPane.INFORMATION_MESSAGE);
				A=JOptionPane.showInputDialog(null," Enter your name(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				B=JOptionPane.showInputDialog(null," Enter one of your friend name(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				C=JOptionPane.showInputDialog(null," Enter another of your friend name(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Take 3 small stationary things by which the game will start.","Box",JOptionPane.INFORMATION_MESSAGE);
				x=JOptionPane.showInputDialog(null," Enter one of your taken things(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				y=JOptionPane.showInputDialog(null," Enter another one of your taken things(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				z=JOptionPane.showInputDialog(null," Enter the last one of your taken things(ALL ARE CAPITAL LETTERS): ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," As I like to draw picture, so think I have put a packet of color pencil(s) on the table(which has 24 different color pencils).","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now, "+A+" takes 1, "+B+" takes 2 and "+C+" takes 3 color pencil(s) from the packet.","Box",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null," Now, who has hidden "+x+", again take same number of pencil(s), you have taken before from the packet;\n Who has hidden "+y+" again take double number of pencil(s), you have taken before from the packet and \n Who has taken "+z+" again take fourfold number of pencil(s), you have taken before from the packet.","Box",JOptionPane.INFORMATION_MESSAGE);
				pencil=JOptionPane.showInputDialog(null," Now, enter the number of pencil(s) present on the packet: ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				res = (int)Double.parseDouble(pencil);
				if(res == 1)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+x+", "+B+" have taken "+y+" and "+C+" have taken "+z,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(res == 3)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+x+", "+B+" have taken "+z+" and "+C+" have taken "+y,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(res == 2)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+y+", "+B+" have taken "+x+" and "+C+" have taken "+z,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(res == 5)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+y+", "+B+" have taken "+z+" and "+C+" have taken "+x,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(res == 6)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+z+", "+B+" have taken "+x+" and "+C+" have taken "+y,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(res == 7)
				{
					JOptionPane.showMessageDialog(null," "+A+" have taken "+z+", "+B+" have taken "+y+" and "+C+" have taken "+x,"Box",JOptionPane.INFORMATION_MESSAGE);
				}
           };
           
           ok.addActionListener(listen1);

           setSize(1365,760);
      }
 }

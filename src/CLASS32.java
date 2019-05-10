import java.awt.*;
import java.awt.FlowLayout; //The class FlowLayout components in a left-to-right flow.
import java.awt.event.ActionEvent; // add ActionListener to a JButton. 
import java.awt.event.ActionListener;//to perform the desired action is performed
import javax.swing.ImageIcon;//To insert images
import javax.swing.JButton;//to create button
import javax.swing.JFrame;//To create Frame as user desires
import javax.swing.JLabel;// To create JLabel
import javax.swing.*;

public class CLASS32 extends JFrame {
    JButton ok;
     JLabel l1;
    public CLASS32()
    {
        setTitle("");
	setSize(720,720);
	
	setVisible(true);
	setContentPane(new JLabel(new ImageIcon("D:\\WORKSPACE\\PRANAB\\PROJECT IMAGES\\32.jpg")));
	setLayout(new FlowLayout());//Constructs a new FlowLayout with a centered alignmD:\\MIND READING GAME\\PROJECT IMAGES\\ent and a default 5-unit horizontal and vertical gap.
    l1=new JLabel("                       ***Welcome To The Mathematics World***                        ");
        ok=new JButton("Enter");
       
	add(l1);
	add(ok);
        
           ActionListener listen1;
           listen1 = (ActionEvent e) -> {

		  		int FIRST,SECOND,THIRD,D,A,Y,M,Y_1st_two,Y_last_two,wanted_day,JANUARY=11,FEBRUARY=12,MARCH=1,APRIL=2,MAY=3,JUNE=4,JULY=5,AUGUST=6,SEPTEMBER=7,OCTOBER=8,NOVEMBER=9,DECEMBER=10;
			     double FIRST_PRE,M_PRE,M_PRE_OUT;
			     JOptionPane.showMessageDialog(null," Dear friend,if you input date,month & year of a day, I can tell you the day.","Box",JOptionPane.INFORMATION_MESSAGE);
			     String s1,s2,s3;
				 s1=JOptionPane.showInputDialog(null,"Enter the date : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				 D = (int)Double.parseDouble(s1);
				 s2=JOptionPane.showInputDialog(null,"Enter the Month number : (For January=1,February=2,March=3,April=4,May=5,June=6,July=7,August=8,September=9,October=10,November=11 & December=12)","Input Box",JOptionPane.INFORMATION_MESSAGE);
		        M = (int)Double.parseDouble(s2);
				 s3=JOptionPane.showInputDialog(null,"Enter the Year(Must be equal or greater than 1000) : ","Input Box",JOptionPane.INFORMATION_MESSAGE);
				 Y = (int)Double.parseDouble(s3);	 
				 //M = (s2 == "JANUARY") ? JANUARY : ((s2 == "FEBRUARY") ? FEBRUARY : ((s2 == "MARCH") ? MARCH : ((s2 == "APRIL") ? APRIL : ((s2 == "MAY") ? MAY : ((s2 == "JUNE") ? JUNE : ((s2 == "JULY") ? JULY : ((s2 == "AUGUST") ? AUGUST : ((s2 == "SEPTEMBER") ? SEPTEMBER : ((s2 == "OCTOBER") ? OCTOBER : ((s2 == "NOVEMBER") ? NOVEMBER : DECEMBER))))))))));
				 
				 if(M==1)
				 {
					 M=11;
					 Y=Y-1;
				 }  		
				 else if(M==2)
				 {
					 M=12;
					 Y=Y-1;
				 }
				 else if(M==3)
				 {
					 M=1;
				 }
				 else if(M==4)
				 {
					 M=2;
				 }
				 else if(M==5)
				 {
					 M=3;
				 }
				 else if(M==6)
				 {
					 M=4;
				 }
				 else if(M==7)
				 {
					 M=5;
				 }
				 else if(M==8)
				 {
					 M=6;
				 }		
				 else if(M==9)
				 {
					 M=7;
				 }		
				 else if(M==10)
				 {
					 M=8;
				 }		
				 else if(M==11)
				 {
					 M=9;
				 }				        
				 else if(M==12)
				 {
					 M=10;
				 }		
				 //JOptionPane.showMessageDialog(null," Month : "+M,"Box",JOptionPane.INFORMATION_MESSAGE);
				 Y_1st_two=Y/100;
				 //JOptionPane.showMessageDialog(null," 1st two digits of the year : "+Y_1st_two,"Box",JOptionPane.INFORMATION_MESSAGE);
				 Y_last_two= Y-(Y_1st_two*100);		 
				 //JOptionPane.showMessageDialog(null," Last two digits of the year : "+Y_last_two,"Box",JOptionPane.INFORMATION_MESSAGE);
				 M_PRE_OUT=2.6*(double )M;
				 //JOptionPane.showMessageDialog(null," M_PRE_OUT : "+M_PRE_OUT,"Box",JOptionPane.INFORMATION_MESSAGE);
				 FIRST_PRE=(M_PRE_OUT-0.2);
				 //JOptionPane.showMessageDialog(null," FIRST_PRE : "+FIRST_PRE,"Box",JOptionPane.INFORMATION_MESSAGE);
				 FIRST=(int)FIRST_PRE;
				 //JOptionPane.showMessageDialog(null," FIRST : "+FIRST,"Box",JOptionPane.INFORMATION_MESSAGE);
				 SECOND=Y_last_two/4;
				 //JOptionPane.showMessageDialog(null," SECOND : "+SECOND,"Box",JOptionPane.INFORMATION_MESSAGE);
				 THIRD=Y_1st_two/4;
				 //JOptionPane.showMessageDialog(null," THIRD : "+THIRD,"Box",JOptionPane.INFORMATION_MESSAGE);
				 A=FIRST+D+Y_last_two+SECOND+THIRD-(2*Y_1st_two);
				 //JOptionPane.showMessageDialog(null," A : "+A,"Box",JOptionPane.INFORMATION_MESSAGE);
				 if(A<0)
				 {
				     A=-(A);
				     A=A%7;
				     wanted_day=7-A;
				 }
				 wanted_day=A%7;
				 //JOptionPane.showMessageDialog(null," WANTED_DAY : "+wanted_day,"Box",JOptionPane.INFORMATION_MESSAGE);
				 if(wanted_day==6)
				 {
					 JOptionPane.showMessageDialog(null,"SATURDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }
				 else if(wanted_day==0)
				 {
					 JOptionPane.showMessageDialog(null,"SUNDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }
				 else if(wanted_day==1)
				 {
					 JOptionPane.showMessageDialog(null,"MONDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }				 
				 else if(wanted_day==2)
				 {
					 JOptionPane.showMessageDialog(null,"TUESDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }
				 else if(wanted_day==3)
				 {
					 JOptionPane.showMessageDialog(null,"WEDNESDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }
				 else if(wanted_day==4)
				 {
					 JOptionPane.showMessageDialog(null,"THUSDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }
				 else if(wanted_day==5)
				 {
					 JOptionPane.showMessageDialog(null,"FRIDAY","Box",JOptionPane.INFORMATION_MESSAGE);
				 }				 
           };
           
           ok.addActionListener(listen1);

           setSize(1370,770);
      }
 }

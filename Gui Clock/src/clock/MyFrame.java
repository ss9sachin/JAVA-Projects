package clock;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame  {
 Calendar calender;
 JLabel label;
 JLabel label2; 
 SimpleDateFormat timeFormat;
 SimpleDateFormat dayFormat;
 String time;
 String day;
 
 	MyFrame() throws InterruptedException{
 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		this.setLayout(new FlowLayout());
 		this.setSize(350,200);
 		this.setTitle("CLOCK");
 		//this.setResizable(false);
 		this.setLocationRelativeTo(null);
 		
 		label = new JLabel();
 		label.setSize(60,40);
 		label.setFont(new Font("New Roman",Font.PLAIN,50));
 		label.setForeground((Color.RED));
 		label.setBackground(Color.BLACK);
 		label.setOpaque(true);
 		
 		label2= new JLabel();
 		label2.setSize(30,20);
 		label2.setFont(new Font("New Roman",Font.PLAIN,30));
 		label2.setForeground((Color.GREEN));
 		label2.setBackground(Color.BLACK);
 		label2.setOpaque(true);
 		
 		timeFormat = new SimpleDateFormat("hh:mm:ss a");
 		dayFormat = new SimpleDateFormat("d MMMMM y");
 		
 		
 		
 		
 		this.add(label);
 		this.add(label2);
 		this.setVisible(true);
 		timeMethod();
 		
 	}
 	public void timeMethod() throws InterruptedException {
 		while(true) {
 		time = timeFormat.format(Calendar.getInstance().getTime());
 		label.setText(time);
 		
 		day = dayFormat.format(calender.getInstance().getTime());
 		label2.setText(day);
 		
 		Thread.sleep(1000);
 	
 		}
 	}
 	
 
}

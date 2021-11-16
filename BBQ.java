 

import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
 import java.awt.*;  
import javax.swing.*;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
public class BBQ  {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//BBq.jpg"; 
 void   B() throws IOException {

        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 BBQ() {
     System.out.println("*****Barbeque Nation*****");
     System.out.println("Barbeque nation stands as one of the major barbeque restaurants across the country. .    ");
     System.out.println(" They have pioneered the use of barbeque or grill on the table .");
     System.out.println("With ample live counters for exotic meat, kulfi and special one’s set-up for festivals, a meal at Barbeque Nation is usually an affair of pomp and gaiety.");  
     
}
}

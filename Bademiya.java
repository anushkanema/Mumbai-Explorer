 

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
public class Bademiya  {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//Bademia.jpg"; 
 void   B() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 Bademiya() {
    System.out.println("\f");
    System.out.println("*****Bademiya*****");
     System.out.println("Bademiya is one of the legendary joint out there for the hardcore non vegetarian buff ");
     System.out.println(" It's one of the finest places to have authentic mughlai delicacies.");
     System.out.println("Tulloch Road, Apollo Bunder, Colaba Behind Taj Palace Hotel, Near Gateway of India");  
     
}
}

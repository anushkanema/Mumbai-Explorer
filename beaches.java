 

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
public class beaches   {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//BEACHES.jpg"; 
 void   b() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 beaches() {
    System.out.println("\f");
      System.out.println("*****BEACHES****");
      System.out.println("Girgaon Chowpatty served by the Charni Road railway station. The beach is noted for its Ganesh Visarjan celebrations when thousands of people from all over Mumbai and Pune come to immerse the idols of Lord Ganesh in the Arabian Sea. I ");
      System.out.println("");
      System.out.println(" Marine Drive is a 3.6-kilometre-long Promenade along the Netaji Subhash Chandra Bose Road in Mumbai, India. Often, the names Marine Drive and Marines are used interchangeably to refer to this 3.9 km stretch. ");
      System.out.println("");
      System.out.println("Juhu Beach is located on the shores of the Arabian Sea. It stretches for six kilometres up to Versova.The short, rocky formations make up the Juhu Beach unlike the Marina Beach in Chennai that is primarily sandy ");
}
}

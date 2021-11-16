 

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
public class Social  {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//Social.jpg"; 
 void   So() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 Social() {
     System.out.println("*****Social*****");
     System.out.println("Social is a space that blends the best of the office and the café.");
     System.out.println();
     System.out.println("Social is a collaborative workspace, a hub for artists and innovators.");
     System.out.println();
     System.out.println("Combining work and play, it's an urban hangout designed to take you offline while still keeping you connected.");  
     System.out.println();
}
}

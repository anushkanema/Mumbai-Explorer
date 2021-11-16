 

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
public class antiques  {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//ANTIQUES.jpg"; 
 void   R() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 antiques() {
    
    System.out.println("***********Antiques**********");
    System.out.println("The Gateway of India is an arch-monument .It was erected to commemorate the landing in December 1911 at Apollo Bunder, Mumbai of King-Emperor George V and Queen-Empress Mary, the first British monarch to visit India. ");
    System.out.println("");
    System.out.println("The Taj Mahal Palace Hotel is a heritage, five-star, luxury hotel built in the Saracenic Revival style in the Colaba area of Mumbai, Maharashtra, India, situated next to the Gateway of India. ");
    System.out.println("");
    System.out.println("Chhatrapati Shivaji Maharaj Vastu Sangrahalaya, formerly Prince of Wales Museum of Western India, is a museum in Mumbai which documents the history of India from prehistoric to modern times.");
     
}
}

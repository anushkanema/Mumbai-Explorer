 

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
public class KapoorKulfi  {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//Kapoor.jpg"; 
 void   K() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
        ImageIcon icon = new ImageIcon(img); 
        JLabel label = new JLabel(icon);  
        frame.add(label);
}
 KapoorKulfi () {
     System.out.println("*****Kapoor Kulfi*****");
     System.out.println("Calorie concious keep away! The place has some yummy kulfis for those who want to satisfy their sweet tooth urges. ");
     System.out.println(" Various kulfis served with falooda. Kesar malai is worth a try.");
     System.out.println("17, Bhel Plaza, Chowpatty Beach, Near Birla Kreda Kendriya, Chowpatty, Mumbai");  
     
}
}

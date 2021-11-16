 

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
public class   religious {
    JFrame frame= new JFrame();
    JFrame frame1= new JFrame();
    JLabel label= new JLabel();
    JLabel label1= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//Religious Places.jpg"; 
 void   R() throws IOException {

        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        BufferedImage img = ImageIO.read(new File(IMG_PATH)); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
		frame.add(label);
}
 religious() {
     System.out.println("\f");
     System.out.println("******Religious Places*****");
     System.out.println("The Shree Siddhivinayak Ganapati Mandir is a Hindu temple dedicated to Lord Shri Ganesh. It is located in Prabhadevi, ");
     System.out.println("");
     System.out.println(" ISKON - 4-acre Hare Krishna compound featuring a monumental marble temple & a vegetarian buffet restaurant.");
     System.out.println("");
     System.out.println(" The Mahalaxmi Temple is dedicated to Mahalakshmi the central deity of Devi Mahatmyam. The temple was built in 1831 by Dhakji Dadaji, a Hindu merchant.");
     System.out.println("");
     System.out.println(" The Haji Ali Dargah is a mosque and dargah or the monument of Pir Haji Ali Shah Bukhari.An exquisite example of Indo-Islamic Architecture, associated with legends about doomed lovers, the dargah contains the tomb of Haji Ali Shah Bukhari.");
     System.out.println("");
     System.out.println(" The Basilica of Our Lady of the Mount, more commonly known as Mount Mary Church, is a Roman Catholic Basilica located in Bandra, Mumbai. The feast of the Blessed Virgin Mary is celebrated here on the first Sunday after 8 September, the birthday of the Virgin Mary.");
}
}

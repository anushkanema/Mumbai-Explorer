 

//APP Cover page
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
public class launch extends menu  implements ActionListener   {
    JFrame frame= new JFrame();
    JLabel label= new JLabel();
    JButton myButton=new JButton("MENU");
    static String IMG_PATH="C://Users//anushkan//Documents//Mumbai Explorer//Pics//APP cover page.jpg"; 
    launch () throws IOException {
        //creating frame
        
        frame.setTitle("APP");
        frame.setSize(420,1020);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        //frame.setResizable(false);
        ImageIcon image = new ImageIcon("C://Users//anushkan//Documents//Mumbai Explorer//Pics//APP Cover page.jpg");
        frame.setIconImage(image.getImage());
       
        //frame.getContentPane().setBackground(new Color(0x123456));
        //creating labels
        myButton.setBounds(0,100,100,0);
        myButton.setFocusable(false);
        
        myButton.addActionListener(this);
        BufferedImage img = ImageIO.read (new File(IMG_PATH) ); 
		ImageIcon icon = new ImageIcon(img); 
		JLabel label = new JLabel(icon);  
 
        
        
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        //label.setBounds (250,250,250,250);
        myButton.setBounds(10,30,20,40);
        myButton.setFocusable(false);
        
        myButton.addActionListener(this);
        
        frame.add(label);
        frame.add(myButton);
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==myButton){
            menu option = new menu();
        }
    }
}
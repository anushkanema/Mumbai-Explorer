 

import java.awt.*;  
import javax.swing.*;  
  import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class tourist  implements ActionListener {  
JFrame f;  
JButton b1=new JButton("ANTIQUES");  
JButton b2=new JButton("THE BLUE SEA");
JButton b3=new JButton("RELIGIOUS PLACES");
    
    
tourist(){  
    f=new JFrame();  
      
    
    
     ImageIcon image = new ImageIcon("C://Users//anushkan//Documents//Mumbai Explorer//Pics//logo.jpg");
        f.setIconImage(image.getImage());
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
    b1.setHorizontalAlignment(JLabel.CENTER);
    b2.setVerticalAlignment(JLabel.CENTER);
    f.add(b1);f.add(b2);f.add(b3);
  
    f.setLayout(new GridLayout(1,0));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
@Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b1){
            antiques option = new antiques();
        }
        else if(e.getSource()== b2){
            beaches option = new beaches ();
        }
        else if(e.getSource()== b3){
            religious option = new religious ();
        }
    }
    public static void main(String[] args) {  
    new tourist();  
}  
}
    
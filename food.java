 

import java.awt.*;  
import javax.swing.*;  
  import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class food  implements ActionListener {  
JFrame f;  
JButton b2=new JButton("1.Street Food");  
    JButton b3=new JButton("2. Fine Dine");  
food(){  
    f=new JFrame();  
      
   
     ImageIcon image = new ImageIcon("C://Users//anushkan//Documents//Mumbai Explorer//Pics//logo.jpg");
        f.setIconImage(image.getImage());
       b2.addActionListener(this);
       b3.addActionListener(this);
    
    f.add(b2);f.add(b3);
  
    f.setLayout(new GridLayout(1,0));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
@Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b2){
            Streetfood option = new Streetfood();
        }
        if(e.getSource()== b3){
            finedine option = new finedine();
        }
    }
    public static void main(String[] args) {  
    new food();  
}  
}
    
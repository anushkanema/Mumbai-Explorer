 

import java.awt.*;  
import javax.swing.*;  
  import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File; 
import java.io.IOException; 
 
public class shop implements ActionListener{  
JFrame f;  
 
    JButton b2=new JButton("FASHION STREET");  
    JButton b3=new JButton("MALLS ");  
    JButton b4=new JButton("CRAWFORD MARKET");  
    JButton b5=new JButton("CHOR BAZAR");  
   
shop() {  
    f=new JFrame();  
     
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    
    f.setLayout(new GridLayout(1,0));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
@Override 
   
        public void actionPerformed(ActionEvent e)  {
       if(e.getSource()== b2){
          Fashionstreet option=new Fashionstreet();
        }
        else if(e.getSource()== b3){
            malls option = new malls();     }
    else if(e.getSource()== b4){
crawford option =new crawford();
}
else if(e.getSource()== b5){
    chorbazar option = new chorbazar();
        }
    }
public static void main(String[] args) {  
    new shop();  
}  
}
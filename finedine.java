 

import java.awt.*;  
import javax.swing.*;  
import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class finedine implements ActionListener {  
JFrame f;  
JButton b1=new JButton("1. BBQ NATION");  
JButton b2=new JButton("2. SOCIAL");  
JButton b3=new JButton("3. TEA VILLA CAFE");  

finedine(){  
    f=new JFrame();  
      
      
    
     ImageIcon image = new ImageIcon("C://Users//LENOVO//oopsmini//logo.jpg");
        f.setIconImage(image.getImage());
       b2.addActionListener(this);
       b3.addActionListener(this);
        b1.addActionListener(this);
      
    b1.setHorizontalAlignment(JLabel.CENTER);
    b2.setVerticalAlignment(JLabel.CENTER);
    f.add(b1);
    f.add(b2);
    f.add(b3);
  
    f.setLayout(new GridLayout(0,1));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
@Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b1){
             Social option = new  Social() ;
            
        }
        else if(e.getSource()== b2){
            TeaVilla option = new TeaVilla();
        }
        else if(e.getSource()== b3){
            BBQ option= new BBQ();
            
        }
        
    }
    public static void main(String[] args) {  
    new finedine();  
}  
}
    
 

import java.awt.*;  
import javax.swing.*;  
  import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Streetfood  implements ActionListener {  
JFrame f;  
JButton b1=new JButton("");  
JButton b2=new JButton("Dosa and Vada Pav");  
JButton b3=new JButton("Kulfi");  
JButton b4=new JButton(" Pav Bhaji"); 
JButton b5=new JButton("Rolls and Biryani");
JButton b6=new JButton("Icecream Sandwich"); 
Streetfood(){  
    f=new JFrame();  
      
    JLabel b1=new JLabel("");  
    
     ImageIcon image = new ImageIcon("C://Users//anushkan//Documents//Mumbai Explorer//logo.jpg");
        f.setIconImage(image.getImage());
       b2.addActionListener(this);
       b3.addActionListener(this);
        b4.addActionListener(this);
       b5.addActionListener(this);
        b6.addActionListener(this);
       
    b1.setHorizontalAlignment(JLabel.CENTER);
    b2.setVerticalAlignment(JLabel.CENTER);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
  
    f.setLayout(new GridLayout(0,1));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
@Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b6){
             Rustom option = new  Rustom() ;
            
        }
        else if(e.getSource()== b2){
            AnandStall option = new AnandStall();
        }
        else if(e.getSource()== b3){
            KapoorKulfi option = new KapoorKulfi();
            
        }else if(e.getSource()== b4){
            Sardar option= new Sardar();
            
        }else if(e.getSource()== b5){
            Bademiya option = new Bademiya();
        }
        
    }
    public static void main(String[] args) {  
    new Streetfood();  
}  
}
    
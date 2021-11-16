 

import java.awt.*;  
import javax.swing.*;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class menu    implements ActionListener {
    JFrame frame= new JFrame();
    JLabel label =new JLabel ("******PLAN TODAY?******");
    JLabel label1 =new JLabel ();
    JLabel label2 =new JLabel ();
    JLabel label3 =new JLabel ();
    JButton b1=new JButton("SHOP-HOP");  
    JButton b2=new JButton("EAT-TREAT");  
    JButton b3=new JButton("TRIP!!");
    menu (){
        label.setBounds(0,0,100,150);
        label.setText("*****WHAT'S UP TODAY?*****");
        label1.setBounds(0,20,100,150);
        label1.setText("1.SHOPPING ");
        label2.setBounds(0,40,100,150);
        label2.setText("2.FOOD ");
        label3.setBounds(0,60,100,150);
        label3.setText("3.PLACES ");
        label.setFont(new Font("Serif",Font.BOLD,12));
        label1.setFont(new Font("Serif",Font.BOLD,12));
        label2.setFont(new Font("Serif",Font.BOLD,12));
        label3.setFont(new Font("Serif",Font.BOLD,12));
        
       
      
    b1.setBounds(10,20,100,150);
    b1.addActionListener(this);
    b2.setBounds(20,60,100,150); 
    b3.setBounds(40,80,100,150); 
    b2.addActionListener(this);
    b3.addActionListener(this);
    frame.setTitle("Menu");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(7,2));
        //frame.setResizable(false);
        ImageIcon image = new ImageIcon("C://Users//anushkan//Documents//Mumbai Explorer//Pics//logo.jpg");
        frame.setIconImage(image.getImage());
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(b1);frame.add(b2);frame.add(b3);
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b1){
            shop option = new shop();
        }
        else if(e.getSource()== b2){
            food option = new food();
        }
        else if(e.getSource()== b3){
            tourist option = new tourist();
        }
        
    }
}

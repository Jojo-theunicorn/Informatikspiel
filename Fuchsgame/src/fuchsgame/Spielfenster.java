/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuchsgame;

//import java.awt.Dimension;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
// import javax.swing.JLabel;

  /**
 *
 * @author Sergio
 */


    
    public class Spielfenster extends JFrame{

        int x1 , y1;
        int x2;
        int x3 ;
        private Image dbImage;
        private Graphics dbg;
        Image Fuchs;
   
              public class Al extends KeyAdapter {
    
     
    public void keyPressed(KeyEvent t) {
        int KeyCode = t.getKeyCode();
       
        //Rand
        
        if(KeyCode == t.VK_LEFT){
            //Rand
        /*   if( x1<=0 ) 
             x1 -= 0;
           
        else */ 
            x1-=8;
            x2-=8;
            x3-=8;
            
        /*    if (x2<=-150)
                x2 -=0;
            if (x3<=-150)
                x3 -=0;
           */
        } 
        
        if(KeyCode == t.VK_RIGHT){
            //Rand
       /*if( x3>=0)
            x3 +=0 ;
            else */
          x1 +=8 ;
       x2 +=8 ;
       x3 +=8 ;
     
       
        }
    }
    public void KeyReleased(KeyEvent t) {
    }
    
               } 
        
          
           
         // JPanel Spielframe = new javax.swing.JPanel();        
           
        
           // JLabel meinArray;
         
            public Spielfenster() {
            
          ImageIcon i = new ImageIcon ("D://Users/Sergio/Desktop/Netbeans/Fuchsgame/src/bilder/swiper.png");
          Fuchs = i.getImage();
              
     //Fenster
                
        addKeyListener(new Al());
        setLayout(null);
        setVisible(true);
        setTitle("Das BESTE Fuchsgame");
        setSize(800, 600);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(Color.GREEN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
         
        x1 = 100;
        y1 = 480;
        x2 = x1+250;
        x3 = x1+500;
        
       
        
                
        
     
        
        
        
        //Hintergrundbild
        
        /*  public void paintComponent(Graphics g) { 
          
        Image img = Toolkit.getDefaultToolkit().getImage(  
     Spielfenster.class.getResource("/bilder/cover.jpg"));  
     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
        }; 
    
        
       //array für den Hintergrund
            meinArray = new JLabel("noooooooooooooooooooooooin");
        meinArray.setBounds(0,0, 800, 10);
         add (meinArray);
        } */
        
            
            }
    
     public void paint(Graphics g) {
         dbImage = createImage(getWidth(), getHeight());
         dbg = dbImage.getGraphics();
         paintComponent (dbg);
         g.drawImage(dbImage, 0, 0, this);
        
     }   

    
    public void paintComponent (Graphics g){
        
      g.drawImage(Fuchs, x1, y1, this);
      g.drawImage(Fuchs, x2, y1, this); 
      g.drawImage(Fuchs, x3, y1, this);
    
    repaint();
    
    }
   
    }
    

          

    
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javax.swing.*;

public class Fenetre extends JFrame {
	
	JTextPane txt ;
    public Fenetre(){
        
        this.setTitle("Ma première fenêtre java");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        Font f = new Font("TimesRoman",Font.BOLD,20);
         txt = new JTextPane();
         txt.setFont(f);
         txt.setBackground(Color.BLACK);
         txt.setForeground(Color.white);
         txt.setSize(200, 200);
         this.add(txt);
        this.setVisible(true);
}
        
        public static void main(String s[]){
        	Fenetre f = new Fenetre();
        	String[] fontes=Toolkit.getDefaultToolkit().getFontList();
        	for(String x : fontes){
        		System.out.println(x);
        	}
        }
        
}

 
 


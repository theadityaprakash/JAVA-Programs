package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    myFrame(){
        this.setSize(500,500);
        this.setTitle("log in Window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        ImageIcon image =new ImageIcon("JavaSwing/icon1.png");
        this.setIconImage(image.getImage());

        //this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(new Color(160, 47, 47));
    }
    
}

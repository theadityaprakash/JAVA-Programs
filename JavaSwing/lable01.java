package JavaSwing;

import javax.swing.*;

public class lable01 {
    public static void main(String[] args) {

        //JLable = a GUI display area for a string of text, an image or both
        JFrame frame=new JFrame();

        ImageIcon imag =new ImageIcon("icon1.png");

        JLabel label=new JLabel();  //created a lable
        label.setText("hii there i m java Swing ");  //set text of lable
        //label.setBounds(100,100,400,400);//
        label.setIcon(imag);
        label.setOpaque(true);


//        frame.setLayout(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("lable window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
//        frame.setIconImage(imag.getImage());
        frame.setVisible(true);
    }
}




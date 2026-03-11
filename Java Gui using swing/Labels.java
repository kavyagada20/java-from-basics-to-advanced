import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
//import javax.swing.border.*;
//import java.awt.Paint;
import javax.swing.ImageIcon;

/**
 * Labels
 */
public class Labels {

    public static void main(String[] args) {

        //JLabel =a GUI display area for a string of text,an image, or both.

        ImageIcon image=new ImageIcon("Google.jpeg");

        

        JLabel label = new JLabel();//create label
        label.setText("Bro,do you even code?");//Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of the imageicon.
        label.setVerticalTextPosition(JLabel.TOP);//Set the text TOP,CENTER OR BOTTOM OF THE IMAGEICON.
        label.setForeground(Color.green);//set font color of the text
        label.setFont(new Font("MV Boli",Font.PLAIN,50));//Set font of the text
        label.setIconTextGap(20);//set gap of the text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);//Set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal of icon+text within label
        //label.setBounds(0, 0, 250, 250);//Set x,y position within frame as well as dimension.

        
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();//add all the components before the pack method
    }
}
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        //JFrame=A GUI indow to add components to
       // JFrame frame =new JFrame();//creates a frame
        
        // frame.setVisible(true);//makes frame visible
        // frame.setSize(420,420);//setes x and y dimenison of our frame.
        // frame.setTitle("JFrame titles gos here");//sets the titles of the frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out the application
        // frame.setResizable(true);// to resize the frame

        // ImageIcon image=new ImageIcon("Logo.jpeg");//Create an image icon
        // frame.setIconImage(image.getImage());//change icon of the frame
        // /* It is used for the default color
        // frame.getContentPane().setBackground(Color.green);//Change color of the background

        // For the custom color we must use the folowwing code snippet:-
        // */

        // frame.getContentPane().setBackground(new Color(123,230,10));//change color of the background;we must enter the rgb value from 0 to 255 for all value:-(255,0,0) is red ;(0,255,0) is green and (0,0,255) is blue and (0,0,0) is black.We can also places color input in term of hexadecimal strating with the 0x along with 6digits in the following :-0x000000 is black and 0xFFFFFF is white.
        

/*There are 2 ways in can create a frame:1)we can create a frame with the instance of the frame and we can change the all properties we want using frame.changes we wants
2)we can create the subclass of the JFrame
*/

    }
}

/**
 * MyFrame extends JFrame
 */
class MyFrame extends JFrame {

    MyFrame myFrame = new MyFrame();
    MyFrame(){
        
        this.setSize(420,420);//setes x and y dimenison of our frame.
        this.setTitle("JFrame titles gos here");//sets the titles of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out the application
        this.setResizable(true);// to resize the frame
        
        this.setVisible(true);//makes frame visible
        ImageIcon image=new ImageIcon("Logo.jpeg");//Create an image icon
        this.setIconImage(image.getImage());//change icon of the frame
        /* It is used for the default color
        frame.getContentPane().setBackground(Color.green);//Change color of the background
    
        For the custom color we must use the folowwing code snippet:-
        */
    
        this.getContentPane().setBackground(new Color(123,230,10));//change color of the background;we must enter the rgb value from 0 to 255 for all value:-(255,0,0) is red ;(0,255,0) is green and (0,0,255) is blue and (0,0,0) is black.We can also places color input in term of hexadecimal strating with the 0x along with 6digits in the following :-0x000000 is black and 0xFFFFFF is white.
    }
        
}

import javax.swing.*;
// import javax.awt.*;

public class A
{
	public static void main(String[] args) {
	    
	    JFrame frame = new JFrame();
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(500,700);
	   frame.setLocation(100,50);
	//     //Both can work together using method shown below;
	//     frame.setBound(100,100,1000,500);
	  frame.setTitle("My Frame");
	//     //Here,by default the icon of java will be dispplayed at the top left corner for changing it out we can so below things:
	//     ImageIcon icon=new ImageIcon("small_image.png");//we must put the path of the image 
	//     frame.setIconImage(icon.getImage());
	    
	//     //For changing background:for that we must change in the content pane of the JFrame
	//     Container c =frame.getConentPane();//Container is in awt package
	//     //Color color =new Color(255,0,0);//we can use it for defining or own colors
	//     c.setBackground(Color.Red);//It is for pre-defineed colored.
	    
	//     //we can resize the given window;but for stopping the user to it so we must write the following code;
	//     frame.setResizable(false);//For not allowing the user to resize we are writng false
	    
	    
	    
	    
	    
// 		System.out.println("Hello World");
	}
}

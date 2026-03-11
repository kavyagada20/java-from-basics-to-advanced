import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Loginevent extends JFrame implements ActionListener{
 
JFrame jf;
JLabel l1,l2;
JTextField tf1,ot;
JPasswordField tf2;
JButton b1,b2,b3;

Loginevent(){
    //create components
    jf = new JFrame("Login Test");
    tf1=new JTextField(10);
    l1=new JLabel("Username");
    ot =new JTextField(20);
    l2 = new JLabel("Password");
    tf2=new JPasswordField(10);
    b1=new JButton("Sumbit");
    b2=new JButton("Clear");
    b3=new JButton("Exit");
    //set Layout
    jf.setLayout(new FlowLayout());

    //add components on frame/window
    jf.add(l1);
    jf.add(tf1);
    jf.add(l1);
    jf.add(ot);
    jf.add(l2);
    jf.add(tf2);
    jf.add(b1);
    jf.add(b2);

    //register components which are causing events
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    jf.setSize(500,100);
    jf.setVisible(true);

}

public void actionPerformed (ActionEvent e){
    if(e.getSource()==b1){
        JOptionPane.showMessageDialog(jf, "succesful Login");
       
    }
    else if (e.getSource()==b2) {
        tf1.setText("");
        tf2.setText("");
        ot.setText("");
    }
    else if(e.getSource()==b3){
        System.exit(0);
    }
}

public static void main(String [] args){
    Loginevent x =new Loginevent();
}
}

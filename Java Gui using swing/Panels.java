import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        
        //JPanel=GUI COMPONENTS THAT FUCTIONS AS A CONTAINER TO HOLD OTHER COMPONENTS

        JPanel redpanel =new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel yellowpanel =new JPanel();
        yellowpanel.setBackground(Color.yellow);
        yellowpanel.setBounds(250,0,250,250);

        JPanel greenpanel =new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("thumpsup.jpeg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,75,75);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(yellowpanel);
        frame.add(greenpanel);

    }
}

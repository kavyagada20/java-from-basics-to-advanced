import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;


public class Buttons {
    public static void main(String[] args) {
        //JButtons= a button that performs an action when clicked on

        new MyFrame();

    }
}

 class MyFrame extends JFrame /*implements ActionListener*/{

    JButton button;

    /**
     * 
     */
    MyFrame(){

        ImageIcon icon = new ImageIcon("FingerpointingLeft.png");

        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(e -> System.out.println("poo"));//it's Lambda expression (More advanced concept with the less syntax).instead of the commented things
        button.setText("I m a Button");
        button.setFocusable(false);
        button.setIcon(icon);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);

    }

    // @Override
    // public void actionPerformed(ActionEvent e){
    //     if(e.getSource()==button){
    //         System.out.println("Poo");
    //     }
    // }

}

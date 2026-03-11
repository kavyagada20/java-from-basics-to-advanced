import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Form extends Jframe implements ActionListener{
    JLabel name,gen,interest,place,details;
    JTextField tname;
    JRadioButton male,female;
    JComboBox cplace;
    JButton sumbit,exit;
    JTextArea tadd;
    JCheckBox music,swim;
    ButtonGroup gengp;

    public Form(){
        setTitle("Form");
            setBound("200,80,800,800");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
        setLayout(null);

            name=new JLabel("Name");
            name.setFont(new Font("Arial",Font.PLAIN,15))
            name.setSize(100,20);
            name.setLocation(100,100);
            add(name);

            
            tname=new JTextField();
            tname.setFont(new Font("Arial",Font.PLAIN,15));
            name.setSize(190,20);
            name.setLocation(200,100);
            add(tname);

            gen=new JLabel();
            gen.setFont(new Font("Arial",Font.PLAIN,15));
            gen.setSize(100,20);
            gen.setLocation(100,150);
            add(gen);

            male=new JRadioButton("Male");
            male.setFont(new Font("Arial",Font.PLAIN,15));
            male.setSelected(true);
            male.setSize(80,20);
            male.setLocation(200,150);
            add(male);

            female=new JRadioButton("Female");
            female.setFont(new Font("Arial",Font.PLAIN,15));
            female.setSelected(true);
            female.setSize(80,20);
            female.setLocation(350,150);
            add(female);

            geng[ = new ButtonGroup();
            gengp.add(male);
            gengp.add(female);

            interest= new JLabel("Interest");
            interest.setFont(new Font("Arial",Font.PLAIN,15));
            interest.setSize(100,20);
            interest.setLocation(100,200);
            add(interest);



            ]



    }


}

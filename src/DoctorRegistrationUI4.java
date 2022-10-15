import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorRegistrationUI4 {
    /*  Name,phNo,email id,age,qualification,years of experience,
    */
    JTextField textField1, textField2, textField3,textField4,textField5,textField6;
    JLabel label,label1,label2,label3,label4,label5,label6;
    JButton button;
    public DoctorRegistrationUI4() {
        JFrame frame = new JFrame("Doctor Registration Page");
        label = new JLabel("Doctor's Registration");
        label.setBounds(30,00,400,40);
        frame.add(label);
        ///////////////////////////////////////////////////////////////////
        label1 = new JLabel("Name");
        label1.setBounds(30,50,200,20);
        frame.add(label1);
        //////////////////////////////////////////////////////////////////
        textField1 = new JTextField(20);
        textField1.setBounds(30,70,250,30);
        frame.add(textField1);
        //////////////////////////////////////////////////////////////////
        label2 = new JLabel("Email id");
        label2.setBounds(30,100,200,20);
        frame.add(label2);
        ////////////////////////////////////////////////////////////////
        textField2 = new JTextField(20);
        textField2.setBounds(30,120,250,30);
        frame.add(textField2);
        ///////////////////////////////////////////////////////////////////
        label3 = new JLabel("Phone number");
        label3.setBounds(30,150,200,20);
        frame.add(label3);
        //////////////////////////////////////////////////////////////////
        textField3 = new JTextField(20);
        textField3.setBounds(30,170,250,30);
        frame.add(textField3);
        ////////////////////////////////////////////////////////////////////
        label4 = new JLabel("Age");
        label4.setBounds(30,200,200,20);
        frame.add(label4);
        //////////////////////////////////////////////////////////////////
        textField4 = new JTextField(20);
        textField4.setBounds(30,220,250,30);
        frame.add(textField4);
        //////////////////////////////////////////////////////////////////
        label5 = new JLabel("Qualification");
        label5.setBounds(30,250,200,20);
        frame.add(label5);
        //////////////////////////////////////////////////////////////////
        textField5 = new JTextField(20);
        textField5.setBounds(30,270,250,30);
        frame.add(textField5);
        //////////////////////////////////////////////////////////////////
        label6 = new JLabel("Years of experience");
        label6.setBounds(30,300,200,20);
        frame.add(label6);
        //////////////////////////////////////////////////////////////////
        textField6 = new JTextField(20);
        textField6.setBounds(30,320,250,30);
        frame.add(textField6);
        /////////////////////////////////////////////////////////////////
        button = new JButton("REGISTER");
        button.setBounds(30,370,150,30);
        button.setBackground(Color.pink);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new FirstPage1();
            }
        });
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new FirstPage1();
            }
        });
        ///////////////////////////////////////////////////////////////////
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1080,1920);
    }

    public static void main(String[] args) {
        new DoctorRegistrationUI4();
    }
}



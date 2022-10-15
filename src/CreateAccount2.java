import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount2 {
    JTextField textField1, textField2, textField3,textField4;
    JLabel label,label1,label2,label3;
    JButton button;
    public CreateAccount2() {

        JFrame frame = new JFrame("Sign up page");
        label = new JLabel("CREATE ACCOUNT");
        label.setBounds(30,00,400,40);
        frame.add(label);
        ///////////////////////////////////////////////////////////////////
        label1 = new JLabel("Email id");
        label1.setBounds(30,50,200,20);
        frame.add(label1);
        //////////////////////////////////////////////////////////////////
        textField1 = new JTextField(20);
        textField1.setBounds(30,70,250,30);
        frame.add(textField1);
        //////////////////////////////////////////////////////////////////
        label2 = new JLabel("Password");
        label2.setBounds(30,100,200,20);
        frame.add(label2);
        ////////////////////////////////////////////////////////////////
        textField2 = new JTextField(20);
        textField2.setBounds(30,120,250,30);
        frame.add(textField2);
        ///////////////////////////////////////////////////////////////////
        label3 = new JLabel("Confirm Password");
        label3.setBounds(30,150,200,20);
        frame.add(label3);
        //////////////////////////////////////////////////////////////////
        textField3 = new JTextField(20);
        textField3.setBounds(30,170,250,30);
        frame.add(textField3);
        ////////////////////////////////////////////////////////////////////
        button = new JButton("Sign Up");
        button.setBounds(30,220,100,30);
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
                new SecondPage3();
            }
        });
        ///////////////////////////////////////////////////////////////////
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1080,1920);
    }

    public static void main(String[] args) {
        new CreateAccount2();
    }
}

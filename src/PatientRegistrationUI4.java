import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class PatientRegistrationUI4 {

    JTextField textField1, textField2, textField3,textField4,textField7;
    JLabel label,label1,label2,label3,label4,label5,label6,label7;
    JComboBox combo,combo2;
    String[] status,yn;
    JButton button;

    public PatientRegistrationUI4() {
        JFrame frame = new JFrame("Patient's Registration Page");
        status=new String[]{"Married","Unmarried"};
        yn=new String[]{"No","Yes"};
        label = new JLabel("Patient's Registration Form");
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
        label2 = new JLabel("Age");
        label2.setBounds(30,100,200,20);
        frame.add(label2);
        ////////////////////////////////////////////////////////////////
        textField2 = new JTextField(20);
        textField2.setBounds(30,120,250,30);
        frame.add(textField2);
        ///////////////////////////////////////////////////////////////////
        label3 = new JLabel("Contact number");
        label3.setBounds(30,150,200,20);
        frame.add(label3);
        //////////////////////////////////////////////////////////////////
        textField3 = new JTextField(20);
        textField3.setBounds(30,170,250,30);
        frame.add(textField3);
        ////////////////////////////////////////////////////////////////////
        label4 = new JLabel("Gender");
        label4.setBounds(30,200,200,20);
        frame.add(label4);
        //////////////////////////////////////////////////////////////////
        textField4 = new JTextField(20);
        textField4.setBounds(30,220,250,30);
        frame.add(textField4);
        //////////////////////////////////////////////////////////////////
        label5 = new JLabel("Marital Status");
        label5.setBounds(30,250,200,20);
        frame.add(label5);
        //////////////////////////////////////////////////////////////////
        combo = new JComboBox(status);
        combo.setBounds(30,270,200,30);
        combo.setBackground(Color.CYAN);
        combo.setForeground(Color.BLACK);
        frame.add(combo);
        //////////////////////////////////////////////////////////////////
        label6 = new JLabel("Taking any medications,currently?");
        label6.setBounds(30,300,200,20);
        frame.add(label6);
        //////////////////////////////////////////////////////////////////
        combo2=new JComboBox(yn);
        combo2.setBounds(30,320,200,30);
        combo2.setBackground(Color.CYAN);
        combo2.setForeground(Color.BLACK);
        frame.add(combo2);
        /////////////////////////////////////////////////////////////////
        label7 = new JLabel("Reason for seeing the doctor");
        label7.setBounds(30,350,200,20);
        frame.add(label7);
        ////////////////////////////////////////////////////////////////
        textField7 = new JTextField(50);
        textField7.setBounds(30,370,250,30);
        frame.add(textField7);
        ///////////////////////////////////////////////////////////////
        button = new JButton("REGISTER");
        button.setBounds(30,420,150,30);
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
        new PatientRegistrationUI4();
    }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PatientUI {
    JTextField textField1, textField2, textField3;
    JLabel label,label1,label2,label3,label4;
    JComboBox combo;
    String[] time;
    JButton button;

    public PatientUI(){
        JFrame frame = new JFrame("Patient's Info Page");
        time=new String[]{"9:00-10:00 AM","1:00-2:00 PM","5:00-6:00 PM","8:00-9:00 PM"};


        label1 = new JLabel("Problem facing");
        label1.setBounds(30,80,100,30);
        frame.add(label1);
        //////////////////////////////////////////////////////////////////
        textField1 = new JTextField(20);
        textField1.setBounds(300,80,300,30);
        frame.add(textField1);
        //////////////////////////////////////////////////////////////////
        label2 = new JLabel("Problem:since when");
        label2.setBounds(30,120,150,30);
        frame.add(label2);
        ////////////////////////////////////////////////////////////////
        textField2 = new JTextField(20);
        textField2.setBounds(300,120,300,30);
        frame.add(textField2);
        ///////////////////////////////////////////////////////////////////
        label3 = new JLabel("Kindly elaborate your problem");
        label3.setBounds(30,160,200,20);
        frame.add(label3);
        //////////////////////////////////////////////////////////////////
        textField3 = new JTextField(300);
        textField3.setBounds(300,160,400,30);
        frame.add(textField3);
        ////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////
        label4 = new JLabel("Choose time slot:");
        label4.setBounds(30,200,200,20);
        frame.add(label4);
        //////////////////////////////////////////////////////////////////
        combo = new JComboBox(time);
        combo.setBounds(30,220,200,30);
        combo.setBackground(Color.CYAN);
        combo.setForeground(Color.BLACK);
        frame.add(combo);
        //////////////////////////////////////////////////////////////////
        button = new JButton("SUBMIT");
        button.setBounds(30,300,150,30);
        button.setBackground(Color.pink);
        frame.add(button);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1080,1920);
    }

    public static void main(String[] args) {
        new PatientUI();
    }
}





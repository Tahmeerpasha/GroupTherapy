import javax.swing.*;
import java.awt.*;

public class DoctorUI {
    JTextArea textArea1,textArea2,textArea3;
    JLabel label,label1,label2,label3,label4,label5;
    JButton button1,button2;
    public DoctorUI() {
        JFrame frame = new JFrame("Doctor");
        ////////////////////////////////////////////////////
        label = new JLabel("Patient Details");
        label.setBounds(20,20,500,30);
        Font f2 = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        label.setFont(f2);
        frame.add(label);
        ///////////////////////////////////////////////////
        label1 = new JLabel("Patient 1:");
        label1.setBounds(20,80,100,30);
        frame.add(label1);
        ////////////////////////////////////////////////////
        textArea1 = new JTextArea("Hello");
        textArea1.setEditable(false);
        textArea1.setBounds(100,80,500,30);
        frame.add(textArea1);
        ////////////////////////////////////////////////////
        label2 = new JLabel("Patient 2:");
        label2.setBounds(20,130,100,30);
        frame.add(label2);
        ////////////////////////////////////////////////////
        textArea2 = new JTextArea("Hello");
        textArea2.setEditable(false);
        textArea2.setBounds(100,130,500,30);
        frame.add(textArea2);
        ////////////////////////////////////////////////////
        label3 = new JLabel("Patient 3:");
        label3.setBounds(20,180,100,30);
        frame.add(label3);
        ////////////////////////////////////////////////////
        textArea3= new JTextArea("Hello");
        textArea3.setEditable(false);
        textArea3.setBounds(100,180,500,30);
        frame.add(textArea3);
        ////////////////////////////////////////////////////
        label4 = new JLabel("Ways to connect with your patient");
        label4.setBounds(20,250,500,30);
        label4.setFont(f2);
        frame.add(label4);
        ////////////////////////////////////////////////////
        button1 = new JButton("Chat");
        button1.setBounds(50,350,500,30);
        frame.add(button1);
        ////////////////////////////////////////////////////
        label5 = new JLabel("OR");
        label5.setFont(f2);
        label5.setBounds(270,400,500,30);
        frame.add(label5);
        ////////////////////////////////////////////////////
        button2 = new JButton("Video conference");
        button2.setBounds(50,450,500,30);
        frame.add(button2);
        ////////////////////////////////////////////////////
        frame.setLayout(new BorderLayout());
        frame.setSize(1080,1920);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DoctorUI();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage3 {
    //Register as Patient or Doctor button page
    JButton button,button2;
    public SecondPage3(){
        JFrame f = new JFrame("Select Registration");
        ///////////////////////////////////////////////////////////////
        button = new JButton("Register as Doctor");
        button.setBounds(50,230,250,30);
        button.setBackground(Color.pink);
        f.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new DoctorRegistrationUI4();
            }
        });
        ///////////////////////////////////////////////
        button2 = new JButton("Register as patient");
        button2.setBounds(50,270,250,30);
        button2.setBackground(Color.pink);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new PatientRegistrationUI4();
            }
        });
        f.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new PatientRegistrationUI4();
            }
        });
        ///////////////////////////////////////////////////////////////////
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1080,1920);
    }

    public static void main(String[] args) {
        new SecondPage3();
    }
}



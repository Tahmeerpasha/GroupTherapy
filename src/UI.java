import javax.swing.*;
import java.awt.event.*;
public class UI implements ActionListener {
    JTextField textField, textField1;
    JLabel label;
    JButton button;
    UI(){
        JFrame f = new JFrame("Group Therapy App");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        //////////////////////////////////////////////////////////////////////////
        textField = new JTextField("Email id or Phone Number",20);
        textField.setBounds(150,100, 200,30);
        textField.addActionListener(this);
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("");
            }
        });
        f.add(textField);
        /////////////////////////////////////////////////////////////////////////
        textField1 = new JTextField("Password",20);
        textField1.setBounds(150,150, 200,30);
        textField1.addActionListener(this);
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText("");
            }
        });
        f.add(textField1);
        ////////////////////////////////////////////////////////////////////////
        label = new JLabel("LOGIN PAGE");
        label.setBounds(210,50,200,30);
        f.add(label);
        ///////////////////////////////////////////////////////////////////////
        button = new JButton("LOGIN");
        button.setBounds(200,200,100,30);
        button.addActionListener(this);
        f.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new UI3();
            }
        });
        /////////////////////////////////////////////////////////////////////
        f.setLayout(null);
        f.setSize(500,500);
    }
    public static void main(String[] args) {
         new UI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

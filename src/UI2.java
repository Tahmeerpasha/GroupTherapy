import javax.swing.*;

public class UI2 {
    public UI2() {
        JFrame frame = new JFrame("Registration Page");
        JLabel label = new JLabel("REGISTRATION PAGE");
        JTextField textField = new JTextField("Email id or Phone Number",20);
        textField.setBounds(100,50,100,20);
        JTextField textField1 = new JTextField("New Password",20);
        textField1.setBounds(100,100,100,20);
        JTextField textField2 = new JTextField("Confirm Password",20);
        textField2.setBounds(100,150,100,20);
        frame.add(label);
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UI2();
    }
}

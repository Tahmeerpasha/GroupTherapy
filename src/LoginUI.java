import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
public class LoginUI implements ActionListener {
    JTextField textField, textField1;
    JLabel label,label1,label2;
    JButton button;
    LoginUI(){
        JFrame f = new JFrame("Group Therapy App");
        //////////////////////////////////////////////////////////////////////////
        label = new JLabel("LOGIN PAGE");
        label.setBounds(30,50,200,30);
        Font  f2  = new Font(Font.DIALOG_INPUT,  Font.BOLD,20);
        label.setFont(f2);
        f.add(label);
        ////////////////////////////////////////////////////////////////////////
        label1 = new JLabel("Email id");
        label1.setBounds(30,100,200,30);
        f.add(label1);
        ////////////////////////////////////////////////////////////////////////
        textField = new JTextField(20);
        textField.setBounds(30,130, 200,30);
        f.add(textField);
        /////////////////////////////////////////////////////////////////////////
        label2 = new JLabel("Password");
        label2.setBounds(30,160,200,30);
        f.add(label2);
        ////////////////////////////////////////////////////////////////////////
        textField1 = new JTextField(20);
        textField1.setBounds(30,190, 200,30);
        f.add(textField1);
        ///////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////
        button = new JButton("LOGIN");
        button.setBounds(30,230,100,30);
        button.setBackground(Color.pink);
        f.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new HomePageUI();
            }
        });
        /////////////////////////////////////////////////////////////////////
        f.setLayout(new BorderLayout() );
        f.setVisible(true);
        f.setSize(1080,1920);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
         new LoginUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
    class RoundedJTextField extends JTextField {
        private Shape shape;
        public RoundedJTextField(int size) {
            super(size);
            setOpaque(false);
        }
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            super.paintComponent(g);
        }
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }
}

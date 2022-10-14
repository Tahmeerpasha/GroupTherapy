import javax.swing.*;

public class HomePageUI {
    HomePageUI(){
        JFrame f = new JFrame("Home Page");
        JLabel label = new JLabel("Hello Welcome to group therapy app");
        label.setBounds(10,50,50,20);
        f.add(label);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(1080,1920);

    }

    public static void main(String[] args) {
        new HomePageUI();
    }
}

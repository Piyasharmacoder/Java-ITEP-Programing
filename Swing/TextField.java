import javax.swing.*;

public class TextField {
    public static void main(String[] args) {
        JFrame fram = new JFrame();

        // label

        JLabel label = new JLabel("Name");
        label.setBounds(50, 100, 100, 30);
        fram.add(label);

        // text field start
        JTextField textfield = new JTextField();
        textfield.setBounds(100, 100, 300, 30);

        fram.add(textfield);
        // text field end

        fram.setSize(700, 500);
        fram.setLayout(null);
        fram.setVisible(true);
        fram.setLocation(350, 200);
    }
}

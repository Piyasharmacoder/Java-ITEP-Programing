import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button implements ActionListener {
    private JFrame fram = new JFrame();
    private JButton button;

    public void main() {
        // label
        JLabel label = new JLabel("Name");
        label.setBounds(50, 100, 100, 30);
        fram.add(label);

        // text field start
        JTextField textfield = new JTextField();
        textfield.setBounds(100, 100, 300, 30);
        fram.add(textfield);

        // button
        button = new JButton("Click");
        button.setFont(new Font("Raleway", Font.BOLD, 20));
        button.setBounds(200, 200, 100, 40);
        button.addActionListener(null);
        fram.add(button);

        fram.setSize(700, 500);
        fram.setLayout(null);
        fram.setVisible(true);
        fram.setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == button) {
            System.out.println("button call");
        }
    }

    public static void main(String[] args) {
        Button m = new Button();
        m.main();

    }
}

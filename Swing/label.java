import javax.swing.JFrame;
import javax.swing.JLabel;

public class label {
    public static void main(String[] args) {
        JFrame fram = new JFrame();

        // label start
        JLabel label1 = new JLabel("Hello World");
        label1.setBounds(50, 50, 100, 50);

        fram.add(label1);
        // label end

        fram.setSize(700, 500);
        fram.setLayout(null);
        fram.setVisible(true);
        fram.setLocation(350, 200);
    }
}

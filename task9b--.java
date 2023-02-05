import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task9b extends JFrame {
    private JButton button;
    private JLabel label;

    public task9b() {
        button = new JButton("Click Me");
        label = new JLabel("Waiting for input");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button);
        container.add(label);
        button.addActionListener(new ButtonListener());
        setSize(300, 100);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Button was clicked");
        }
    }

    public static void main(String[] args) {
        task9b app = new task9b();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

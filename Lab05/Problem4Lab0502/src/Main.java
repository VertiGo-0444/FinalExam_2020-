import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JPanel panel;

    public Main() {
        setTitle("First GUI project");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.RED);
        add(panel, BorderLayout.CENTER);

        JPanel toolbar = new JPanel();
        toolbar.setBackground(Color.DARK_GRAY);
        toolbar.setLayout(new FlowLayout());



        JButton redButton = new JButton("Red");
        redButton.addActionListener(e -> panel.setBackground(Color.RED));
        toolbar.add(redButton);


        JButton greenButton = new JButton("Green");
        greenButton.addActionListener(e -> panel.setBackground(Color.GREEN));
        toolbar.add(greenButton);


        JButton blueButton = new JButton("Blue");
        blueButton.addActionListener(e -> panel.setBackground(Color.BLUE));
        toolbar.add(blueButton);


        add(toolbar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

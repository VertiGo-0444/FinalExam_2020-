import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() throws HeadlessException{
        setTitle("First GUI App");
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        add(panel,BorderLayout.CENTER);

        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout());
        toolbar.setBackground(Color.DARK_GRAY);

 

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        toolbar.add(red);
        toolbar.add(green);
        toolbar.add(blue);

        add(toolbar,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

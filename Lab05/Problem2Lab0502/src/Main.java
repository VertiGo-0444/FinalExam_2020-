import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonActionListener implements ActionListener {
    private JPanel panel;
    private Color color;

    public ButtonActionListener(JPanel panel,Color color){
        this.panel = panel;
        this.color = color;
    }

    public void actionPerformed(ActionEvent e){
        panel.setBackground(color);
    }
}


public class Main extends JFrame {

    public Main() {
        setTitle("First GUI App");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        add(panel, BorderLayout.CENTER);

        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout());
        toolbar.setBackground(Color.DARK_GRAY);

        JButton red = new JButton("Red");
        red.addActionListener(new ButtonActionListener(panel, Color.RED));
        toolbar.add(red);

        JButton green = new JButton("Green");
        green.addActionListener(new ButtonActionListener(panel, Color.GREEN));
        toolbar.add(green);

        JButton blue = new JButton("Blue");
        blue.addActionListener(new ButtonActionListener(panel, Color.BLUE));
        toolbar.add(blue);

        add(toolbar, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

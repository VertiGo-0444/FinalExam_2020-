import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {
    class PanelMouseMotionListener implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {}

        @Override
        public void mouseMoved(MouseEvent e) {
            setTitle(e.getX() + "," + e.getY());
        }
    }


    private JPanel panel;

    public Main() {
        setTitle("First GUI project");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.addMouseMotionListener(new PanelMouseMotionListener());
        add(panel, BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

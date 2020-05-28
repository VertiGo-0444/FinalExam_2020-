import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    DrawPanel mainPanel = new DrawPanel();

    Main() {
        mainPanel.setBackground(Color.GRAY);
        add(mainPanel);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setTitle("Chessboard");
        app.setSize(500, 500);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int wRect = getWidth() / 8;
            int hRect = getHeight() / 8;
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    Color color = null;
                    if (r % 2 == 0) {
                        color = c % 2 == 0 ? Color.BLACK : Color.WHITE;
                    } else {
                        color = c % 2 == 0 ? Color.WHITE : Color.BLACK;
                    }

                    g.setColor(color);
                    g.fillRect(r * wRect, c * hRect, wRect, hRect);

                }
            }
        }
    }
}



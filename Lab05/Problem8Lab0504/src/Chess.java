import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Chess extends JFrame {
    private Container container;

    private JButton[][] squares = new JButton[8][8];

    private Color colorBlack = Color.BLACK;

    private int row = 7;
    private int col = 1;

    public Chess(){
        super("click");
        container = getContentPane();
        container.setLayout(new GridLayout(8,8));

        //ButtonHandler buttonHandler = new ButtonHandler();

        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                squares[i][j] = new JButton();
                if ((i+j) % 2 != 0){
                    squares[i][j].setBackground(colorBlack);
                }
                container.add(squares[i][j]);
                //squares[i][j].addActionListener(buttonHandler);
            }
        }

        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        

    }
    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();

            for(int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (source == squares[i][j]){
                        //processClick(i,j);
                        return;
                    }
                }
            }

        }
    }

    private void processClick(int i, int j){
        row = i;
        col = j;
    }

    public static void main(String[] args) {
        new Chess().setVisible(true);
    }

}

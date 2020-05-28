
public class GameModel {
    public static int HEIGHT = 8;
    public static int WIDTH = 8;

    private int row;
    private int col;

    public void moveUp() {
        if (col > 0) {
            col--;
        }
    }

    public void moveRight() {
        if (row + 1 < WIDTH) {
            row++;
        }
    }

    public void moveDown() {
        if (col + 1 < HEIGHT) {
            col++;
        }
    }

    public void moveLeft() {
        if (row > 0) {
            row--;
        }
    }

    @Override
    public String toString() {
        return String.format("Robot(%d, %d)",row,col);
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}

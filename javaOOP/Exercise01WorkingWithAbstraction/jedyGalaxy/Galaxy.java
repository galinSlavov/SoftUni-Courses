package Exercise01WorkingWithAbstraction.jedyGalaxy;

public class Galaxy {
    // instance of field
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void moveEvil(int row, int col) {
        while (row >= 0 && col >= 0) {
            if (this.field.isInBounds(row, col)) {
                this.field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
    }

    public long moveJedy(int row, int col){
        long starsCollected = 0;
        while (row >= 0 && col < this.field.getColLength(1)) {
            if (this.field.isInBounds(row, col)) {
                starsCollected += this.field.getValue(row, col);
            }

            col++;
            row--;
        }
        return starsCollected;
    }
}

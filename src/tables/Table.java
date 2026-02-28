package tables;

public class Table {
    private final int number;
    private boolean occupied;

    public Table(int number) {
        this.number = number;
    }

    /**
     * Резервирует столик, если он свободен.
     * @return true если удалось зарезервировать
     */
    public boolean reserve() {
        if (!occupied) {
            occupied = true;
            return true;
        }
        return false;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
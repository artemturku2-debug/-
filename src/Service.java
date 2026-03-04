import tables.Table;
import java.util.Scanner;

public class Service {
    {System.out.println("Дарова чёрт, где сядешь?");
    System.out.println();
    }
    public final Table[] tables;

    public Service() {
        this.tables = createTables();
    }
    public Table[] createTables() {
        Scanner sc = new Scanner(System.in);
        Table[] tables = new Table[10];
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(i + 1);
        }
        return tables;
    }
    Scanner sc = new Scanner(System.in);

    public boolean reserveTable(int tableNumber) {
        int tableNumber = sc.nextInt();

        if (tableNumber < 1 || tableNumber > tables.length) {
            System.out.println("Неверный номер столика. Введите число от 1 до " + tables.length);
            return false;
        }
        Table table = tables[tableNumber - 1];
        if (table.reserve()) {
            System.out.println("Столик " + tableNumber + " успешно забронирован!");
            return true;
        } else {
            System.out.println("Столик " + tableNumber + " уже занят. Выберите другой.");
            return false;
        }
    }
}
import tables.Table;
import dish.dish;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service {
    {System.out.println("Здрастье, где сядете?");
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
        int number;

        do {


            sc = new Scanner(System.in);
            number = sc.nextInt();
            {
                if (number < 1 || number > tables.length) {
                    System.out.println("Неверный номер столика. Введите число от 1 до " + tables.length);
                } else {
                    Table table = tables[number];
                    if (table.reserve()) {
                        System.out.println("Столик " + number + " успешно забронирован!");
                        System.out.println();


                    }
                }
            }
        }
            while (tables[number].reserve());
        return tables;
    }
    {
        System.out.println("Здраствуйте, вот меню");
        System.out.println("Напитки");
        for (Map.Entry<String, Double> entry : drinks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " руб.");
        }


    }
}
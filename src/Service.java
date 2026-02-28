import tables.Table;

import java.util.Scanner;

public class Service{
    Scanner sc = new Scanner(System.in);
    String hi = sc.nextLine();
    {System.out.println("Здравствуйте дорогой (на самом деле нет) гость, какой столик вы хотите зарезервировать?");
    }
    private final Table[] tables;

    public Service() {
        this.tables = createTables();
    }
    private Table[] createTables() {
        Table[] tables = new Table[10]; // После 10 выгоняем
        for (int i = 1; i < tables.length; i++) {
            tables[i] = new Table(i + 1);
        }
        return tables;
    }
    public boolean reserveTable(int tableNumber) {
        {System.out.println("Вот список свободных столов:");
        System.out.println("1 2 3 4 5 6 7 8 9 10 ");
        }

        int numb = sc.nextInt();
        if ((numb < 1) || (tableNumber > tables.length)) {
            {System.out.println("Такое место есть, проходите, (бл опять работать");}
            return false;
        }
        else {
        System.out.println("Мест нет, идите лесом");
        }
        return tables[tableNumber - 1].reserve();
    }

}



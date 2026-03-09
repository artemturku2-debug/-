import tables.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] comands = new int[1000];
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        if (sc.nextInt() == 1) {
            Service service = new Service();
        }
        else {
            System.out.println("Команды не существует.");
        }
        if (sc.nextInt() == 999) {
            Console console = new Console();
        }
        else {
            System.out.println("Команды нет");
        }

    }
}
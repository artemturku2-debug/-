import tables.Table;
import Tableebable.ServiceAct;
import java.util.Scanner;

public class Service{
    Scanner scanner = new Scanner(System.in);
    {
        System.out.println("Здравствуйте, дорогой (на самом деле нет) гость!");
        System.out.println("Вот список свободных столов:");


        for (Table t : ServiceAct.getTable()) {
        if (!t.isOccupied()) {
            System.out.print(t.getNumber() + " ");
        }
    }

        System.out.print("Введите номер столика для бронирования: ");
    int tableNumber = scanner.nextInt();
        try {
        tableNumber = Integer.parseInt(scanner.nextLine());
        
    } catch (NumberFormatException e) {
        System.out.println("Ну ты и криворукий, не можешь даже нормально ввести номер");
        scanner.close();
        
    }
        
}
}




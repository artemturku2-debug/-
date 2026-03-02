package order;
import java.util.Scanner;
public class order {
    String[] drinks = {"Молочко заура", "Пиво", "Вода", "Горящая вода", "Чай", "Мотай:這是我曾祖父納夫羅的精子。"};
    double DrinkPrice = 250;
    String[] first = {"Густое молочко заура", "Борщ", "Суп с креветками", "Солянка"};
    double FirstPrice = 300;//Без тракториста
    String[] second = {"Твердое молочко заура", "Пюрешка", "Макарошки", "Стейк"};
    double SecondPrice = 250;
    String[] salat = {"Цезарь", "Оливье", "Окрошка"};
    double salatPrice = 350;
    String[] dessert = {"Молочко заура с сахаром", "Мороженное", "Пироженное"};
    double dessertPrice = 200;

    {
        System.out.println("Здравствуйте, вот меню");
        System.out.println("НАПИТКИ");
        for (String cmd : drinks) {
            System.out.println(cmd + "  ");
        }
        System.out.println("   ПЕРВОЕ");
        for (String cmd : first) {
            System.out.println(cmd + "  ");
        }
        System.out.println("   ВТОРОЕ");
        for (String cmd : second) {
            System.out.println(cmd + "  ");
        }
        System.out.println("   САЛАТ");
        for (String cmd : salat) {
            System.out.println(cmd + "  ");
        }
        System.out.println("   ДЕССЕРТ");
        for (String cmd : dessert) {
            System.out.println(cmd + "  ");
        }
    }

    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();

    {
        System.out.println("Бухать буш?");
        String input = scanner.nextLine();
        boolean found = false;
        for (String cmd : drinks) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Такое можно");

        } else {
            System.out.println("Такое мы не пьём");
            DrinkPrice = 0;
        }
    }
    {
        System.out.print("Может хотите первое?");
        String input = scanner.nextLine();


        boolean found = false;
        for (String cmd : first) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Такое у нас есть");
            System.out.println("цена:" + FirstPrice);
        } else {
            System.out.println("Такого в меню нет");
            FirstPrice = 0;
        }

    }


    {
        System.out.print("А второе будете?");
        String input = scanner.nextLine();

        boolean found = false;
        for (String cmd : second) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Такое у нас есть");
            System.out.println("Заказ принят, ожидайте");
            System.out.println("цена:" + SecondPrice);
        } else {
            System.out.println("Такого в меню нет");
            SecondPrice = 0;
        }

    }

    {
        System.out.print("Может ещё салат?");
        String input = scanner.nextLine();

        boolean found = false;
        for (String cmd : salat) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Такое у нас есть");
        } else {
            System.out.println("Такого в меню нет");
            salatPrice = 0;
        }
        System.out.println("Заказ принят, ожидайте");
        System.out.println("цена:" + salatPrice);
    }

    {
        System.out.print("хотите сладкого?");
        String input = scanner.nextLine();

        boolean found = false;
        for (String cmd : dessert) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Такое у нас есть");
        } else {
            System.out.println("Такого в меню нет");
            dessertPrice = 0;
        }
        double sum = DrinkPrice + FirstPrice + SecondPrice + salatPrice + dessertPrice;
        System.out.println("Хм это всё? ну тогда...");
        if (sum == 0) {
            System.out.println("Проваливай бомжара");
        } else {
            System.out.println("Вот ваш чек:");
            System.out.println(sum);
            System.out.println("Заказ принят, ожидайте");
            System.out.println("Готовится заказ");
        }
    }
}

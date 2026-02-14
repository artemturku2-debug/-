import java.util.Scanner;
import java.util.ArrayList;
public class order {
    String[] drink = {"пиво", "Маотай: 我曾祖父納瓦羅的精子", "Молочко заура", "Вода", "Вода которую можно поджечь", " Коффе Java", "Чай"};
    double DrinkPrice = 500;// всё по 500
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
    }

    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();

    {
        System.out.print("Чего желаете испить?");
        String input = scanner.nextLine();

        boolean found = false;
        for (String cmd : drink) {
            if (cmd.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Такое у нас есть");
        } else {
            System.out.println("Такого в меню нет");
            DrinkPrice = 0;
        }
        System.out.println("Заказ принят, ожидайте");
        System.out.println("Готовится заказ");
        System.out.println("цена:" + DrinkPrice);
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
        } else {
            System.out.println("Такого в меню нет");
            FirstPrice = 0;
        }
        System.out.println("Заказ принят, ожидайте");
        System.out.println("Готовится заказ");
        System.out.println("цена:" + FirstPrice);
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
        } else {
            System.out.println("Такого в меню нет");
            SecondPrice = 0;
        }
        System.out.println("Заказ принят, ожидайте");
        System.out.println("Готовится заказ");
        System.out.println("цена:" + SecondPrice);
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
        System.out.println("Готовится заказ");
        System.out.println("цена:" + salatPrice );
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
        System.out.println("Заказ принят, ожидайте");
        System.out.println("Готовится заказ");
        System.out.println("цена:" + dessertPrice);
        System.out.println("Вот ваш чек:");
        System.out.println(DrinkPrice+FirstPrice+SecondPrice+dessertPrice+salatPrice);
    }
}
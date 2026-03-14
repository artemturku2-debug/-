import dish.dish;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1, если хотите, чтобы вас обслужили");
        System.out.println("Введите 2 для выхода");
        System.out.println("Для перехода в режим администратора введите пароль 123");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 123) {
            System.out.println("Приветствую администратора или того, кто додумался ввести 123");
            dish adminDish = new dish();
            DishAdder.addDishInteractive(adminDish);
        }
        else if (choice == 1) {
            Service service = new Service();
            dish clientDish = new dish();
            System.out.println("Теперь выберите столик:");
        }
        else if (choice == 2) {
            System.out.println("Программа закрыта");
        }
        else {
            System.out.println("Неверный ввод. Программа завершена.");
        }
    }
}
import dish.dish;
import java.util.HashMap;
import java.util.Scanner;

public class DishAdder {
    dish dish = new dish();
    public static boolean addDish(dish catalogue, String category, String dishName, double price) {
        HashMap<String, Double> targetMap = null;
        switch (category.toLowerCase()) {
            case "drinks":
                targetMap = catalogue.getDrinks();
                break;
            case "first":
                targetMap = catalogue.getFirst();
                break;
            case "second":
                targetMap = catalogue.getSecond();
                break;
            case "salad":
                targetMap = catalogue.getSalad();
                break;
            case "dessert":
                targetMap = catalogue.getDessert();
                break;
            default:
                System.out.println("Неизвестная категория: " + category);
                return false;
        }
        targetMap.put(dishName, price);
        System.out.println("Блюдо '" + dishName + "' добавлено в категорию " + category);
        return true;
    }

    public static void addDishInteractive(dish catalogue) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные категории: drinks, first, second, salad, dessert");
        System.out.print("Введите категорию: ");
        String category = scanner.nextLine().trim();

        System.out.print("Введите название блюда: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Название не может быть пустым.");
            return;
        }

        System.out.print("Введите цену (используйте точку как разделитель): ");
        String priceInput = scanner.nextLine().trim();
        double price;
        try {
            price = Double.parseDouble(priceInput);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: цена должна быть числом.");
            return;
        }

        boolean success = addDish(catalogue, category, name, price);
        if (success) {
            System.out.println("Блюдо успешно добавлено!");
        } else {
            System.out.println("Не удалось добавить блюдо. Проверьте категорию.");
        }
    }
}
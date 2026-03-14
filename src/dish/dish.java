package dish;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dish {
    private HashMap<String, Double> drinks;
    private HashMap<String, Double> first;
    private HashMap<String, Double> second;
    private HashMap<String, Double> salad;
    private HashMap<String, Double> dessert;
    public dish () {
        drinks= new HashMap<>();
        first= new HashMap<>();
        second = new HashMap<>();
        salad = new HashMap<>();
        dessert = new HashMap<>();

        initdrink();
        initfirt();
        initsecond ();
        initSalad();
        initdessert();
    }
    public void initdrink() {
        drinks.put("Вода", 50.0);
        drinks.put("Пиво", 250.0);
        drinks.put("Чай", 100.0);
        drinks.put("Кофе", 150.0);
        drinks.put("Молочко заура", 999.0);
    }
    public void initfirt() {
        first.put("Куриный суп", 300.99);
        first.put("Солянка", 350.99);
        first.put("Борщ", 250.99);
        first.put("Сгущёное молочко заура", 9999.99);
    }
    public void initsecond() {
        second.put("Картошка пюре", 250.99);
        second.put("Макороны", 275.99);
        second.put("Котлеты", 350.99);
        second.put("Макороны по флотски", 450.99);
    }
    public void initSalad() {
        salad.put("Цезарь", 350.99);
        salad.put("Оливье", 320.99);
        salad.put("Окрошка", 330.99);
    }
    public void initdessert() {
        dessert.put("Мороженое", 270.99);
        dessert.put("Пирожоное", 250.99);
        dessert.put("Мороженое: Du wirst an Diabetes sterben ", 350.99);
        dessert.put("Подлива заура", 245.99);

        System.out.println("МЕНЮ");

        System.out.println("--- Напитки ---");
        printMap(drinks);

        System.out.println("--- Первые блюда ---");
        printMap(first);

        System.out.println("--- Вторые блюда ---");
        printMap(second);

        System.out.println("--- Салаты ---");
        printMap(salad);

        System.out.println("--- Десерты ---");
        printMap(dessert);
    }

    // Вспомогательный метод для печати одной карты
    private void printMap(HashMap<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.printf("%s ----- %.2f руб.%n", entry.getKey(), entry.getValue());
        }
    }
    public HashMap<String, Double> getDrinks() {
        return drinks;
    }

    public HashMap<String, Double> getFirst() {
        return first;
    }

    public HashMap<String, Double> getSecond() {
        return second;
    }

    public HashMap<String, Double> getSalad() {
        return salad;
    }

    public HashMap<String, Double> getDessert() {
        return dessert;
    }
}
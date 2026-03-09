package dish;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class dish {
    HashMap<String, Double> drinks = new HashMap<>();

    {
        drinks.put("Вода", 50.0);
        drinks.put("Пиво", 250.0);
        drinks.put("Чай", 100.0);
        drinks.put("Кофе", 150.0);
        drinks.put("Молочко заура", 999.0);


    }
    HashMap<String, Double> first = new HashMap<>();
    {
        first.put("Куриный суп", 300.99);
        first.put("Солянка", 350.99);
        first.put("Борщ", 250.99);
        first.put("Сгущёное молочко заура", 9999.99 );
    }
    HashMap<String, Double> second = new HashMap<>();
    {
        second.put("Макароны", 250.99 );
        second.put("Пюре", 200.99);
        second.put("Доширак", 100.99);
        second.put("Котлеты", 150.99);
    }
    HashMap<String, Double> salad = new HashMap<>();
    {
        salad.put("Цезарь",350.99);
        salad.put("Окрошка", 290.99);
        salad.put("Листья",100.99);

    }
    HashMap<String, Double> desert = new HashMap<>();
    {
        desert.put("Мороженое", 200.99);
        desert.put("Шоколад", 199.99);
        desert.put("Булочка с маком", 150.99);

    }
}

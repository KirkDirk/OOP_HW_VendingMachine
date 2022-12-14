import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Создаем какой-то "продукт"
         */
        Products mineralWater = new Products("Минералка", 15.3);

        /**
         * Создаем и наполняем список товаров-продуктов
         */
        List<Products> drink = new ArrayList<>();
        drink.add(mineralWater);
        drink.add(new Products("Пиво",12));
        drink.add(new Products("Водка",1));

        /**
         * Создаем и выводим на экран торгамат
         */
        VendingMachine drinkMachine = new VendingMachine(drink);
        System.out.println(drinkMachine);
        System.out.println(drinkMachine.findByName("Водка"));
        System.out.println(drinkMachine.findByPrice(12));
        System.out.println(drinkMachine.findByPriceRange(13,16));

        /**
         * Создаем еще одну группу товаров "Крупы"
         */
        List<Products> groats = new ArrayList<>();
        groats.add(new Groats("Греча", 30, 0.9, "Высший"));
        groats.add(new Groats("Овёс", 5, 0.8, "Второй"));
        groats.add(new Groats("Полба", 3, 1, "Бомба!"));

        VendingMachine groatsMachine = new VendingMachine(groats);
        System.out.println(groatsMachine);
    }
}

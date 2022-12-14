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
        //goods.add(new Soda("kind", 19, "grapes"));

        /**
         * Создаем и выводим на экран торгамат
         */
        VendingMachine drinkMachine = new VendingMachine(drink);
        System.out.println(drinkMachine);
        System.out.println(drinkMachine.findByName("kind"));
        System.out.println(drinkMachine.findByPrice(12));
        System.out.println(drinkMachine.findByPriceRange(9,13));

        /**
         * Создаем еще одну группу товаров "Крупы"
         */
        List<Products> groats = new ArrayList<>();
        groats.add(new Products("Греча", 30));
        groats.add(new Products("Горох", 11));
        groats.add(new Products("Овёс", 30));
        VendingMachine groatsMachine = new VendingMachine(groats);
    }
}

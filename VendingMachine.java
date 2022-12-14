import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    /**
     * Объявляем список "продуктов"
     */
    private List<Products> productsList;

    /**
     * Создаем начальную коллекцию продуктов: вода по цене 1
     */
    private static List<Products> DEFAULT = new ArrayList<>(Arrays.asList(new Products("water", 1)));

    /**
     * Создаем торгамат и заполняем его начальной коллекцией "продуктов"
     * @param prod_list
     */
    public VendingMachine(List<Products> prod_list) {
        this.productsList = prod_list;
    }
    public VendingMachine() {
        this(DEFAULT); // вызов конструктора
    }

    /**
     * переопределеяем тустринг для вывода списка "продуктов"
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        productsList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    /**
     * Метод поиска "продукта" по наименованию
     * @param name
     * @return
     */
    public List<Products> findByName(String name) {
        return finder(p -> p.getName().equals(name));
    }
    /**
     * Метод поиска "продукта" по цене
     * @param price
     * @return
     */
    public List<Products> findByPrice(double price) {
        return finder(p -> p.getPrice()==price);
    }

    /**
     * Метод поиска "продукта" в диапазоне цен
     * @param p1
     * @param p2
     * @return
     */
    public List<Products> findByPriceRange(double p1, double p2) {
        return finder(p -> p.getPrice()<p2 && p.getPrice()>p1);
    }
    
    /**
     * Собсна поиск "продуктов" и возвращение найденного списка
     * @param f
     * @return
     */
    private List finder(Function<Products, Boolean> f){
        List<Products> result = new ArrayList<>();
        productsList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;  

}

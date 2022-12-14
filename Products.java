public class Products {
    /**
     * Параметры "продукта"
     */
    private String name;
    private double price;

    /**
     * Ввод "Продукта" с параметрами
     * @param name // Наименование "продукта"
     * @param price // Цена "продукта"
     */
    public Products(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }
    /**
     * Устанавливаем цену "продукта"
     * @param price2
     */
    private void setPrice(double price2) {
        this.price = price2;
    }
    /**
     * Устанавливаем наименование "продукта"
     * @param name2
     */
    private void setName(String name2) {
        this.name = name2;
    }
    /**
     * Возвращаем наименование "продукта"
     * @return
     */
    public String getName() {return name;}
    /**
     * Возвращаем цену продукта
     * @return
     */
    public double getPrice() {return price;}

    /**
     * Переопределяем тустринг для вывода параметров "продукта"
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s - %f", name, price);
    }
}

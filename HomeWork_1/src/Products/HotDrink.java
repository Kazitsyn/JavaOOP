package Products;

/**
 * Простой класс горячих напитков
 */
public class HotDrink extends Product{

    private int temperature;

    /**
     * Конструктор
     * @param name Наименование напитка
     * @param price Цена напитка
     * @param temperature Температура напитка
     */
    public HotDrink(String name, Double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    /**
     * Конструктор без цены и температуры
     * @param name Наименование напитка
     */
    public HotDrink(String name) {
        super(name);
    }

    /**
     * Получаем температуру
     * @return температура int
     */
    public int getT() {
        return temperature;
    }

    /**
     * Устанавливем температуру
     * @param t температура int
     */
    public void setT(int t) {
        this.temperature = t;
    }

    /**
     * Переводим информацию об экземпляре в виде строки
     * @return возвращаем строку HotDrink{name= '', cost= , t= }
     */
    @Override
    public String toString() {
        return "HotDrink{" +
                "name= '" + super.getName() + '\'' +
                ", cost= " + super.getPrice() +
                ", t= " + temperature +
                '}';
    }
}

package Classes;

/**
 * Класс обычного клиента
 */
public class OrdinaryClient extends Actor {
    /**
     * Конструктор
     * @param name имя клиента
     */
    public OrdinaryClient(String name)
    {
        super(name);
    }

    /**
     * Получить имя клиента
     * @return
     */
    @Override
    public String getName() {        
        return super.name;
    }

    /**
     * Получить ID
     * @return
     */
    @Override
    public int getId() {
        return -1;
    }

    /**
     * получить маркер заказа
     * @return
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * получить маркер получения заказа
     * @return
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * установить маркер заказа
     * @param makeOrder
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /**
     * установить маркер получения заказа
     * @param pickUpOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**
     * получить доступ к внутреним параметрам
     * @return
     */
    @Override
    public Actor getActor() {
        return this;
    }

    
}

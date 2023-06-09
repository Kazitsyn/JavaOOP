package Classes;

/**
 * Вип клиент
 */
public class SpecialClient extends Actor{
    private int idVIP;

    /**
     * Конструктор
     * @param name имя
     * @param idVIP вип ID
     */
    public SpecialClient(String name, int idVIP){
        super(name);
        if (idVIP > 9999){
            super.id = idVIP;
        }else {
            super.id = -1;
        }

    }

    /**
     * Получить имя
     * @return
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * получить ID для аналлиза принадлежности к акции
     * @return
     */
    public int getId() {
        return super.id;
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
     * получить доступ к параметрам клиента
     * @return
     */
    @Override
    public Actor getActor() {
        return this;
    }

    
}
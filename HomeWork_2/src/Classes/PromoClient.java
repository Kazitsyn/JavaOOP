package Classes;

/**
 * Класс акционного клиента
 */
public class PromoClient extends Actor{
    /**
     * счетчик ID купона
     */
    public static int promoId = 0;
//    private int promoNum;
    /**
     * промокод
     */
    private final String promoName = "SALE";

    /**
     * Конструтор
     * @param name имя клиента
     * @param promoName промокод
     */
    public PromoClient(String name, String promoName) {
        super(name);
        if(this.promoName == promoName){
            super.id = ++promoId;
        }else {
            super.id = 0;
        }
    }

    /**
     * получить значения счетчика ID купона
     * @return
     */
    public int getPromoId() {
        return promoId;
    }

    /**
     * получить промокод
     * @return
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * получить ID для аналлиза принадлежности к акции
     * @return
     */
    public int getId() {
        return super.id;
    }

    /**
     * Конструктор
     *
     * @param name имя
     */
    public PromoClient(String name) {
        super(name);
    }

    /**
     * получить имя
     * @return
     */
    @Override
    public String getName() {
        return super.name;
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

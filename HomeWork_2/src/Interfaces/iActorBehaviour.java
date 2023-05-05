package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * Установить маркер заказа
     * @param makeOrder
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Установить маркер получения заказа
     * @param pickUpOrder
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Получить маркер заказа
     * @return
     */
    boolean isMakeOrder();

    /**
     * Получить маркер получения заказа
     * @return
     */
    boolean isTakeOrder();

    /**
     * Получить доступ к информации клиента
     * @return
     */
    Actor getActor();

}

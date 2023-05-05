package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * метод становления клиента в очередь
     * @param actor
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * метод ухода клиента из очереди
     */
    void releaseFromQueue();

    /**
     * метод получения заказа
     */
    void takeOrder();

    /**
     * метод заказа
     */
    void giveOrder();
}

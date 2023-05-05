package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder {
    //private List<Actor> queue;
    /**
     * Лимит купонов
     */
    private int promoLimit = 5;
    /**
     * Логгер
     */
    private Logger logger;
    private List<iActorBehaviour> queue;

    /**
     * Конструктор магазина
     * @param logger логер
     */
    public Market(Logger logger) {
        this.logger = logger;
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Получить лимит купонов
     * @return
     */
    public int getPromoLimit() {
        return promoLimit;
    }

    /**
     * Установить лимит купонов
     * @param promoLimit
     */
    public void setPromoLimit(int promoLimit) {
        this.promoLimit = promoLimit;
    }

    /**
     * клиент пришел в магазин
     * @param actor
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
//        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        logger.info(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * клиент добавлен в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
//        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        logger.info(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * клиент ушел из магазина
     * @param actors
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
//            System.out.println(actor.getName()+" клиент ушел из магазина ");
            logger.info(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    /**
     * обновление магазина
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();

       releaseFromQueue();
    }

    /**
     * получить зказ
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                if (actor.getActor().id > 0 && actor.getActor().id < 10000){
                    if (actor.getActor().id > promoLimit){
                        actor.setTakeOrder(true);
//                        System.out.println(actor.getActor().getName()+" кол-во купонов выше лимита, клиент получил свой заказ без скидки ");
                        logger.info(actor.getActor().getName()+" кол-во купонов выше лимита, клиент получил свой заказ без скидки ");

                    }else{
                        actor.setTakeOrder(true);
//                        System.out.println(actor.getActor().getName()+" клиент получил свой заказ со скидкой по купону ");
                        logger.info(actor.getActor().getName()+" клиент получил свой заказ со скидкой по купону ");

                    }

                }else if (actor.getActor().id > 9999){
                    actor.setTakeOrder(true);
//                    System.out.println(actor.getActor().getName()+" клиент получил свой заказ c VIP привелегиями ");
                    logger.info(actor.getActor().getName()+" клиент получил свой заказ c VIP привелегиями ");

                }else {
                    actor.setTakeOrder(true);
//                    System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
                    logger.info(actor.getActor().getName()+" клиент получил свой заказ ");

                }
            }
        }
        
    }

    /**
     * клиент ушел из очереди
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
//            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            logger.info(actor.getActor().getName()+" клиент ушел из очереди ");

        }

       }
    releaseFromMarket(releaseActors);
    }


    /**
     * клиент сделал заказ
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
//                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
                logger.info(actor.getActor().getName()+" клиент сделал заказ ");


            }
        }
        
    }


    /**
     * Метод возврата товара
     */
    @Override
    public void returnOrder(iActorBehaviour actor) {
            if(!actor.isTakeOrder()){
                actor.setTakeOrder(true);
//                System.out.println(actor.getActor().getName()+" клиент вернул заказ ");
                logger.info(actor.getActor().getName()+" клиент вернул заказ ");

            }

    }

    /**
     * Возврат товара
     * @param actor
     */
    @Override
    public void returnUp(iActorBehaviour actor) {
        acceptToMarket(actor);
        returnOrder(actor);
        releaseFromQueue();
    }


}

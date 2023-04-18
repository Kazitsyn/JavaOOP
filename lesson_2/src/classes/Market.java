package classes;
import interfaces.*;

import java.util.ArrayList;
import java.util.List;



public class Market implements iMarketBehaviour, iQueueBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + "клиент пришел в магазин");
        this.queue.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + "клиент ушел в магазин");
            this.queue.remove(actor);
        }
    }


    @Override
    public void update() {


    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void giveOrder() {
        for (Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName()+"клиент получил заказ ");
            }
        }
    }
}
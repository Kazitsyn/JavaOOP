package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Метод добавления клиента
     * @param actor
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * метод ухода клиента
     * @param actors
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * обновление магазина
     */
    void update();    
}

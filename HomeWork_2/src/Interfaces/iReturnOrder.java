package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    /**
     * Метод возврата товара
     */
  void returnOrder(iActorBehaviour actor);
  void returnUp(iActorBehaviour actor);
}

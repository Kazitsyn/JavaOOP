package interfaces;

import classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}

package Classes;

import Interfaces.iActorBehaviour;

/**
 * Абстрактный класс клиента
 */
public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected int id;

    /**
     * Конструктор
     * @param name имя
     */
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract int getId();

}

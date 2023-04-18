package classes;
import interfaces.*;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

//    public boolean isMakeOrder(){
//        return this.isMakeOrder;
//    }
//    public void setTakeOrder(boolean makeOrder){
//        isMakeOrder = makeOrder;
//    }
}

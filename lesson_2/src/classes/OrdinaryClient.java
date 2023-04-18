package classes;

public class OrdinaryClient extends Actor{

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {

    }

    @Override
    public void setTakeOrder(boolean picUpOrder) {

    }

    @Override
    public boolean isMakeOrder() {

        return false;
    }


    @Override
    public void isTakeOrder() {

    }
}

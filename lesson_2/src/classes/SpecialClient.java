package classes;

public class SpecialClient extends Actor{
    private int idVip;
    public SpecialClient(String name, int id) {
        super(name);
        this.idVip = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVIP() {
        return this.idVip;
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

package ORP;

public class Bus extends Vehicle{

    public Bus(int maxSpeed) {
        super(maxSpeed);
        super.setType("Bus");
    }

    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    public String getType() {
        return super.getType();
    }
}

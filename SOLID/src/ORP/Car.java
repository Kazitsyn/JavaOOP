package ORP;

public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super(maxSpeed);
        super.setType("Car");
    }

    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    public String getType() {
        return super.getType();
    }
}

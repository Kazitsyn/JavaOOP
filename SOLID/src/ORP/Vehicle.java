package ORP;

public class Vehicle {
    private int maxSpeed;
    private String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void setType(String type) {
        this.type = type;
    }
}

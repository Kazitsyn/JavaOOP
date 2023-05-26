package ORP;

public class SpeedCalculation {
    public double calculateAllowedCase(Vehicle vehicle){
        if (vehicle.getType().equalsIgnoreCase("Car")){
            return vehicle.getMaxSpeed()*0.8;
        }else if (vehicle.getType().equalsIgnoreCase("Bus")){
            return vehicle.getMaxSpeed()*0.6;
        }
        return 0.0;
    }

}

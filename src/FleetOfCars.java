import java.util.ArrayList;

public class FleetOfCars {

    private final ArrayList<Car> fleet = new ArrayList<>();

    public FleetOfCars() {
    }

    void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalFee = 0;
        for (Car c:fleet) {
            totalFee += c.getRegistrationFee();
        }
        return totalFee;
    }

    @Override
    public String toString() {
        return "Fleet of cars: " + "\n" +
                fleet + "\n" +
                "Total registration fee for fleet: " + getTotalRegistrationFeeForFleet();
    }
}

public class ElectricCar extends ACar{
   private final int batteryCapacity;
   private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batterCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batterCapacity;
        this.maxRange = maxRange;
    }

    public int getBatterCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity * 1000 / maxRange;
    }

    public int getRegistrationFee(){
        int kmPrLitre = (int)Math.floor(100 / (getWhPrKm() / 91.25));
        if(kmPrLitre >= 20){
            return 330;
        } else if (kmPrLitre >= 15) {
            return 1050;
        } else if (kmPrLitre >= 10) {
            return 2340;
        } else if (kmPrLitre >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery capacity: " + batteryCapacity + ", Max range: " + maxRange +
                ", Wh/Km: " + getWhPrKm() + "\n";
    }
}

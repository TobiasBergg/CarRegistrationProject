public abstract class AFuelCar extends ACar{
    private final int kmPrLitre;
    private final String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.fuelType = fuelType;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    public String getFuelType() {
        return fuelType;
    }
}

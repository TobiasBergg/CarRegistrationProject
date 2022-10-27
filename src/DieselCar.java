public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, "Diesel");
        this.particleFilter = particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = super.getKmPrLitre();
        int fee = 0;
        if(kmPrLitre > 20 && kmPrLitre <= 50){
            fee = 460;
        }
        else if (kmPrLitre > 15 && kmPrLitre <=20) {
            fee = 2440;
        }
        else if (kmPrLitre > 10 && kmPrLitre <=15) {
            fee = 4190;
        }
        else if (kmPrLitre > 5 && kmPrLitre <=10) {
            fee = 8270;
        }
        else if (kmPrLitre <= 5) {
            fee = 25730;
        }
        if(!particleFilter){
            fee += 1000;
        }

        return fee;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString() + ", particleFilter: " + particleFilter + "\n";
    }
}

